(ns tachyon-garden.styles.normalize
  (:require [garden.def :refer [defcssfn defstyles]]
            [garden.units :as units :refer [percent px em]]
            [garden.selectors :as s]))


(defstyles root

  [:html {:line-height "1.15"
          "-webkit-text-size-adjust" (percent 100)
          }]

  [:body {:margin 0}]

  [:h1 {:font-size (em 2)
        :margin "0.67em 0"}]

  [:h1
   {"font-size" (clojure.core/str "2em"),
    "margin" (clojure.core/str "0.67em" " " "00")}]

  [:hr
   {"box-sizing" (clojure.core/str "content-box"),
    "height" (clojure.core/str "00"),
    "overflow" (clojure.core/str "visible")}]
  [:pre
   {"font-family" (clojure.core/str "monospace"),
    "font-size" (clojure.core/str "1em")}]
  [:a {"background-color" (clojure.core/str "transparent")}]

  ["abbr[title]"
   {"border-bottom" "none",
    "text-decoration" (clojure.core/str "underline" " " "dotted")}]

  [:b {"font-weight" (clojure.core/str "bolder")}]
  [:strong {"font-weight" (clojure.core/str "bolder")}]
  [:code
   {"font-family" (clojure.core/str "monospace"),
    "font-size" (clojure.core/str "1em")}]
  [:kbd
   {"font-family" (clojure.core/str "monospace"),
    "font-size" (clojure.core/str "1em")}]
  [:samp
   {"font-family" (clojure.core/str "monospace"),
    "font-size" (clojure.core/str "1em")}]
  [:small {"font-size" (clojure.core/str "80%")}]
  [:sub
   {"font-size" (clojure.core/str "75%"),
    "line-height" (clojure.core/str "00"),
    "position" (clojure.core/str "relative"),
    "vertical-align" (clojure.core/str "baseline")}]
  [:sup
   {"font-size" (clojure.core/str "75%"),
    "line-height" (clojure.core/str "00"),
    "position" (clojure.core/str "relative"),
    "vertical-align" (clojure.core/str "baseline")}]
  [:sub {"bottom" (clojure.core/str "-0.25em")}]
  [:sup {"top" (clojure.core/str "-0.5em")}]
  [:img {"border-style" (clojure.core/str "none")}]
  [:button :input :optgroup :select :textarea
   {"font-family" (clojure.core/str "inherit"),
    "font-size" (clojure.core/str "100%"),
    "line-height" (clojure.core/str "1.15"),
    "margin" (clojure.core/str "00")}]
  [:button {"overflow" (clojure.core/str "visible")}]
  [:input {"overflow" (clojure.core/str "visible")}]
  [:button {"text-transform" (clojure.core/str "none")}]
  [:select {"text-transform" (clojure.core/str "none")}]

  [:button
   "[type=\"button\"]"
   "[type=\"reset\"]"
   "[type=\"submit\"]"
   {"-webkit-appearance" (clojure.core/str "button")}]
  ["button::-moz-focus-inner"
   "[type=\"button\"]::-moz-focus-inner"
   "[type=\"reset\"]::-moz-focus-inner"
   "[type=\"submit\"]::-moz-focus-inner"
   {"border-style" (clojure.core/str "none"),
    "padding" (clojure.core/str "00")}]

  ["button::-moz-focusring"
   "[type=\"button\"]::-moz-focusring"
   "[type=\"reset\"]::-moz-focusring"
   "[type=\"submit\"]::-moz-focusring"
   {"outline" (clojure.core/str "1px" " " "dotted" " " "ButtonText")}]
  [:fieldset
   {"padding" (clojure.core/str "0.35em" " " "0.75em" " " "0.625em")}]
  [:legend
   {"box-sizing" (clojure.core/str "border-box"),
    "color" (clojure.core/str "inherit"),
    "display" (clojure.core/str "table"),
    "max-width" (clojure.core/str "100%"),
    "padding" (clojure.core/str "00"),
    "white-space" (clojure.core/str "normal")}]
  [:progress {"vertical-align" (clojure.core/str "baseline")}]
  [:textarea {"overflow" (clojure.core/str "auto")}]
  ["[type=\"checkbox\"]"
   "[type=\"radio\"]"
   {:box-sizing "border-box"
    :padding 0}]
  ["[type=\"number\"]::-webkit-inner-spin-button"
   "[type=\"number\"]::-webkit-outer-spin-button"
   {:height "auto"}]
  ["[type=\"search\"]"
   {:-webkit-appearance :textfield
    :outline-offset "-2px"}]
  ["::-webkit-file-upload-button"
   {:-webkit-appearance :button
    :font :inherit}]
  [:details
   {:display :block}]

  [:summary {:display :list-item}]
  [:template {:display :none}]
  ["[hidden]" {:display :none}])











