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
                            [adzerk/boot-test "RELEASE" :scope "test"]])

(task-options!
 pom {:project     project
      :version     version
      :description "FIXME: write description"
      :url         "http://example/FIXME"
      :scm         {:url "https://github.com/wambat/tachyon-garden"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v20.html"}})

(deftask build
  "Build and install the project locally."
  []
  (comp (javac) (pom) (jar) (install)))

(require '[adzerk.boot-test :refer [test]])