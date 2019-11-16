(ns tachyon-garden.styles.images
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:img {:max-width "100%"}})
