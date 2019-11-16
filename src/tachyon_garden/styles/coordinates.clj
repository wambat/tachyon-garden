(ns tachyon-garden.styles.coordinates
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:top-0 {"top" (clojure.core/str "0")}
   :right-0 {"right" (clojure.core/str "0")}
   :bottom-0 {"bottom" (clojure.core/str "0")}
   :left-0 {"left" (clojure.core/str "0")}
   :top-1 {"top" (clojure.core/str "1" " " "rem")}
   :right-1 {"right" (clojure.core/str "1" " " "rem")}
   :bottom-1 {"bottom" (clojure.core/str "1" " " "rem")}
   :left-1 {"left" (clojure.core/str "1" " " "rem")}
   :top-2 {"top" (clojure.core/str "2" " " "rem")}
   :right-2 {"right" (clojure.core/str "2" " " "rem")}
   :bottom-2 {"bottom" (clojure.core/str "2" " " "rem")}
   :left-2 {"left" (clojure.core/str "2" " " "rem")}
   :top--1 {"top" (clojure.core/str "-1" " " "rem")}
   :right--1 {"right" (clojure.core/str "-1" " " "rem")}
   :bottom--1 {"bottom" (clojure.core/str "-1" " " "rem")}
   :left--1 {"left" (clojure.core/str "-1" " " "rem")}
   :top--2 {"top" (clojure.core/str "-2" " " "rem")}
   :right--2 {"right" (clojure.core/str "-2" " " "rem")}
   :bottom--2 {"bottom" (clojure.core/str "-2" " " "rem")}
   :left--2 {"left" (clojure.core/str "-2" " " "rem")}
   :absolute-fill {"top" (clojure.core/str "0"),
                   "right" (clojure.core/str "0"),
                   "bottom" (clojure.core/str "0"),
                   "left" (clojure.core/str "0")}
   :top-0-ns {"top" (clojure.core/str "0")}
   :left-0-ns {"left" (clojure.core/str "0")}
   :right-0-ns {"right" (clojure.core/str "0")}
   :bottom-0-ns {"bottom" (clojure.core/str "0")}
   :top-1-ns {"top" (clojure.core/str "1" " " "rem")}
   :left-1-ns {"left" (clojure.core/str "1" " " "rem")}
   :right-1-ns {"right" (clojure.core/str "1" " " "rem")}
   :bottom-1-ns {"bottom" (clojure.core/str "1" " " "rem")}
   :top-2-ns {"top" (clojure.core/str "2" " " "rem")}
   :left-2-ns {"left" (clojure.core/str "2" " " "rem")}
   :right-2-ns {"right" (clojure.core/str "2" " " "rem")}
   :bottom-2-ns {"bottom" (clojure.core/str "2" " " "rem")}
   :top--1-ns {"top" (clojure.core/str "-1" " " "rem")}
   :right--1-ns {"right" (clojure.core/str "-1" " " "rem")}
   :bottom--1-ns {"bottom" (clojure.core/str "-1" " " "rem")}
   :left--1-ns {"left" (clojure.core/str "-1" " " "rem")}
   :top--2-ns {"top" (clojure.core/str "-2" " " "rem")}
   :right--2-ns {"right" (clojure.core/str "-2" " " "rem")}
   :bottom--2-ns {"bottom" (clojure.core/str "-2" " " "rem")}
   :left--2-ns {"left" (clojure.core/str "-2" " " "rem")}
   :absolute-fill-ns {"top" (clojure.core/str "0"),
                      "right" (clojure.core/str "0"),
                      "bottom" (clojure.core/str "0"),
                      "left" (clojure.core/str "0")}
   :top-0-m {"top" (clojure.core/str "0")}
   :left-0-m {"left" (clojure.core/str "0")}
   :right-0-m {"right" (clojure.core/str "0")}
   :bottom-0-m {"bottom" (clojure.core/str "0")}
   :top-1-m {"top" (clojure.core/str "1" " " "rem")}
   :left-1-m {"left" (clojure.core/str "1" " " "rem")}
   :right-1-m {"right" (clojure.core/str "1" " " "rem")}
   :bottom-1-m {"bottom" (clojure.core/str "1" " " "rem")}
   :top-2-m {"top" (clojure.core/str "2" " " "rem")}
   :left-2-m {"left" (clojure.core/str "2" " " "rem")}
   :right-2-m {"right" (clojure.core/str "2" " " "rem")}
   :bottom-2-m {"bottom" (clojure.core/str "2" " " "rem")}
   :top--1-m {"top" (clojure.core/str "-1" " " "rem")}
   :right--1-m {"right" (clojure.core/str "-1" " " "rem")}
   :bottom--1-m {"bottom" (clojure.core/str "-1" " " "rem")}
   :left--1-m {"left" (clojure.core/str "-1" " " "rem")}
   :top--2-m {"top" (clojure.core/str "-2" " " "rem")}
   :right--2-m {"right" (clojure.core/str "-2" " " "rem")}
   :bottom--2-m {"bottom" (clojure.core/str "-2" " " "rem")}
   :left--2-m {"left" (clojure.core/str "-2" " " "rem")}
   :absolute-fill-m {"top" (clojure.core/str "0"),
                     "right" (clojure.core/str "0"),
                     "bottom" (clojure.core/str "0"),
                     "left" (clojure.core/str "0")}
   :top-0-l {"top" (clojure.core/str "0")}
   :left-0-l {"left" (clojure.core/str "0")}
   :right-0-l {"right" (clojure.core/str "0")}
   :bottom-0-l {"bottom" (clojure.core/str "0")}
   :top-1-l {"top" (clojure.core/str "1" " " "rem")}
   :left-1-l {"left" (clojure.core/str "1" " " "rem")}
   :right-1-l {"right" (clojure.core/str "1" " " "rem")}
   :bottom-1-l {"bottom" (clojure.core/str "1" " " "rem")}
   :top-2-l {"top" (clojure.core/str "2" " " "rem")}
   :left-2-l {"left" (clojure.core/str "2" " " "rem")}
   :right-2-l {"right" (clojure.core/str "2" " " "rem")}
   :bottom-2-l {"bottom" (clojure.core/str "2" " " "rem")}
   :top--1-l {"top" (clojure.core/str "-1" " " "rem")}
   :right--1-l {"right" (clojure.core/str "-1" " " "rem")}
   :bottom--1-l {"bottom" (clojure.core/str "-1" " " "rem")}
   :left--1-l {"left" (clojure.core/str "-1" " " "rem")}
   :top--2-l {"top" (clojure.core/str "-2" " " "rem")}
   :right--2-l {"right" (clojure.core/str "-2" " " "rem")}
   :bottom--2-l {"bottom" (clojure.core/str "-2" " " "rem")}
   :left--2-l {"left" (clojure.core/str "-2" " " "rem")}
   :absolute-fill-l {"top" (clojure.core/str "0"),
                     "right" (clojure.core/str "0"),
                     "bottom" (clojure.core/str "0"),
                     "left" (clojure.core/str "0")}})
