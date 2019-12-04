(ns tachyon-garden.styles.default
  (:require [garden.def :refer [defcssfn defstyles]]
            [garden.units :as units :refer [percent px em]]
            [garden.selectors :as s]

            [tachyon-garden.styles.normalize :as normalize]
            ))

(defstyles root
  normalize/root
  [:.test {}]
  )

