(ns tachyon-garden.styles.debug-children
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:debug-children [[" *" { :outline "1px solid gold"}]]
   :debug-children-white [[" *" {:outline "1px solid white"}]]
   :debug-children-black [[" *" {:outline "1px solid black" }]]})
