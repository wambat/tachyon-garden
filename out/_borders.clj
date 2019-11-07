(clojure.core/ns
 styles._borders
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.ba
  {"border-style" (clojure.core/str "solid"),
   "border-width" (clojure.core/str "1px")}]
 [:.bt
  {"border-top-style" (clojure.core/str "solid"),
   "border-top-width" (clojure.core/str "1px")}]
 [:.br
  {"border-right-style" (clojure.core/str "solid"),
   "border-right-width" (clojure.core/str "1px")}]
 [:.bb
  {"border-bottom-style" (clojure.core/str "solid"),
   "border-bottom-width" (clojure.core/str "1px")}]
 [:.bl
  {"border-left-style" (clojure.core/str "solid"),
   "border-left-width" (clojure.core/str "1px")}]
 [:.bn
  {"border-style" (clojure.core/str "none"),
   "border-width" (clojure.core/str "00")}]
 [:.ba-ns
  {"border-style" (clojure.core/str "solid"),
   "border-width" (clojure.core/str "1px")}]
 [:.bt-ns
  {"border-top-style" (clojure.core/str "solid"),
   "border-top-width" (clojure.core/str "1px")}]
 [:.br-ns
  {"border-right-style" (clojure.core/str "solid"),
   "border-right-width" (clojure.core/str "1px")}]
 [:.bb-ns
  {"border-bottom-style" (clojure.core/str "solid"),
   "border-bottom-width" (clojure.core/str "1px")}]
 [:.bl-ns
  {"border-left-style" (clojure.core/str "solid"),
   "border-left-width" (clojure.core/str "1px")}]
 [:.bn-ns
  {"border-style" (clojure.core/str "none"),
   "border-width" (clojure.core/str "00")}]
 [:.ba-m
  {"border-style" (clojure.core/str "solid"),
   "border-width" (clojure.core/str "1px")}]
 [:.bt-m
  {"border-top-style" (clojure.core/str "solid"),
   "border-top-width" (clojure.core/str "1px")}]
 [:.br-m
  {"border-right-style" (clojure.core/str "solid"),
   "border-right-width" (clojure.core/str "1px")}]
 [:.bb-m
  {"border-bottom-style" (clojure.core/str "solid"),
   "border-bottom-width" (clojure.core/str "1px")}]
 [:.bl-m
  {"border-left-style" (clojure.core/str "solid"),
   "border-left-width" (clojure.core/str "1px")}]
 [:.bn-m
  {"border-style" (clojure.core/str "none"),
   "border-width" (clojure.core/str "00")}]
 [:.ba-l
  {"border-style" (clojure.core/str "solid"),
   "border-width" (clojure.core/str "1px")}]
 [:.bt-l
  {"border-top-style" (clojure.core/str "solid"),
   "border-top-width" (clojure.core/str "1px")}]
 [:.br-l
  {"border-right-style" (clojure.core/str "solid"),
   "border-right-width" (clojure.core/str "1px")}]
 [:.bb-l
  {"border-bottom-style" (clojure.core/str "solid"),
   "border-bottom-width" (clojure.core/str "1px")}]
 [:.bl-l
  {"border-left-style" (clojure.core/str "solid"),
   "border-left-width" (clojure.core/str "1px")}]
 [:.bn-l
  {"border-style" (clojure.core/str "none"),
   "border-width" (clojure.core/str "00")}])
