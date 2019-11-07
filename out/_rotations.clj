(clojure.core/ns
 styles._rotations
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.rotate-45 {"transform" (clojure.core/str "rotate")}]
 [:.rotate-90 {"transform" (clojure.core/str "rotate")}]
 [:.rotate-135 {"transform" (clojure.core/str "rotate")}]
 [:.rotate-180 {"transform" (clojure.core/str "rotate")}]
 [:.rotate-225 {"transform" (clojure.core/str "rotate")}]
 [:.rotate-270 {"transform" (clojure.core/str "rotate")}]
 [:.rotate-315 {"transform" (clojure.core/str "rotate")}]
 [:.rotate-45-ns {"transform" (clojure.core/str "rotate")}]
 [:.rotate-90-ns {"transform" (clojure.core/str "rotate")}]
 [:.rotate-135-ns {"transform" (clojure.core/str "rotate")}]
 [:.rotate-180-ns {"transform" (clojure.core/str "rotate")}]
 [:.rotate-225-ns {"transform" (clojure.core/str "rotate")}]
 [:.rotate-270-ns {"transform" (clojure.core/str "rotate")}]
 [:.rotate-315-ns {"transform" (clojure.core/str "rotate")}]
 [:.rotate-45-m {"transform" (clojure.core/str "rotate")}]
 [:.rotate-90-m {"transform" (clojure.core/str "rotate")}]
 [:.rotate-135-m {"transform" (clojure.core/str "rotate")}]
 [:.rotate-180-m {"transform" (clojure.core/str "rotate")}]
 [:.rotate-225-m {"transform" (clojure.core/str "rotate")}]
 [:.rotate-270-m {"transform" (clojure.core/str "rotate")}]
 [:.rotate-315-m {"transform" (clojure.core/str "rotate")}]
 [:.rotate-45-l {"transform" (clojure.core/str "rotate")}]
 [:.rotate-90-l {"transform" (clojure.core/str "rotate")}]
 [:.rotate-135-l {"transform" (clojure.core/str "rotate")}]
 [:.rotate-180-l {"transform" (clojure.core/str "rotate")}]
 [:.rotate-225-l {"transform" (clojure.core/str "rotate")}]
 [:.rotate-270-l {"transform" (clojure.core/str "rotate")}]
 [:.rotate-315-l {"transform" (clojure.core/str "rotate")}])
