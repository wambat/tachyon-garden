(ns tachyon-garden.styles.border-width
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:bw0 {"border-width" (clojure.core/str "00")}
   :bw1 {"border-width" (clojure.core/str ".125rem")}
   :bw2 {"border-width" (clojure.core/str ".25rem")}
   :bw3 {"border-width" (clojure.core/str ".5rem")}
   :bw4 {"border-width" (clojure.core/str "11" " " "rem")}
   :bw5 {"border-width" (clojure.core/str "22" " " "rem")}
   :bwtop-0 {"border-top-width" (clojure.core/str "00")}
   :bwright-0 {"border-right-width" (clojure.core/str "00")}
   :bwbottom-0 {"border-bottom-width" (clojure.core/str "00")}
   :bwleft-0 {"border-left-width" (clojure.core/str "00")}

   :bw0-ns {"border-width" (clojure.core/str "00")}
   :bw1-ns {"border-width" (clojure.core/str ".125rem")}
   :bw2-ns {"border-width" (clojure.core/str ".25rem")}
   :bw3-ns {"border-width" (clojure.core/str ".5rem")}
   :bw4-ns {"border-width" (clojure.core/str "11" " " "rem")}
   :bw5-ns {"border-width" (clojure.core/str "22" " " "rem")}
   :bwtop-0-ns {"border-top-width" (clojure.core/str "00")}
   :bwright-0-ns {"border-right-width" (clojure.core/str "00")}
   :bwbottom-0-ns {"border-bottom-width" (clojure.core/str "00")}
   :bwleft-0-ns {"border-left-width" (clojure.core/str "00")}

   :bw0-m {"border-width" (clojure.core/str "00")}
   :bw1-m {"border-width" (clojure.core/str ".125rem")}
   :bw2-m {"border-width" (clojure.core/str ".25rem")}
   :bw3-m {"border-width" (clojure.core/str ".5rem")}
   :bw4-m {"border-width" (clojure.core/str "11" " " "rem")}
   :bw5-m {"border-width" (clojure.core/str "22" " " "rem")}
   :bwtop-0-m {"border-top-width" (clojure.core/str "00")}
   :bwright-0-m {"border-right-width" (clojure.core/str "00")}
   :bwbottom-0-m {"border-bottom-width" (clojure.core/str "00")}
   :bwleft-0-m {"border-left-width" (clojure.core/str "00")}

   :bw0-l {"border-width" (clojure.core/str "00")}
   :bw1-l {"border-width" (clojure.core/str ".125rem")}
   :bw2-l {"border-width" (clojure.core/str ".25rem")}
   :bw3-l {"border-width" (clojure.core/str ".5rem")}
   :bw4-l {"border-width" (clojure.core/str "11" " " "rem")}
   :bw5-l {"border-width" (clojure.core/str "22" " " "rem")}
   :bwtop-0-l {"border-top-width" (clojure.core/str "00")}
   :bwright-0-l {"border-right-width" (clojure.core/str "00")}
   :bwbottom-0-l {"border-bottom-width" (clojure.core/str "00")}
   :bwleft-0-l {"border-left-width" (clojure.core/str "00")}}

  )

(defn border-width [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "bw" (when value (str "" (name value))))})))
