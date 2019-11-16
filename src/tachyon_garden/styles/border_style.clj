(ns tachyon-garden.styles.border-style
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:b--dotted {"border-style" (clojure.core/str "dotted")}
   :b--dashed {"border-style" (clojure.core/str "dashed")}
   :b--solid {"border-style" (clojure.core/str "solid")}
   :b--none {"border-style" (clojure.core/str "none")}
   :b--dotted-ns {"border-style" (clojure.core/str "dotted")}
   :b--dashed-ns {"border-style" (clojure.core/str "dashed")}
   :b--solid-ns {"border-style" (clojure.core/str "solid")}
   :b--none-ns {"border-style" (clojure.core/str "none")}
   :b--dotted-m {"border-style" (clojure.core/str "dotted")}
   :b--dashed-m {"border-style" (clojure.core/str "dashed")}
   :b--solid-m {"border-style" (clojure.core/str "solid")}
   :b--none-m {"border-style" (clojure.core/str "none")}
   :b--dotted-l {"border-style" (clojure.core/str "dotted")}
   :b--dashed-l {"border-style" (clojure.core/str "dashed")}
   :b--solid-l {"border-style" (clojure.core/str "solid")}
   :b--none-l {"border-style" (clojure.core/str "none")}})

(defn border-style [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "b" (when value (str "--" (name value))))})))
