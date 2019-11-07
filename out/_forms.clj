(clojure.core/ns
 styles._forms
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.input-reset
  {"-webkit-appearance" (clojure.core/str "none"),
   "-moz-appearance" (clojure.core/str "none")}]
 [":-moz-focus-inner"
  {"border" (clojure.core/str "00"),
   "padding" (clojure.core/str "00")}])
