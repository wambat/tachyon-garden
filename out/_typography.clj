(clojure.core/ns
 styles._typography
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.measure {"max-width" (clojure.core/str "30em")}]
 [:.measure-wide {"max-width" (clojure.core/str "34em")}]
 [:.measure-narrow {"max-width" (clojure.core/str "20em")}]
 [:.indent
  {"text-indent" (clojure.core/str "1em"),
   "margin-top" (clojure.core/str "00"),
   "margin-bottom" (clojure.core/str "00")}]
 [:.small-caps {"font-variant" (clojure.core/str "small-caps")}]
 [:.truncate
  {"white-space" (clojure.core/str "nowrap"),
   "overflow" (clojure.core/str "hidden"),
   "text-overflow" (clojure.core/str "ellipsis")}]
 [:.measure-ns {"max-width" (clojure.core/str "30em")}]
 [:.measure-wide-ns {"max-width" (clojure.core/str "34em")}]
 [:.measure-narrow-ns {"max-width" (clojure.core/str "20em")}]
 [:.indent-ns
  {"text-indent" (clojure.core/str "1em"),
   "margin-top" (clojure.core/str "00"),
   "margin-bottom" (clojure.core/str "00")}]
 [:.small-caps-ns {"font-variant" (clojure.core/str "small-caps")}]
 [:.truncate-ns
  {"white-space" (clojure.core/str "nowrap"),
   "overflow" (clojure.core/str "hidden"),
   "text-overflow" (clojure.core/str "ellipsis")}]
 [:.measure-m {"max-width" (clojure.core/str "30em")}]
 [:.measure-wide-m {"max-width" (clojure.core/str "34em")}]
 [:.measure-narrow-m {"max-width" (clojure.core/str "20em")}]
 [:.indent-m
  {"text-indent" (clojure.core/str "1em"),
   "margin-top" (clojure.core/str "00"),
   "margin-bottom" (clojure.core/str "00")}]
 [:.small-caps-m {"font-variant" (clojure.core/str "small-caps")}]
 [:.truncate-m
  {"white-space" (clojure.core/str "nowrap"),
   "overflow" (clojure.core/str "hidden"),
   "text-overflow" (clojure.core/str "ellipsis")}]
 [:.measure-l {"max-width" (clojure.core/str "30em")}]
 [:.measure-wide-l {"max-width" (clojure.core/str "34em")}]
 [:.measure-narrow-l {"max-width" (clojure.core/str "20em")}]
 [:.indent-l
  {"text-indent" (clojure.core/str "1em"),
   "margin-top" (clojure.core/str "00"),
   "margin-bottom" (clojure.core/str "00")}]
 [:.small-caps-l {"font-variant" (clojure.core/str "small-caps")}]
 [:.truncate-l
  {"white-space" (clojure.core/str "nowrap"),
   "overflow" (clojure.core/str "hidden"),
   "text-overflow" (clojure.core/str "ellipsis")}])
