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

(def styledefs
  {:cover { :background-size "cover!important" }
   :contain { :background-size "contain!important"}
   :cover-ns { :background-size "cover!important" }
   :contain-ns { :background-size "contain!important" }
   :cover-m { :background-size "cover!important" }
   :contain-m { :background-size "contain!important" }
   :cover-l { :background-size "cover!important" }
   :contain-l { :background-size "contain!important" }})
