(def project 'tachyon-garden)
(def version "0.1.0-SNAPSHOT")

(set-env! :resource-paths #{"resources" "src"}
          :source-paths   #{"test"}
          ;; :checkouts '[[wambat/clj-antlr "0.2.7-SNAPSHOT"]]
          :dependencies   '[[org.clojure/clojure "RELEASE"]
                            [clj-antlr "0.2.5"] ;;Grammar parser
                            [org.antlr/antlr4 "4.7.2"]
                            [org.antlr/antlr4-runtime "4.7.2"]
                            [com.rpl/specter "1.1.1"]
                            [me.raynes/fs "1.4.6"]
                            [garden "1.3.9"]
                            [com.taoensso/timbre "4.10.0"]
                            ;;BOOT
                            [adzerk/boot-test "RELEASE" :scope "test"]
                            [samestep/boot-refresh "0.1.0" :scope "test"]
                            [adzerk/boot-reload        "0.6.0"      :scope "test"]
                            [pandeiro/boot-http        "0.8.3"      :scope "test"]
                            [org.martinklepsch/boot-garden "1.3.2-1" :scope "test"]
                            ])

(task-options!
 pom {:project     project
      :version     version
      :description "FIXME: write description"
      :url         "http://example/FIXME"
      :scm         {:url "https://github.com/wambat/tachyon-garden"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v20.html"}})

(require '[adzerk.boot-test :refer [test]]
         '[org.martinklepsch.boot-garden :refer [garden]]
         '[samestep.boot-refresh :refer [refresh]]
         '[adzerk.boot-reload    :refer [reload]]
         )

(deftask build
  "Build and install the project locally."
  []
  (comp (javac) (pom) (jar) (install)))

(deftask css-build []
  (comp (speak)
     ;; (cljs)
     (garden :styles-var 'tachyon-garden.styles.default/root
             :output-to "public/css/default.css")))

(deftask run []
  (comp
   (javac)
   ;; (serve :httpkit true
   ;;        :reload true
   ;;        :handler 'tachyon-garden.example/app-ring-handler)
   (watch)
   (refresh)
   ;; (cljs-devtools)
   ;; (dirac)
   ;; (cljs-repl)
   (reload)
   (css-build)))
