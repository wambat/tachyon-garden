(ns tachyon-garden.styles.letter-spacing
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:tracked {"letter-spacing" (clojure.core/str ".1em")}
   :tracked-tight {"letter-spacing" (clojure.core/str "-.05em")}
   :tracked-mega {"letter-spacing" (clojure.core/str ".25em")}
   :tracked-ns {"letter-spacing" (clojure.core/str ".1em")}
   :tracked-tight-ns {"letter-spacing" (clojure.core/str "-.05em")}
   :tracked-mega-ns {"letter-spacing" (clojure.core/str ".25em")}
   :tracked-m {"letter-spacing" (clojure.core/str ".1em")}
   :tracked-tight-m {"letter-spacing" (clojure.core/str "-.05em")}
   :tracked-mega-m {"letter-spacing" (clojure.core/str ".25em")}})
