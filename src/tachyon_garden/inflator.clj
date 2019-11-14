(ns tachyon-garden.inflator
  (:require
   [taoensso.timbre :refer [refer-timbre]]
   [clojure.java.io :as io]
            [clojure.string :as str]
            [garden.stylesheet :refer [at-media]]
            [tachyon-garden.styles.nested :as nested]
            [tachyon-garden.styles.vertical-align :as vertical-align]
            [tachyon-garden.styles.media-queries :refer [with-media breakpoint]]))

(refer-timbre)

(defn infer-media [nm]
  (let [bps {:ns :not-small
             :m :medium
             :l :large}
        bps-keys (str/join "|" (map #(str "-" (name %)) (keys bps)))
        n (name nm)
        [d root media] (re-matches (re-pattern (str "(.*)(" bps-keys ")$")) n)
        m (when media (get bps (keyword (str/replace media #"-" ""))))]
    (if m
      [root m]
      [n nil])))

(defn expand-arr-info [cls params]
  (info [:EAI cls params])
  (assert (vector? params))
  (let [[cls2 inf] params]
    (if (vector? cls2)
      (map #(first (expand-arr-info cls [% inf])) cls2)
      [[(str "&" (name cls2)) inf]])))

(defn expand-info [cls inf]
  (apply concat
         (cond
           (map? inf)
           [[:& inf]]
           (vector? inf)
           (map #(expand-arr-info cls %) inf)
           :else "err")))

(defn inflate-style [nm inf]
  (let [[cls media] (infer-media nm)]
    (if media
      [nm (at-media (breakpoint media)
                    (expand-info cls inf))]
      [nm
       (expand-info cls inf)])))

(defn inflate-styles [s]
  (map (fn [[nm inf]]
         (inflate-style nm inf)) (seq s)))

(defn ->def [[nm body]]
  (info "->DEF" nm body)
  `(defn ~(symbol (name nm))
     []
     ~(vec body)))

(defmacro ->defsigs [sigs]
  (info [:SIGS (var-get (resolve sigs))])
  (let [codes (map ->def (inflate-styles (var-get (resolve sigs))))]
    (info [:CODES codes])
    `(do
       ~@codes)))

(comment
  (inflate-styles nested/styledefs)

  (inflate-styles vertical-align/styledefs)

  (inflate-style :v-top-m {"vertical-align" "top"})
  (inflate-style :v-topm {"vertical-align" "top"})

  (infer-breakpoint :v-top-m)
  (infer-breakpoint :v-top-sm)

  (->defsigs nested/styledefs)

  (nested-links)

  (macroexpand-1
   (->defsigs nested/styledefs))

  )
