(ns tachyon-garden.styles.links
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:link [{"text-decoration" (clojure.core/str "none"),"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}
          [":link" {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
          [":visited" {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
          [":hover" {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
          [":active" {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
          [":focus" {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")
                     "outline" (clojure.core/str "1px" " " "dotted" " " "currentColor")}]]})
