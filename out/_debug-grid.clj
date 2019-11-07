(clojure.core/ns
 styles._debug-grid
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.debug-grid nil]
 [:.debug-grid-16 nil]
 [:.debug-grid-8-solid nil]
 [:.debug-grid-16-solid nil])
