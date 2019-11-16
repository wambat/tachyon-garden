(ns tachyon-garden.styles.forms
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:input-reset {"-webkit-appearance" (clojure.core/str "none"),
                 "-moz-appearance" (clojure.core/str "none")}
   ".button-reset::-moz-focus-inner" {"border" (clojure.core/str "00"),
                                      "padding" (clojure.core/str "00")}
   ".input-reset::-moz-focus-inner" {"border" (clojure.core/str "00"),
                                     "padding" (clojure.core/str "00")}
   })
