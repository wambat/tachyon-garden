(ns tachyon-garden.styles.hovers
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:dim [{"opacity" (clojure.core/str "1"),
          "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}
         [":hover" {"opacity" (clojure.core/str ".5"),
                    "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
         [":focus" {"opacity" (clojure.core/str ".5"),
                    "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
         [":active" {"opacity" (clojure.core/str ".8"),
                     "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-out")}]]
   :glow [{"transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}
          [":hover" {"opacity" (clojure.core/str "1"),
                     "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
          [":focus" {"opacity" (clojure.core/str "1"),
                     "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]]
   :hide-child [[">.child" {"opacity" (clojure.core/str "00"),
                            "transition" (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
                [":hover >.child" {"opacity" (clojure.core/str "1"),
                                   "transition"
                                   (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
                [":focus >.child" {"opacity" (clojure.core/str "1"),
                                   "transition"
                                   (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]
                [":active >.child" {"opacity" (clojure.core/str "1"),
                                    "transition"
                                    (clojure.core/str "opacity" " " ".15s" " " "ease-in")}]]
   :underline-hover [[":hover" {"text-decoration" (clojure.core/str "underline")}]
                     [":focus" {"text-decoration" (clojure.core/str "underline")}]]
   :grow [{"-moz-osx-font-smoothing" (clojure.core/str "grayscale"),
           "backface-visibility" (clojure.core/str "hidden"),
           "transform" (clojure.core/str "translateZ"),
           "transition"
           (clojure.core/str "transform" " " "0.25s" " " "ease-out")}
          [":hover" {"transform" (clojure.core/str "scale")}]
          [":focus" {"transform" (clojure.core/str "scale")}]
          [":active" {"transform" (clojure.core/str "scale")}]]
   :grow-large [{"-moz-osx-font-smoothing" (clojure.core/str "grayscale"),
                 "backface-visibility" (clojure.core/str "hidden"),
                 "transform" (clojure.core/str "translateZ(0)"),
                 "transition" (clojure.core/str "transform" " " ".25s" " " "ease-in-out")}
                [":hover" {"transform" (clojure.core/str "scale(1.05)")}]
                [":focus" {"transform" (clojure.core/str "scale(1.05)")}]
                [":active" {"transform" (clojure.core/str "scale(0.90)")}]]
   :pointer [[":hover" {"cursor" (clojure.core/str "pointer")}]]
   :shadow-hover [{"cursor" (clojure.core/str "pointer"),
                   "position" (clojure.core/str "relative"),
                   "transition" (clojure.core/str "all" " " "0.5s" " " "cubic-bezier(0.165, 0.84, 0.44, 1)")}
                  ["::after" {"width" (clojure.core/str "100%"),
                              "top" (clojure.core/str "00"),
                              "height" (clojure.core/str "100%"),
                              "position" (clojure.core/str "absolute"),
                              "z-index" (clojure.core/str "-1"),
                              "content" (clojure.core/str ""),
                              "box-shadow" (clojure.core/str "0px" " " "0px" " " "16px" " " "2px" " " "rgba( 0, 0, 0, .2 )"),
                              "border-radius" (clojure.core/str "inherit"),
                              "transition" (clojure.core/str "opacity" " " "0.5s" " " "cubic-bezier(0.165, 0.84, 0.44, 1)"),
                              "opacity" (clojure.core/str "00"),
                              "left" (clojure.core/str "00")}]
                  [":hover::after" {"opacity" (clojure.core/str "1")}]
                  [":focus::after" {"opacity" (clojure.core/str "1")}]]
   :bg-animate [{"transition" (clojure.core/str "background-color" " " ".15s" " " "ease-in-out")}
                [":hover" {"transition"
                           (clojure.core/str "background-color" " " ".15s" " " "ease-in-out")}]
                [":focus" {"transition"
                           (clojure.core/str "background-color" " " ".15s" " " "ease-in-out")}]]})
