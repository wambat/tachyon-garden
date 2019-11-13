(ns tachyon-garden.styles.outlines
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:outline {"outline" (clojure.core/str "1px" " " "solid")}
   :outline-transparent {"outline" (clojure.core/str "1px" " " "solid" " " "transparent")}
   :outline-0 {"outline" (clojure.core/str "00")}
   :outline-ns {"outline" (clojure.core/str "1px" " " "solid")}
   :outline-transparent-ns {"outline" (clojure.core/str "1px" " " "solid" " " "transparent")}
   :outline-0-ns {"outline" (clojure.core/str "00")}
   :outline-m {"outline" (clojure.core/str "1px" " " "solid")}
   :outline-transparent-m {"outline" (clojure.core/str "1px" " " "solid" " " "transparent")}
   :outline-0-m {"outline" (clojure.core/str "00")}
   :outline-l {"outline" (clojure.core/str "1px" " " "solid")}
   :outline-transparent-l {"outline" (clojure.core/str "1px" " " "solid" " " "transparent")}
   :outline-0-l {"outline" (clojure.core/str "00")}})

(defn background-position [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "outline" (when value (str "--" (name value))))})))
