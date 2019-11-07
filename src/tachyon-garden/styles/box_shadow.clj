(ns tachyon-garden.styles.box-shadow
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:shadow-1 {"box-shadow"
              (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-2 {"box-shadow"
              (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-3 {"box-shadow"
              (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-4 {"box-shadow"
              (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}
   :shadow-5 {"box-shadow"
              (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}
   :shadow-1-ns {"box-shadow"
                 (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-2-ns {"box-shadow"
                 (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-3-ns {"box-shadow"
                 (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-4-ns {"box-shadow"
                 (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}
   :shadow-5-ns {"box-shadow"
                 (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}
   :shadow-1-m {"box-shadow"
                (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-2-m {"box-shadow"
                (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-3-m {"box-shadow"
                (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-4-m {"box-shadow"
                (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}
   :shadow-5-m {"box-shadow"
                (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}
   :shadow-1-l {"box-shadow"
                (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-2-l {"box-shadow"
                (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-3-l {"box-shadow"
                (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba(0,0,0,0.2)")}
   :shadow-4-l {"box-shadow"
                (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}
   :shadow-5-l {"box-shadow"
                (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba(0,0,0,0.2)")}})

(defn box-shadow [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "shadow" (when value (str "-" (name value))))})))
