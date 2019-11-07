(clojure.core/ns
 styles._tables
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.collapse
  {"border-collapse" (clojure.core/str "collapse"),
   "border-spacing" (clojure.core/str "00")}])
