(clojure.core/ns
 styles._lists
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles root [:.list {"list-style-type" (clojure.core/str "none")}])
