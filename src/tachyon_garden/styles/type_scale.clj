(ns tachyon-garden.styles.type-scale
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:f-6 {"font-size" (clojure.core/str "66" " " "rem")}
   :f-headline {"font-size" (clojure.core/str "66" " " "rem")}
   :f-5 {"font-size" (clojure.core/str "55" " " "rem")}
   :f-subheadline {"font-size" (clojure.core/str "55" " " "rem")}
   :f1 {"font-size" (clojure.core/str "33" " " "rem")}
   :f2 {"font-size" (clojure.core/str "2.252.25" " " "rem")}
   :f3 {"font-size" (clojure.core/str "1.51.5" " " "rem")}
   :f4 {"font-size" (clojure.core/str "1.251.25" " " "rem")}
   :f5 {"font-size" (clojure.core/str "11" " " "rem")}
   :f6 {"font-size" (clojure.core/str ".875rem")}
   :f7 {"font-size" (clojure.core/str ".75rem")}
   :f-6-ns {"font-size" (clojure.core/str "66" " " "rem")}
   :f-headline-ns {"font-size" (clojure.core/str "66" " " "rem")}
   :f-5-ns {"font-size" (clojure.core/str "55" " " "rem")}
   :f-subheadline-ns {"font-size" (clojure.core/str "55" " " "rem")}
   :f1-ns {"font-size" (clojure.core/str "33" " " "rem")}
   :f2-ns {"font-size" (clojure.core/str "2.252.25" " " "rem")}
   :f3-ns {"font-size" (clojure.core/str "1.51.5" " " "rem")}
   :f4-ns {"font-size" (clojure.core/str "1.251.25" " " "rem")}
   :f5-ns {"font-size" (clojure.core/str "11" " " "rem")}
   :f6-ns {"font-size" (clojure.core/str ".875rem")}
   :f7-ns {"font-size" (clojure.core/str ".75rem")}
   :f-6-m {"font-size" (clojure.core/str "66" " " "rem")}
   :f-headline-m {"font-size" (clojure.core/str "66" " " "rem")}
   :f-5-m {"font-size" (clojure.core/str "55" " " "rem")}
   :f-subheadline-m {"font-size" (clojure.core/str "55" " " "rem")}
   :f1-m {"font-size" (clojure.core/str "33" " " "rem")}
   :f2-m {"font-size" (clojure.core/str "2.252.25" " " "rem")}
   :f3-m {"font-size" (clojure.core/str "1.51.5" " " "rem")}
   :f4-m {"font-size" (clojure.core/str "1.251.25" " " "rem")}
   :f5-m {"font-size" (clojure.core/str "11" " " "rem")}
   :f6-m {"font-size" (clojure.core/str ".875rem")}
   :f7-m {"font-size" (clojure.core/str ".75rem")}
   :f-6-l {"font-size" (clojure.core/str "66" " " "rem")}
   :f-headline-l {"font-size" (clojure.core/str "66" " " "rem")}
   :f-5-l {"font-size" (clojure.core/str "55" " " "rem")}
   :f-subheadline-l {"font-size" (clojure.core/str "55" " " "rem")}
   :f1-l {"font-size" (clojure.core/str "33" " " "rem")}
   :f2-l {"font-size" (clojure.core/str "2.252.25" " " "rem")}
   :f3-l {"font-size" (clojure.core/str "1.51.5" " " "rem")}
   :f4-l {"font-size" (clojure.core/str "1.251.25" " " "rem")}
   :f5-l {"font-size" (clojure.core/str "11" " " "rem")}
   :f6-l {"font-size" (clojure.core/str ".875rem")}
   :f7-l {"font-size" (clojure.core/str ".75rem")}})
