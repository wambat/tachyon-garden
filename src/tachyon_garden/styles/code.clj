(ns tachyon-garden.styles.code
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:pre {"overflow-x" (clojure.core/str "auto")
         "overflow-y" (clojure.core/str "hidden")
         "overflow" (clojure.core/str "scroll")}})
