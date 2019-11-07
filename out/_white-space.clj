(clojure.core/ns
 styles._white-space
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.ws-normal {"white-space" (clojure.core/str "normal")}]
 [:.nowrap {"white-space" (clojure.core/str "nowrap")}]
 [:.pre {"white-space" (clojure.core/str "pre")}]
 [:.ws-normal-ns {"white-space" (clojure.core/str "normal")}]
 [:.nowrap-ns {"white-space" (clojure.core/str "nowrap")}]
 [:.pre-ns {"white-space" (clojure.core/str "pre")}]
 [:.ws-normal-m {"white-space" (clojure.core/str "normal")}]
 [:.nowrap-m {"white-space" (clojure.core/str "nowrap")}]
 [:.pre-m {"white-space" (clojure.core/str "pre")}]
 [:.ws-normal-l {"white-space" (clojure.core/str "normal")}]
 [:.nowrap-l {"white-space" (clojure.core/str "nowrap")}]
 [:.pre-l {"white-space" (clojure.core/str "pre")}])
