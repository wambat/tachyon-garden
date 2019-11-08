(ns tachyon-garden.styles.floats
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:fl    {:float :left :_display: "inline"}
   :fr    {:float :right :_display: "inline"}
   :fn    {:float :none}
   :fl-ns {:float :left  :_display: "inline"}
   :fr-ns {:float :right :_display: "inline"}
   :fn-ns {:float :none}
   :fl-m  {:float :left :_display: "inline"}
   :fr-m  {:float :right :_display: "inline"}
   :fn-m  {:float :none}
   :fl-l  {:float :left :_display: "inline"}
   :fr-l  {:float :right :_display: "inline"}
   :fn-l  {:float :none}})

(defn display [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "d" (when value (str "" (name value))))})))
