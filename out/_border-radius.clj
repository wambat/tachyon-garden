(clojure.core/ns
 styles._border-radius
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.br0 {"border-radius" (clojure.core/str "00")}]
 [:.br1 {"border-radius" (clojure.core/str ".125rem")}]
 [:.br2 {"border-radius" (clojure.core/str ".25rem")}]
 [:.br3 {"border-radius" (clojure.core/str ".5rem")}]
 [:.br4 {"border-radius" (clojure.core/str "11" " " "rem")}]
 [:.br-100 {"border-radius" (clojure.core/str "100%")}]
 [:.br-pill {"border-radius" (clojure.core/str "9999px")}]
 [:.br--bottom
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-top-right-radius" (clojure.core/str "00")}]
 [:.br--top
  {"border-bottom-left-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}]
 [:.br--right
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-bottom-left-radius" (clojure.core/str "00")}]
 [:.br--left
  {"border-top-right-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}]
 [:.br0-ns {"border-radius" (clojure.core/str "00")}]
 [:.br1-ns {"border-radius" (clojure.core/str ".125rem")}]
 [:.br2-ns {"border-radius" (clojure.core/str ".25rem")}]
 [:.br3-ns {"border-radius" (clojure.core/str ".5rem")}]
 [:.br4-ns {"border-radius" (clojure.core/str "11" " " "rem")}]
 [:.br-100-ns {"border-radius" (clojure.core/str "100%")}]
 [:.br-pill-ns {"border-radius" (clojure.core/str "9999px")}]
 [:.br--bottom-ns
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-top-right-radius" (clojure.core/str "00")}]
 [:.br--top-ns
  {"border-bottom-left-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}]
 [:.br--right-ns
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-bottom-left-radius" (clojure.core/str "00")}]
 [:.br--left-ns
  {"border-top-right-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}]
 [:.br0-m {"border-radius" (clojure.core/str "00")}]
 [:.br1-m {"border-radius" (clojure.core/str ".125rem")}]
 [:.br2-m {"border-radius" (clojure.core/str ".25rem")}]
 [:.br3-m {"border-radius" (clojure.core/str ".5rem")}]
 [:.br4-m {"border-radius" (clojure.core/str "11" " " "rem")}]
 [:.br-100-m {"border-radius" (clojure.core/str "100%")}]
 [:.br-pill-m {"border-radius" (clojure.core/str "9999px")}]
 [:.br--bottom-m
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-top-right-radius" (clojure.core/str "00")}]
 [:.br--top-m
  {"border-bottom-left-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}]
 [:.br--right-m
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-bottom-left-radius" (clojure.core/str "00")}]
 [:.br--left-m
  {"border-top-right-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}]
 [:.br0-l {"border-radius" (clojure.core/str "00")}]
 [:.br1-l {"border-radius" (clojure.core/str ".125rem")}]
 [:.br2-l {"border-radius" (clojure.core/str ".25rem")}]
 [:.br3-l {"border-radius" (clojure.core/str ".5rem")}]
 [:.br4-l {"border-radius" (clojure.core/str "11" " " "rem")}]
 [:.br-100-l {"border-radius" (clojure.core/str "100%")}]
 [:.br-pill-l {"border-radius" (clojure.core/str "9999px")}]
 [:.br--bottom-l
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-top-right-radius" (clojure.core/str "00")}]
 [:.br--top-l
  {"border-bottom-left-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}]
 [:.br--right-l
  {"border-top-left-radius" (clojure.core/str "00"),
   "border-bottom-left-radius" (clojure.core/str "00")}]
 [:.br--left-l
  {"border-top-right-radius" (clojure.core/str "00"),
   "border-bottom-right-radius" (clojure.core/str "00")}])
