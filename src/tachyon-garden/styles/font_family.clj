(ns tachyon-garden.styles.font-family
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:sans-serif {"font-family" "-apple-system, BlinkMacSystemFont,'avenir next', avenir,'helvetica neue', helvetica,ubuntu,roboto, noto,'segoe ui', arial,sans-serif"}
   :serif {"font-family" "georgia,times,serif"}
   :system-sans-serif {"font-family" "sans-serif"}
   :system-serif {"font-family" "serif"}
   :code {"font-family" "Consolas,monaco,monospace"}
   :courier {"font-family" "'Courier Next',courier,monospace"}
   :helvetica {"font-family" "'helvetica neue', helvetica,sans-serif"}
   :avenir {"font-family" "'avenir next', avenir,sans-serif"}
   :athelas {"font-family" "athelas,georgia,serif"}
   :georgia {"font-family" "georgia,serif"}
   :times {"font-family" "times,serif"}
   :bodoni {"font-family" "'Bodoni MT',serif"}
   :calisto {"font-family" "'Calisto MT',serif"}
   :garamond {"font-family" "garamond,serif"}
   :baskerville {"font-family" "baskerville,serif"}})

(defn display [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "d" (when value (str "" (name value))))})))
