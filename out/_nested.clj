(clojure.core/ns
 styles._nested
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.nested-copy-line-height
  [:p {"line-height" (clojure.core/str "1.51.5")}]]
 [:.nested-copy-line-height
  [:ul {"line-height" (clojure.core/str "1.51.5")}]]
 [:.nested-copy-line-height
  [:ol {"line-height" (clojure.core/str "1.51.5")}]]
 [:.nested-headline-line-height
  [:h1 {"line-height" (clojure.core/str "1.251.25")}]]
 [:.nested-headline-line-height
  [:h2 {"line-height" (clojure.core/str "1.251.25")}]]
 [:.nested-headline-line-height
  [:h3 {"line-height" (clojure.core/str "1.251.25")}]]
 [:.nested-headline-line-height
  [:h4 {"line-height" (clojure.core/str "1.251.25")}]]
 [:.nested-headline-line-height
  [:h5 {"line-height" (clojure.core/str "1.251.25")}]]
 [:.nested-headline-line-height
  [:h6 {"line-height" (clojure.core/str "1.251.25")}]]
 [:.nested-list-reset
  [:ul
   {"padding-left" (clojure.core/str "00"),
    "margin-left" (clojure.core/str "00"),
    "list-style-type" (clojure.core/str "none")}]]
 [:.nested-list-reset
  [:ol
   {"padding-left" (clojure.core/str "00"),
    "margin-left" (clojure.core/str "00"),
    "list-style-type" (clojure.core/str "none")}]]
 [:.nested-copy-indent
  [nil
   {"text-indent" (clojure.core/str "1em"),
    "margin-top" (clojure.core/str "00"),
    "margin-bottom" (clojure.core/str "00")}]]
 [:.nested-copy-separator
  [nil {"margin-top" (clojure.core/str "1.5em")}]]
 [:.nested-img
  [:img
   {"width" (clojure.core/str "100%"),
    "max-width" (clojure.core/str "100%"),
    "display" (clojure.core/str "block")}]]
 [:.nested-links [:a nil]]
 [:.nested-links [":a:hover" nil]]
 [:.nested-links [":a:focus" nil]])
