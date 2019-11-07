(clojure.core/ns
 styles._line-height
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.lh-solid {"line-height" (clojure.core/str "11")}]
 [:.lh-title {"line-height" (clojure.core/str "1.251.25")}]
 [:.lh-copy {"line-height" (clojure.core/str "1.51.5")}]
 [:.lh-solid-ns {"line-height" (clojure.core/str "11")}]
 [:.lh-title-ns {"line-height" (clojure.core/str "1.251.25")}]
 [:.lh-copy-ns {"line-height" (clojure.core/str "1.51.5")}]
 [:.lh-solid-m {"line-height" (clojure.core/str "11")}]
 [:.lh-title-m {"line-height" (clojure.core/str "1.251.25")}]
 [:.lh-copy-m {"line-height" (clojure.core/str "1.51.5")}]
 [:.lh-solid-l {"line-height" (clojure.core/str "11")}]
 [:.lh-title-l {"line-height" (clojure.core/str "1.251.25")}]
 [:.lh-copy-l {"line-height" (clojure.core/str "1.51.5")}])
