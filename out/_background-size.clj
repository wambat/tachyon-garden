(clojure.core/ns
 styles._background-size
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.cover
  {"background-size" (clojure.core/str :identifierPart "important")}]
 [:.contain
  {"background-size" (clojure.core/str :identifierPart "important")}])
