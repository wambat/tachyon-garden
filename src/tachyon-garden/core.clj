(ns tachyon-garden.core
  (:require [clj-antlr.coerce :as antlr.coerce]
            [com.rpl.specter :as sp]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [me.raynes.fs :as fs])
  (:import
   (lessparser LessLexer
               LessParser
               LessParserBaseListener)
   (java.lang ThreadLocal)
   (org.antlr.v4 Tool)
   (org.antlr.v4.tool LexerGrammar
                      Grammar)
   (org.antlr.v4.parse ANTLRParser)
   (org.antlr.v4.runtime CommonTokenStream
                         ANTLRInputStream
                         Lexer
                         LexerInterpreter
                         Parser
                         ParserInterpreter)
   (org.antlr.v4.runtime.tree ParseTree ParseTreeWalker)))

(defn info [s]
  nil)

(declare translate-selectors)

(defn sexpr-named? [name]
  (fn [sexpr]
    (when (seq? sexpr)
      (= (first sexpr)
         name))))
(defn unq [n]
  (if n
    (let [nn (str/replace n #"\'|\"|\.\.\/" "")]
      nn)
    ""))

(defn import-path [n]
  (symbol (str "styles."(unq n))))

(defn translate-imports [ss]
  (when-let [imports (sp/select [sp/ALL
                                 (sp/pred (sexpr-named? :statement))
                                 (sp/nthpath 1)
                                 (sp/pred (sexpr-named? :importDeclaration))]
                                ss)]
    `(:require
      [garden.def :refer [~(symbol "defstyles")]]
      [garden.stylesheet :refer [~(symbol "at-media")]]
      [garden.selectors :as ~(symbol "sel")]
      [garden.units :refer [~(symbol "px")]]
      ~@(let [paths (map (fn [i]
                           [(import-path
                             (first (sp/select [sp/ALL
                                                (sp/pred (sexpr-named? :referenceUrl))
                                                sp/LAST] i)))
                            :refer :all])
                       imports)]
        paths))))



(defn translate-not-selectors [ss]
  (map unq
       (translate-selectors
        (sp/select [sp/ALL
                    (sp/pred (sexpr-named? :selectors))]
                   ss))))

(defn make-identifier [parts]
  (cond
    (= 1 (count parts))
    (try
      (keyword (first parts))
      (catch Exception e
          (first parts)))

    (= 3 (count parts))
    (str (first parts)
         "["
         (last (second parts))
         "='"
         (last (last parts))
         "']")))

(defn translate-selector [ss]
  (info (str "TRANSLATE-SELECTOR:" ss))
  (let [chunks (map rest ss)]
    (loop [chunks chunks
           path []]
      (if (pos? (count chunks))
        (let [ch (ffirst chunks)]
          (info "CHUNK")
          (info (str "P:" path))
          (info (ffirst chunks))
          (info (first chunks))
          (cond
            (and
             (seq? ch)
             (= :identifier (first ch)))
            (recur
             (rest chunks)
             (conj path (make-identifier (rest ch))))

            (and
             (seq? ch)
             (= :pseudo (first ch)))
            (recur
             (rest chunks)
             (update-in path [(max 0 (- (count path) 1))] #(apply str % (rest ch))))

            (and
             (seq? ch)
             (= :negation (first ch)))
            (recur
             (rest chunks)
             (update-in path [(- (count path) 1)] #(apply str % ":not("
                                                          (str/join "," (translate-not-selectors
                                                                         (rest ch))) ")")))

            (and
             (seq? ch)
             (= :selectorPrefix (first ch)))
            (recur
             (rest chunks)
             (conj path (str (last ch)
                             " "
                             (last (last (first chunks))))))
            ))
        path))))

(defn fold-in-block [s block]
  (reduce (fn [acc i]
            (if (nil? acc)
                [i block]
                [i acc])
            ) nil (reverse s)))

(defn translate-selectors [ss]
  (info (str "Translating Selectors" ss "\n"))
  (let [forms (sp/select [sp/ALL
                          (sp/pred (sexpr-named? :selector))]
                         (first ss))]
    (info (str "=>FORMS:" forms "\n"))
    (map translate-selector
         (map rest forms))))

(defn translate-expression [ss]
  (info "EXPR")
  (info (map rest ss))
  (let [chunks (map rest ss)
        pimp (fn [i s]
               (if (= " !important" i)
                 [s i]
                 [s]))]
    (loop [chunks chunks
           props []]
      (if (pos? (count chunks))
        (let [ch (ffirst chunks)
              imp (last (first chunks))]
          (info "PROP")
          (info imp)
          (cond
            (string? ch)
            (recur
             (rest chunks)
             (conj props (unq ch)))
            (and
             (seq? ch)
             (= :identifier (first ch)))
            (recur
             (rest chunks)
             (conj props (pimp imp (last ch))))
            (and
             (seq? ch)
             (= :measurement (first ch)))
            (recur
             (rest chunks)
             (conj props (pimp imp
                               (str (second ch)
                                       (last ch)))))
            (and
             (seq? ch)
             (= :variableName (first ch)))
            (recur
             (rest chunks)
             (conj props (pimp imp (try (symbol (last ch))
                                        (catch Exception e
                                          (str "ERR>" (last ch)"<"))))))
            ))
        `(str ~@(flatten (interpose " " props))))))
  )

