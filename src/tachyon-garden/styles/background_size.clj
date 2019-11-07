(ns tachyon-garden.styles.background-size
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [breakpoint]]))

(defn background-size [{:keys [media value]}]
  (if media
    (at-media (breakpoint media)
              [:& {:background-size value}])
    [:& {:background-size value}]))
