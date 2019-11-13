(ns tachyon-garden.styles.rotations
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:rotate-45     {"transform" (clojure.core/str "rotate( 45deg)")}
   :rotate-90     {"transform" (clojure.core/str "rotate( 90deg)")}
   :rotate-135    {"transform" (clojure.core/str "rotate(135deg)")}
   :rotate-180    {"transform" (clojure.core/str "rotate(180deg)")}
   :rotate-225    {"transform" (clojure.core/str "rotate(225deg)")}
   :rotate-270    {"transform" (clojure.core/str "rotate(270deg)")}
   :rotate-315    {"transform" (clojure.core/str "rotate(315deg)")}
   :rotate-45-ns  {"transform" (clojure.core/str "rotate( 45deg)")}
   :rotate-90-ns  {"transform" (clojure.core/str "rotate( 90deg)")}
   :rotate-135-ns {"transform" (clojure.core/str "rotate(135deg)")}
   :rotate-180-ns {"transform" (clojure.core/str "rotate(180deg)")}
   :rotate-225-ns {"transform" (clojure.core/str "rotate(225deg)")}
   :rotate-270-ns {"transform" (clojure.core/str "rotate(270deg)")}
   :rotate-315-ns {"transform" (clojure.core/str "rotate(315deg)")}
   :rotate-45-m   {"transform" (clojure.core/str "rotate( 45deg)")}
   :rotate-90-m   {"transform" (clojure.core/str "rotate( 90deg)")}
   :rotate-135-m  {"transform" (clojure.core/str "rotate(135deg)")}
   :rotate-180-m  {"transform" (clojure.core/str "rotate(180deg)")}
   :rotate-225-m  {"transform" (clojure.core/str "rotate(225deg)")}
   :rotate-270-m  {"transform" (clojure.core/str "rotate(270deg)")}
   :rotate-315-m  {"transform" (clojure.core/str "rotate(315deg)")}
   :rotate-45-l   {"transform" (clojure.core/str "rotate( 45deg)")}
   :rotate-90-l   {"transform" (clojure.core/str "rotate( 90deg)")}
   :rotate-135-l  {"transform" (clojure.core/str "rotate(135deg)")}
   :rotate-180-l  {"transform" (clojure.core/str "rotate(180deg)")}
   :rotate-225-l  {"transform" (clojure.core/str "rotate(225deg)")}
   :rotate-270-l  {"transform" (clojure.core/str "rotate(270deg)")}
   :rotate-315-l  {"transform" (clojure.core/str "rotate(315deg)")}}
  )
