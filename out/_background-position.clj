(clojure.core/ns
 styles._background-position
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.bg-center
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "center")}]
 [:.bg-top
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "top" " " "center")}]
 [:.bg-right
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "right")}]
 [:.bg-bottom
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "bottom" " " "center")}]
 [:.bg-left
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "left")}]
 [:.bg-center-ns
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "center")}]
 [:.bg-top-ns
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "top" " " "center")}]
 [:.bg-right-ns
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "right")}]
 [:.bg-bottom-ns
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "bottom" " " "center")}]
 [:.bg-left-ns
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "left")}]
 [:.bg-center-m
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "center")}]
 [:.bg-top-m
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "top" " " "center")}]
 [:.bg-right-m
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "right")}]
 [:.bg-bottom-m
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "bottom" " " "center")}]
 [:.bg-left-m
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "left")}]
 [:.bg-center-l
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "center")}]
 [:.bg-top-l
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "top" " " "center")}]
 [:.bg-right-l
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "right")}]
 [:.bg-bottom-l
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "bottom" " " "center")}]
 [:.bg-left-l
  {"background-repeat" (clojure.core/str "no-repeat"),
   "background-position" (clojure.core/str "center" " " "left")}])
