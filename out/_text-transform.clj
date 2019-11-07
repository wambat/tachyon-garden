(clojure.core/ns
 styles._text-transform
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.ttc {"text-transform" (clojure.core/str "capitalize")}]
 [:.ttl {"text-transform" (clojure.core/str "lowercase")}]
 [:.ttu {"text-transform" (clojure.core/str "uppercase")}]
 [:.ttn {"text-transform" (clojure.core/str "none")}]
 [:.ttc-ns {"text-transform" (clojure.core/str "capitalize")}]
 [:.ttl-ns {"text-transform" (clojure.core/str "lowercase")}]
 [:.ttu-ns {"text-transform" (clojure.core/str "uppercase")}]
 [:.ttn-ns {"text-transform" (clojure.core/str "none")}]
 [:.ttc-m {"text-transform" (clojure.core/str "capitalize")}]
 [:.ttl-m {"text-transform" (clojure.core/str "lowercase")}]
 [:.ttu-m {"text-transform" (clojure.core/str "uppercase")}]
 [:.ttn-m {"text-transform" (clojure.core/str "none")}]
 [:.ttc-l {"text-transform" (clojure.core/str "capitalize")}]
 [:.ttl-l {"text-transform" (clojure.core/str "lowercase")}]
 [:.ttu-l {"text-transform" (clojure.core/str "uppercase")}]
 [:.ttn-l {"text-transform" (clojure.core/str "none")}])
