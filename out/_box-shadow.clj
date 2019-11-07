(clojure.core/ns
 styles._box-shadow
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.shadow-1
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-2
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba")}]
 [:.shadow-3
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-4
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba")}]
 [:.shadow-5
  {"box-shadow"
   (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba")}]
 [:.shadow-1-ns
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-2-ns
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba")}]
 [:.shadow-3-ns
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-4-ns
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba")}]
 [:.shadow-5-ns
  {"box-shadow"
   (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba")}]
 [:.shadow-1-m
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-2-m
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba")}]
 [:.shadow-3-m
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-4-m
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba")}]
 [:.shadow-5-m
  {"box-shadow"
   (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba")}]
 [:.shadow-1-l
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-2-l
  {"box-shadow"
   (clojure.core/str "0px" " " "0px" " " "8px" " " "2px" " " "rgba")}]
 [:.shadow-3-l
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "4px" " " "2px" " " "rgba")}]
 [:.shadow-4-l
  {"box-shadow"
   (clojure.core/str "2px" " " "2px" " " "8px" " " "0px" " " "rgba")}]
 [:.shadow-5-l
  {"box-shadow"
   (clojure.core/str "4px" " " "4px" " " "8px" " " "0px" " " "rgba")}])
