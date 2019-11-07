(clojure.core/ns
 styles._hovers
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.dim
  {"opacity" (clojure.core/str "11"),
   "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
 [":.dim:hover"
  {"opacity" (clojure.core/str ".5"),
   "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
 [":.dim:focus"
  {"opacity" (clojure.core/str ".5"),
   "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
 [":.dim:active"
  {"opacity" (clojure.core/str ".8"),
   "transition"
   (clojure.core/str "opacity" " " ".15s" " " "ease-out")}]
 [:.glow
  {"transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
 [":.glow:hover"
  {"opacity" (clojure.core/str "11"),
   "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
 [":.glow:focus"
  {"opacity" (clojure.core/str "11"),
   "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
 [:.hide-child
  [:.child
   {"opacity" (clojure.core/str "00"),
    "transition"
    (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]]
 [":.hide-child:hover"
  [:.child
   {"opacity" (clojure.core/str "11"),
    "transition"
    (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]]
 [":.hide-child:focus"
  [:.child
   {"opacity" (clojure.core/str "11"),
    "transition"
    (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]]
 [":.hide-child:active"
  [:.child
   {"opacity" (clojure.core/str "11"),
    "transition"
    (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]]
 [":.underline-hover:hover"
  {"text-decoration" (clojure.core/str "underline")}]
 [":.underline-hover:focus"
  {"text-decoration" (clojure.core/str "underline")}]
 [:.grow
  {"-moz-osx-font-smoothing" (clojure.core/str "grayscale"),
   "backface-visibility" (clojure.core/str "hidden"),
   "transform" (clojure.core/str "translateZ"),
   "transition"
   (clojure.core/str "transform" " " "0.25s" " " "ease-out")}]
 [":.grow:hover" {"transform" (clojure.core/str "scale")}]
 [":.grow:focus" {"transform" (clojure.core/str "scale")}]
 [":.grow:active" {"transform" (clojure.core/str "scale")}]
 [:.grow-large
  {"-moz-osx-font-smoothing" (clojure.core/str "grayscale"),
   "backface-visibility" (clojure.core/str "hidden"),
   "transform" (clojure.core/str "translateZ"),
   "transition"
   (clojure.core/str "transform" " " ".25s" " " "ease-in-out")}]
 [":.grow-large:hover" {"transform" (clojure.core/str "scale")}]
 [":.grow-large:focus" {"transform" (clojure.core/str "scale")}]
 [":.grow-large:active" {"transform" (clojure.core/str "scale")}]
 [":.pointer:hover" {"cursor" (clojure.core/str "pointer")}]
 [:.shadow-hover
  {"cursor" (clojure.core/str "pointer"),
   "position" (clojure.core/str "relative"),
   "transition"
   (clojure.core/str "all" " " "0.5s" " " "cubic-bezier")}]
 [":after"
  {"width" (clojure.core/str "100%"),
   "top" (clojure.core/str "00"),
   "height" (clojure.core/str "100%"),
   "position" (clojure.core/str "absolute"),
   "z-index" (clojure.core/str "-1-1"),
   "content" (clojure.core/str ""),
   "box-shadow"
   (clojure.core/str "0px" " " "0px" " " "16px" " " "2px" " " "rgba"),
   "border-radius" (clojure.core/str "inherit"),
   "transition"
   (clojure.core/str "opacity" " " "0.5s" " " "cubic-bezier"),
   "opacity" (clojure.core/str "00"),
   "left" (clojure.core/str "00")}]
 [":after" {"opacity" (clojure.core/str "11")}]
 [:.bg-animate
  {"transition"
   (clojure.core/str "background-color" " " ".15s" " " "ease-in-out")}]
 [":.bg-animate:hover"
  {"transition"
   (clojure.core/str "background-color" " " ".15s" " " "ease-in-out")}]
 [":.bg-animate:focus"
  {"transition"
   (clojure.core/str "background-color" " " ".15s" " " "ease-in-out")}])
