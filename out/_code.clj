(clojure.core/ns
 styles._code
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.pre
  {"overflow-x" (clojure.core/str "auto"),
   "overflow-y" (clojure.core/str "hidden"),
   "overflow" (clojure.core/str "scroll")}])
