(ns tachyon-garden.styles.media-queries
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

;; CUSTOM MEDIA QUERIES

;; Media query values can be changed to fit your own content.
;; There are no magic bullets when it comes to media query width values.
;; They should be declared in em units - and they should be set to meet
;; the needs of your content. You can also add additional media queries,
;; or remove some of the existing ones.



(def breakpoint-defs
  {:not-small {:screen true
               :min-width (em 30)}
   :medium {:screen true
            :min-width (em 30)
            :max-width (em 60)}
   :large {:screen true
           :min-width (em 60em)}})

(defn breakpoint [t]
  (let [fullt (get {:ns :not-small
                    :m :medium
                    :l :large}) t t]
    (get breakponit-defs fullt)))

(defn with-media [{:keys [styledefs value media]}]
  (let [media-suffix (when aspect (str "-" (name media)))
        nm (keyword (str value media-suffix))]
    (if media
      (at-media (breakpoint media)
                [:& (get styledefs nm)])
      [:& (get styledefs nm)])))
