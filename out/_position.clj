(clojure.core/ns
 styles._position
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.static {"position" (clojure.core/str "static")}]
 [:.relative {"position" (clojure.core/str "relative")}]
 [:.absolute {"position" (clojure.core/str "absolute")}]
 [:.fixed {"position" (clojure.core/str "fixed")}]
 [:.static-ns {"position" (clojure.core/str "static")}]
 [:.relative-ns {"position" (clojure.core/str "relative")}]
 [:.absolute-ns {"position" (clojure.core/str "absolute")}]
 [:.fixed-ns {"position" (clojure.core/str "fixed")}]
 [:.static-m {"position" (clojure.core/str "static")}]
 [:.relative-m {"position" (clojure.core/str "relative")}]
 [:.absolute-m {"position" (clojure.core/str "absolute")}]
 [:.fixed-m {"position" (clojure.core/str "fixed")}]
 [:.static-l {"position" (clojure.core/str "static")}]
 [:.relative-l {"position" (clojure.core/str "relative")}]
 [:.absolute-l {"position" (clojure.core/str "absolute")}]
 [:.fixed-l {"position" (clojure.core/str "fixed")}])
