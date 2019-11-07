(clojure.core/ns
 styles._visibility
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.clip
  {"position" (clojure.core/str "fixed"),
   "_position" (clojure.core/str "absolute"),
   "clip" (clojure.core/str "rect")}]
 [:.clip-ns
  {"position" (clojure.core/str "fixed"),
   "_position" (clojure.core/str "absolute"),
   "clip" (clojure.core/str "rect")}]
 [:.clip-m
  {"position" (clojure.core/str "fixed"),
   "_position" (clojure.core/str "absolute"),
   "clip" (clojure.core/str "rect")}]
 [:.clip-l
  {"position" (clojure.core/str "fixed"),
   "_position" (clojure.core/str "absolute"),
   "clip" (clojure.core/str "rect")}])
