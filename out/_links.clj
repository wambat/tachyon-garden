(clojure.core/ns
 styles._links
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.link
  {"text-decoration" (clojure.core/str "none"),
   "transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
 [":.link:link"
  {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
 [":.link:visited"
  {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
 [":.link:hover"
  {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
 [":.link:active"
  {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in")}]
 [":.link:focus"
  {"transition" (clojure.core/str "color" " " ".15s" " " "ease-in"),
   "outline" (clojure.core/str "1px" " " "dotted" " " "currentColor")}])
