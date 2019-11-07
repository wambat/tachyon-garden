(ns tachyon-garden.styles.border-color
  (:require
   [tachyon-garden.styles.color :refer [color]]))

(defn border-color [value]
  {:border-color (color value)})
