(clojure.core/ns
 styles._font-style
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.i {"font-style" (clojure.core/str "italic")}]
 [:.fs-normal {"font-style" (clojure.core/str "normal")}]
 [:.i-ns {"font-style" (clojure.core/str "italic")}]
 [:.fs-normal-ns {"font-style" (clojure.core/str "normal")}]
 [:.i-m {"font-style" (clojure.core/str "italic")}]
 [:.fs-normal-m {"font-style" (clojure.core/str "normal")}]
 [:.i-l {"font-style" (clojure.core/str "italic")}]
 [:.fs-normal-l {"font-style" (clojure.core/str "normal")}])
