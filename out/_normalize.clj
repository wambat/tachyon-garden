(clojure.core/ns
 styles._normalize
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:html
  {"line-height" (clojure.core/str "1.151.15"),
   "-webkit-text-size-adjust" (clojure.core/str "100%")}]
 [:body {"margin" (clojure.core/str "00")}]
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
 [nil
  {"border-bottom" (clojure.core/str "none"),
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
 [:button
  {"font-family" (clojure.core/str "inherit"),
   "font-size" (clojure.core/str "100%"),
   "line-height" (clojure.core/str "1.151.15"),
   "margin" (clojure.core/str "00")}]
 [:input
  {"font-family" (clojure.core/str "inherit"),
   "font-size" (clojure.core/str "100%"),
   "line-height" (clojure.core/str "1.151.15"),
   "margin" (clojure.core/str "00")}]
 [:optgroup
  {"font-family" (clojure.core/str "inherit"),
   "font-size" (clojure.core/str "100%"),
   "line-height" (clojure.core/str "1.151.15"),
   "margin" (clojure.core/str "00")}]
 [:select
  {"font-family" (clojure.core/str "inherit"),
   "font-size" (clojure.core/str "100%"),
   "line-height" (clojure.core/str "1.151.15"),
   "margin" (clojure.core/str "00")}]
 [:textarea
  {"font-family" (clojure.core/str "inherit"),
   "font-size" (clojure.core/str "100%"),
   "line-height" (clojure.core/str "1.151.15"),
   "margin" (clojure.core/str "00")}]
 [:button {"overflow" (clojure.core/str "visible")}]
 [:input {"overflow" (clojure.core/str "visible")}]
 [:button {"text-transform" (clojure.core/str "none")}]
 [:select {"text-transform" (clojure.core/str "none")}]
 [nil {"-webkit-appearance" (clojure.core/str "button")}]
 [":-moz-focus-inner"
  {"border-style" (clojure.core/str "none"),
   "padding" (clojure.core/str "00")}]
 [":-moz-focusring"
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
 [:textarea {"overflow" (clojure.core/str "auto")}])