(defn translate-variables [ss]
  (when-let [declarations (sp/select [sp/ALL
                                      (sp/pred (sexpr-named? :statement))
                                      (sp/nthpath 1)
                                      (sp/pred (sexpr-named? :variableDeclaration))
                                      ]
                                     ss)]
    (info declarations)
    (map (fn [i]
           ;; (info i)
           (let [var (sp/select-first [sp/ALL
                                       (sp/pred (sexpr-named? :variableName))
                                       sp/LAST]
                                      i)
                 exp (rest (sp/select-first [sp/ALL
                                             (sp/pred (sexpr-named? :values))
                                             sp/LAST
                                             (sp/pred (sexpr-named? :commandStatement))]
                                            i))]
             `(def ~(symbol (unq var)) ~(translate-expression exp))))
         declarations)))

(defn translate-property [ss]
  (let [identifier (sp/select-first [sp/ALL
                                     (sp/pred (sexpr-named? :identifier))]
                                    ss)
        val (rest (sp/select-first [sp/ALL
                                    (sp/pred (sexpr-named? :values))
                                    sp/LAST
                                    (sp/pred (sexpr-named? :commandStatement))
                                    ]
                                   ss))
        ]
    {(last identifier) (translate-expression val)}))

(defn translate-block [ss]
  {:block :pock}
  ss
  (let [forms (sp/select [sp/ALL
                          (sp/pred (sexpr-named? :property))
                          ;; (sp/srange 1 999)
                          ]
                         ss)]
    (map translate-property forms)))

(defn make-defstyles [rulesets]
  ;; (clojure.pprint/pprint rulesets)
  `(~(symbol "defstyles") ~(symbol "root") ~@(apply concat rulesets)))

(defn translate-rulesets [ss]
  (when-let [declarations (sp/select [sp/ALL
                                      (sp/pred (sexpr-named? :statement))
                                      (sp/nthpath 1)
                                      (sp/pred (sexpr-named? :ruleset))]
                                     ss)]
    (make-defstyles
     (map (fn [i]
            (let [selectors (sp/select [sp/ALL
                                        (sp/pred (sexpr-named? :selectors))]
                                       i)
                  block (sp/select-first [sp/ALL
                                          (sp/pred (sexpr-named? :block))
                                          ]
                                         i)]
              ;; (info selectors)
              ;; (concat (translate-selectors selectors)
              ;;         )
              (let [tblock (apply merge (translate-block block))]
                (map #(fold-in-block % tblock) (translate-selectors selectors)))
              ))
          declarations))))

(defn translate-stylesheet
  [filename ss]
  (info ss)
  `((ns ~(symbol (str "styles."filename))
      ~(translate-imports (rest ss)))
    ~@(translate-variables (rest ss))
    ;;DEFSTYLES
    ;; ("I'm not working without this line")
    ~(translate-rulesets (rest ss))
    ))

(defn w [out s]
  (.write out s))



(defn parse-file-tree
  ([filename]
   (info (str filename
             ".less"))
   (let [output (atom {})
         ext ".less"
         is (ANTLRInputStream. (slurp (io/file filename)))
         lessLexer (LessLexer. is)
         tokenStream (CommonTokenStream. lessLexer)
         tokenParser (LessParser. tokenStream)
         stylesheet (.stylesheet tokenParser)]
     (antlr.coerce/tree->sexpr {:tree stylesheet
                                :parser tokenParser}))))

(defn relative-name [dir f]
  (let [dir (fs/file dir)
        rel-path (str/replace (fs/parent f)
                              (str dir) "")]
    (str/replace
     (str rel-path
          "/"
          (fs/name f))
     #"^\/" "")))

(defn less->clj [root filename]
  (let [rn (relative-name root filename)
        ns (str/replace rn #"\/" ".")]
    (info (str root
               ":"
               filename
               ":"
               ns))
    (translate-stylesheet ns (parse-file-tree filename))))

(defn get-files [dir]
  ;; fs/file
  (let [dir (fs/file dir)
        files (fs/find-files  dir #".*\.(css)")]
    files))

(defn fmt [src]
  (apply str
         (map
          #(with-out-str (clojure.pprint/pprint %))
          src)))

(defn process-tachyon [dir]
  (mapv
   (fn [i]
     (let [rn (relative-name dir i)
           outfile (str "out/" rn ".clj")
           clj (doall (less->clj dir i))]
       (clojure.java.io/make-parents outfile)
       (spit outfile
             (fmt clj))))
   (get-files dir)))

(comment

  (clojure.pprint/pprint a)
  (str (fs/file "resources/tachyons/src"))
  (process-tachyon "resources/tachyons/src")

  )
