(clojure.core/ns
 styles._z-index
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.z-0 {"z-index" (clojure.core/str "00")}]
 [:.z-1 {"z-index" (clojure.core/str "11")}]
 [:.z-2 {"z-index" (clojure.core/str "22")}]
 [:.z-3 {"z-index" (clojure.core/str "33")}]
 [:.z-4 {"z-index" (clojure.core/str "44")}]
 [:.z-5 {"z-index" (clojure.core/str "55")}]
 [:.z-999 {"z-index" (clojure.core/str "999999")}]
 [:.z-9999 {"z-index" (clojure.core/str "99999999")}]
 [:.z-max {"z-index" (clojure.core/str "21474836472147483647")}]
 [:.z-inherit {"z-index" (clojure.core/str "inherit")}]
 [:.z-initial {"z-index" (clojure.core/str "initial")}]
 [:.z-unset {"z-index" (clojure.core/str "unset")}])
