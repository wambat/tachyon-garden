(clojure.core/ns
 styles._opacity
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.o-100 {"opacity" (clojure.core/str "11")}]
 [:.o-90 {"opacity" (clojure.core/str ".9")}]
 [:.o-80 {"opacity" (clojure.core/str ".8")}]
 [:.o-70 {"opacity" (clojure.core/str ".7")}]
 [:.o-60 {"opacity" (clojure.core/str ".6")}]
 [:.o-50 {"opacity" (clojure.core/str ".5")}]
 [:.o-40 {"opacity" (clojure.core/str ".4")}]
 [:.o-30 {"opacity" (clojure.core/str ".3")}]
 [:.o-20 {"opacity" (clojure.core/str ".2")}]
 [:.o-10 {"opacity" (clojure.core/str ".1")}]
 [:.o-05 {"opacity" (clojure.core/str ".05")}]
 [:.o-025 {"opacity" (clojure.core/str ".025")}]
 [:.o-0 {"opacity" (clojure.core/str "00")}])
