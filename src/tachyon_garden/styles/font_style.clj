(ns tachyon-garden.styles.font-style
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:i {"font-style" (clojure.core/str "italic")}
   :fs-normal {"font-style" (clojure.core/str "normal")}
   :i-ns {"font-style" (clojure.core/str "italic")}
   :fs-normal-ns {"font-style" (clojure.core/str "normal")}
   :i-m {"font-style" (clojure.core/str "italic")}
   :fs-normal-m {"font-style" (clojure.core/str "normal")}
   :i-l {"font-style" (clojure.core/str "italic")}
   :fs-normal-l {"font-style" (clojure.core/str "normal")}})

(defn display [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "d" (when value (str "" (name value))))})))
