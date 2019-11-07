(clojure.core/ns
 styles._floats
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.fl nil]
 [:.fr nil]
 [:.fn {"float" (clojure.core/str "none")}]
 [:.fl-ns nil]
 [:.fr-ns nil]
 [:.fn-ns {"float" (clojure.core/str "none")}]
 [:.fl-m nil]
 [:.fr-m nil]
 [:.fn-m {"float" (clojure.core/str "none")}]
 [:.fl-l nil]
 [:.fr-l nil]
 [:.fn-l {"float" (clojure.core/str "none")}])
