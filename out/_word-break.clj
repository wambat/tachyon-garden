(clojure.core/ns
 styles._word-break
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.word-normal {"word-break" (clojure.core/str "normal")}]
 [:.word-wrap {"word-break" (clojure.core/str "break-all")}]
 [:.word-nowrap {"word-break" (clojure.core/str "keep-all")}])
