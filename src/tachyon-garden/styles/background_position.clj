(ns tachyon-garden.styles.background-position
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:bg-center
   {"background-repeat" (clojure.core/str "no-repeat"),
    "background-position" (clojure.core/str "center" " " "center")}
   :bg-top
   {"background-repeat" (clojure.core/str "no-repeat"),
    "background-position" (clojure.core/str "top" " " "center")}
   :bg-right
   {"background-repeat" (clojure.core/str "no-repeat"),
    "background-position" (clojure.core/str "center" " " "right")}
   :bg-bottom
   {"background-repeat" (clojure.core/str "no-repeat"),
    "background-position" (clojure.core/str "bottom" " " "center")}
   :bg-left
   {"background-repeat" (clojure.core/str "no-repeat"),
    "background-position" (clojure.core/str "center" " " "left")}})

(defn background-position [{:keys [media value] :as params}]
  (with-media (merge params
                     {:value (str "bg-" (name value))})))
