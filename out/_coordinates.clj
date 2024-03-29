(clojure.core/ns
 styles._coordinates
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.top-0 {"top" (clojure.core/str "00")}]
 [:.right-0 {"right" (clojure.core/str "00")}]
 [:.bottom-0 {"bottom" (clojure.core/str "00")}]
 [:.left-0 {"left" (clojure.core/str "00")}]
 [:.top-1 {"top" (clojure.core/str "11" " " "rem")}]
 [:.right-1 {"right" (clojure.core/str "11" " " "rem")}]
 [:.bottom-1 {"bottom" (clojure.core/str "11" " " "rem")}]
 [:.left-1 {"left" (clojure.core/str "11" " " "rem")}]
 [:.top-2 {"top" (clojure.core/str "22" " " "rem")}]
 [:.right-2 {"right" (clojure.core/str "22" " " "rem")}]
 [:.bottom-2 {"bottom" (clojure.core/str "22" " " "rem")}]
 [:.left-2 {"left" (clojure.core/str "22" " " "rem")}]
 [:.top--1 {"top" (clojure.core/str "-1-1" " " "rem")}]
 [:.right--1 {"right" (clojure.core/str "-1-1" " " "rem")}]
 [:.bottom--1 {"bottom" (clojure.core/str "-1-1" " " "rem")}]
 [:.left--1 {"left" (clojure.core/str "-1-1" " " "rem")}]
 [:.top--2 {"top" (clojure.core/str "-2-2" " " "rem")}]
 [:.right--2 {"right" (clojure.core/str "-2-2" " " "rem")}]
 [:.bottom--2 {"bottom" (clojure.core/str "-2-2" " " "rem")}]
 [:.left--2 {"left" (clojure.core/str "-2-2" " " "rem")}]
 [:.absolute--fill
  {"top" (clojure.core/str "00"),
   "right" (clojure.core/str "00"),
   "bottom" (clojure.core/str "00"),
   "left" (clojure.core/str "00")}]
 [:.top-0-ns {"top" (clojure.core/str "00")}]
 [:.left-0-ns {"left" (clojure.core/str "00")}]
 [:.right-0-ns {"right" (clojure.core/str "00")}]
 [:.bottom-0-ns {"bottom" (clojure.core/str "00")}]
 [:.top-1-ns {"top" (clojure.core/str "11" " " "rem")}]
 [:.left-1-ns {"left" (clojure.core/str "11" " " "rem")}]
 [:.right-1-ns {"right" (clojure.core/str "11" " " "rem")}]
 [:.bottom-1-ns {"bottom" (clojure.core/str "11" " " "rem")}]
 [:.top-2-ns {"top" (clojure.core/str "22" " " "rem")}]
 [:.left-2-ns {"left" (clojure.core/str "22" " " "rem")}]
 [:.right-2-ns {"right" (clojure.core/str "22" " " "rem")}]
 [:.bottom-2-ns {"bottom" (clojure.core/str "22" " " "rem")}]
 [:.top--1-ns {"top" (clojure.core/str "-1-1" " " "rem")}]
 [:.right--1-ns {"right" (clojure.core/str "-1-1" " " "rem")}]
 [:.bottom--1-ns {"bottom" (clojure.core/str "-1-1" " " "rem")}]
 [:.left--1-ns {"left" (clojure.core/str "-1-1" " " "rem")}]
 [:.top--2-ns {"top" (clojure.core/str "-2-2" " " "rem")}]
 [:.right--2-ns {"right" (clojure.core/str "-2-2" " " "rem")}]
 [:.bottom--2-ns {"bottom" (clojure.core/str "-2-2" " " "rem")}]
 [:.left--2-ns {"left" (clojure.core/str "-2-2" " " "rem")}]
 [:.absolute--fill-ns
  {"top" (clojure.core/str "00"),
   "right" (clojure.core/str "00"),
   "bottom" (clojure.core/str "00"),
   "left" (clojure.core/str "00")}]
 [:.top-0-m {"top" (clojure.core/str "00")}]
 [:.left-0-m {"left" (clojure.core/str "00")}]
 [:.right-0-m {"right" (clojure.core/str "00")}]
 [:.bottom-0-m {"bottom" (clojure.core/str "00")}]
 [:.top-1-m {"top" (clojure.core/str "11" " " "rem")}]
 [:.left-1-m {"left" (clojure.core/str "11" " " "rem")}]
 [:.right-1-m {"right" (clojure.core/str "11" " " "rem")}]
 [:.bottom-1-m {"bottom" (clojure.core/str "11" " " "rem")}]
 [:.top-2-m {"top" (clojure.core/str "22" " " "rem")}]
 [:.left-2-m {"left" (clojure.core/str "22" " " "rem")}]
 [:.right-2-m {"right" (clojure.core/str "22" " " "rem")}]
 [:.bottom-2-m {"bottom" (clojure.core/str "22" " " "rem")}]
 [:.top--1-m {"top" (clojure.core/str "-1-1" " " "rem")}]
 [:.right--1-m {"right" (clojure.core/str "-1-1" " " "rem")}]
 [:.bottom--1-m {"bottom" (clojure.core/str "-1-1" " " "rem")}]
 [:.left--1-m {"left" (clojure.core/str "-1-1" " " "rem")}]
 [:.top--2-m {"top" (clojure.core/str "-2-2" " " "rem")}]
 [:.right--2-m {"right" (clojure.core/str "-2-2" " " "rem")}]
 [:.bottom--2-m {"bottom" (clojure.core/str "-2-2" " " "rem")}]
 [:.left--2-m {"left" (clojure.core/str "-2-2" " " "rem")}]
 [:.absolute--fill-m
  {"top" (clojure.core/str "00"),
   "right" (clojure.core/str "00"),
   "bottom" (clojure.core/str "00"),
   "left" (clojure.core/str "00")}]
 [:.top-0-l {"top" (clojure.core/str "00")}]
 [:.left-0-l {"left" (clojure.core/str "00")}]
 [:.right-0-l {"right" (clojure.core/str "00")}]
 [:.bottom-0-l {"bottom" (clojure.core/str "00")}]
 [:.top-1-l {"top" (clojure.core/str "11" " " "rem")}]
 [:.left-1-l {"left" (clojure.core/str "11" " " "rem")}]
 [:.right-1-l {"right" (clojure.core/str "11" " " "rem")}]
 [:.bottom-1-l {"bottom" (clojure.core/str "11" " " "rem")}]
 [:.top-2-l {"top" (clojure.core/str "22" " " "rem")}]
 [:.left-2-l {"left" (clojure.core/str "22" " " "rem")}]
 [:.right-2-l {"right" (clojure.core/str "22" " " "rem")}]
 [:.bottom-2-l {"bottom" (clojure.core/str "22" " " "rem")}]
 [:.top--1-l {"top" (clojure.core/str "-1-1" " " "rem")}]
 [:.right--1-l {"right" (clojure.core/str "-1-1" " " "rem")}]
 [:.bottom--1-l {"bottom" (clojure.core/str "-1-1" " " "rem")}]
 [:.left--1-l {"left" (clojure.core/str "-1-1" " " "rem")}]
 [:.top--2-l {"top" (clojure.core/str "-2-2" " " "rem")}]
 [:.right--2-l {"right" (clojure.core/str "-2-2" " " "rem")}]
 [:.bottom--2-l {"bottom" (clojure.core/str "-2-2" " " "rem")}]
 [:.left--2-l {"left" (clojure.core/str "-2-2" " " "rem")}]
 [:.absolute--fill-l
  {"top" (clojure.core/str "00"),
   "right" (clojure.core/str "00"),
   "bottom" (clojure.core/str "00"),
   "left" (clojure.core/str "00")}])
