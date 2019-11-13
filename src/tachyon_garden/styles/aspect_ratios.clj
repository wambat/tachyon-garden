(ns tachyon-garden.styles.aspect-ratios
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))


(def styledefs
  {:aspect-ratio
   {"height" (clojure.core/str "00"),
    "position" (clojure.core/str "relative")}
   :aspect-ratio--16x9 {"padding-bottom" "56.25%"}
   :aspect-ratio--9x16 {"padding-bottom" "177.77%"}
   :aspect-ratio--4x3  {"padding-bottom" "75%"}
   :aspect-ratio--3x4  {"padding-bottom" "133.33%"}
   :aspect-ratio--6x4  {"padding-bottom" "66.6%"}
   :aspect-ratio--4x6  {"padding-bottom" "150%"}
   :aspect-ratio--8x5  {"padding-bottom" "62.5%"}
   :aspect-ratio--5x8  {"padding-bottom" "160%"}
   :aspect-ratio--7x5  {"padding-bottom" "71.42%"}
   :aspect-ratio--5x7  {"padding-bottom" "140%"}
   :aspect-ratio--1x1  {"padding-bottom" "100%"}
   :aspect-ratio--object {"position" (clojure.core/str "absolute"),
                          "top" (clojure.core/str "00"),
                          "right" (clojure.core/str "00"),
                          "bottom" (clojure.core/str "00"),
                          "left" (clojure.core/str "00"),
                          "width" (clojure.core/str "100%"),
                          "height" (clojure.core/str "100%"),
                          "z-index" (clojure.core/str "100100")}

   :aspect-ratio-ns {:height 0
                     :position :relative}
   :aspect-ratio--16x9-ns {:padding-bottom "56.25%" }
   :aspect-ratio--9x16-ns {:padding-bottom "177.77%" }
   :aspect-ratio--4x3-ns {:padding-bottom "75%" }
   :aspect-ratio--3x4-ns {:padding-bottom "133.33%" }
   :aspect-ratio--6x4-ns {:padding-bottom "66.6%" }
   :aspect-ratio--4x6-ns {:padding-bottom "150%" }
   :aspect-ratio--8x5-ns {:padding-bottom "62.5%" }
   :aspect-ratio--5x8-ns {:padding-bottom "160%" }
   :aspect-ratio--7x5-ns {:padding-bottom "71.42%" }
   :aspect-ratio--5x7-ns {:padding-bottom "140%" }
   :aspect-ratio--1x1-ns {:padding-bottom "100%" }
   :aspect-ratio--object-ns {:position :absolute
                             :top 0
                             :right 0
                             :bottom 0
                             :left 0
                             :width "100%"
                             :height "100%"
                             :z-index 100}

   :aspect-ratio-m {:height 0
                    :position :relative}
   :aspect-ratio--16x9-m {:padding-bottom "56.25%" }
   :aspect-ratio--9x16-m {:padding-bottom "177.77%" }
   :aspect-ratio--4x3-m {:padding-bottom "75%" }
   :aspect-ratio--3x4-m {:padding-bottom "133.33%" }
   :aspect-ratio--6x4-m {:padding-bottom "66.6%" }
   :aspect-ratio--4x6-m {:padding-bottom "150%" }
   :aspect-ratio--8x5-m {:padding-bottom "62.5%" }
   :aspect-ratio--5x8-m {:padding-bottom "160%" }
   :aspect-ratio--7x5-m {:padding-bottom "71.42%" }
   :aspect-ratio--5x7-m {:padding-bottom "140%" }
   :aspect-ratio--1x1-m {:padding-bottom "100%" }
   :aspect-ratio--object-m {:position :absolute
                            :top 0
                            :right 0
                            :bottom 0
                            :left 0
                            :width "100%"
                            :height "100%"
                            :z-index 100}

   :aspect-ratio-l {:height 0
                    :position :relative}
   :aspect-ratio--16x9-l {:padding-bottom "56.25%" }
   :aspect-ratio--9x16-l {:padding-bottom "177.77%" }
   :aspect-ratio--4x3-l {:padding-bottom "75%" }
   :aspect-ratio--3x4-l {:padding-bottom "133.33%" }
   :aspect-ratio--6x4-l {:padding-bottom "66.6%" }
   :aspect-ratio--4x6-l {:padding-bottom "150%" }
   :aspect-ratio--8x5-l {:padding-bottom "62.5%" }
   :aspect-ratio--5x8-l {:padding-bottom "160%" }
   :aspect-ratio--7x5-l {:padding-bottom "71.42%" }
   :aspect-ratio--5x7-l {:padding-bottom "140%" }
   :aspect-ratio--1x1-l {:padding-bottom "100%" }
   :aspect-ratio--object-l {:position :absolute
                             :top 0
                             :right 0
                             :bottom 0
                             :left 0
                             :width "100%"
                             :height "100%"
                             :z-index 100}})

(defn aspect-ratio [{:keys [media value] :as params}]
  (with-media (merge params
                     {:value (str "aspect-ratio" (when value (str "--" (name value))))})))

(defn aspect-ratio-object [{:keys [media] :as params}]
  (with-media (merge params
                     {:value (str "aspect-ratio--object")})))
