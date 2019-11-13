(ns tachyon-garden.styles.z-index
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:z-0       {"z-index" (clojure.core/str "0")}
   :z-1       {"z-index" (clojure.core/str "1")}
   :z-2       {"z-index" (clojure.core/str "2")}
   :z-3       {"z-index" (clojure.core/str "3")}
   :z-4       {"z-index" (clojure.core/str "4")}
   :z-5       {"z-index" (clojure.core/str "5")}
   :z-999     {"z-index" (clojure.core/str "999")}
   :z-9999    {"z-index" (clojure.core/str "9999")}
   :z-max     {"z-index" (clojure.core/str "2147483647")}
   :z-inherit {"z-index" (clojure.core/str "inherit")}
   :z-initial {"z-index" (clojure.core/str "initial")}
   :z-unset   {"z-index" (clojure.core/str "unset")}})
