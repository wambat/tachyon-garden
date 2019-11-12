(ns tachyon-garden.styles.nested
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:nested-copy-line-height [[[:p :ul :ol] {"line-height" (clojure.core/str "1.5")}]]
   :nested-headline-line-height [[[:h1 :h2 :h3 :h4 :h5 :h6]
                                  {"line-height" (clojure.core/str  "1.25")}]]
   :nested-list-reset [[[:ul :ol] {"padding-left" (clojure.core/str "00"),
                             "margin-left" (clojure.core/str "00"),
                             "list-style-type" (clojure.core/str "none")}]]
   :nested-copy-indent [["p+p" {"text-indent" (clojure.core/str "1em"),
                                "margin-top" (clojure.core/str "00"),
                                "margin-bottom" (clojure.core/str "00")}]]
   :nested-copy-separator ["p+p" {"margin-top" (clojure.core/str "1.5em")}]
   :nested-img [[:img {"width" (clojure.core/str "100%"),
                       "max-width" (clojure.core/str "100%"),
                       "display" (clojure.core/str "block")}]]
   :nested-links [[:a [{:color (color :blue)
                        :transition "color .15s ease-in"}
                       [[":hover" ":focus"] {:color (color :light-blue)
                                             :transition "color .15s ease-in"}]]]]})
