(clojure.core/ns
 styles._aspect-ratios
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.aspect-ratio
  {"height" (clojure.core/str "00"),
   "position" (clojure.core/str "relative")}]
 [:.aspect-ratio--16x9 {"padding-bottom" (clojure.core/str "56.25%")}]
 [:.aspect-ratio--9x16 {"padding-bottom" (clojure.core/str "177.77%")}]
 [:.aspect-ratio--4x3 {"padding-bottom" (clojure.core/str "75%")}]
 [:.aspect-ratio--3x4 {"padding-bottom" (clojure.core/str "133.33%")}]
 [:.aspect-ratio--6x4 {"padding-bottom" (clojure.core/str "66.6%")}]
 [:.aspect-ratio--4x6 {"padding-bottom" (clojure.core/str "150%")}]
 [:.aspect-ratio--8x5 {"padding-bottom" (clojure.core/str "62.5%")}]
 [:.aspect-ratio--5x8 {"padding-bottom" (clojure.core/str "160%")}]
 [:.aspect-ratio--7x5 {"padding-bottom" (clojure.core/str "71.42%")}]
 [:.aspect-ratio--5x7 {"padding-bottom" (clojure.core/str "140%")}]
 [:.aspect-ratio--1x1 {"padding-bottom" (clojure.core/str "100%")}]
 [:.aspect-ratio--object
  {"position" (clojure.core/str "absolute"),
   "top" (clojure.core/str "00"),
   "right" (clojure.core/str "00"),
   "bottom" (clojure.core/str "00"),
   "left" (clojure.core/str "00"),
   "width" (clojure.core/str "100%"),
   "height" (clojure.core/str "100%"),
   "z-index" (clojure.core/str "100100")}])
