(ns tachyon-garden.core
  (:require
   [taoensso.timbre :refer [refer-timbre]]
   [clojure.java.io :as io]
   [clojure.string :as str]
   [tachyon-garden.inflator :refer [->defsigs]]
   [garden.stylesheet :refer [at-media]]
   ;; [garden.types :refer :all]

   [tachyon-garden.styles.normalize :as normalize]

   [tachyon-garden.styles.aspect-ratios :as aspect-ratios]
   [tachyon-garden.styles.background-position :as background-position]
   [tachyon-garden.styles.background-size :as background-size]
   [tachyon-garden.styles.border-color :as border-color]
   ;; [tachyon-garden.styles.border-radius :as border-radius]
   ;; [tachyon-garden.styles.borders :as borders]
   ;; [tachyon-garden.styles.border-style :as border-style]
   ;; [tachyon-garden.styles.border-width :as border-width]
   ;; [tachyon-garden.styles.box-shadow :as box-shadow]
   ;; [tachyon-garden.styles.box-sizing :as box-sizing]
   ;; [tachyon-garden.styles.clears :as clears]
   ;; [tachyon-garden.styles.code :as code]
   ;; [tachyon-garden.styles.color :as color]
   ;; [tachyon-garden.styles.coordinates :as coordinates]
   ;; [tachyon-garden.styles.debug-children :as debug-children]
   ;; [tachyon-garden.styles.debug :as debug]
   ;; [tachyon-garden.styles.debug-grid :as debug-grid]
   ;; [tachyon-garden.styles.display :as display]
   ;; [tachyon-garden.styles.flexbox :as flexbox]
   ;; [tachyon-garden.styles.floats :as floats]
   ;; [tachyon-garden.styles.font-family :as font-family]
   ;; [tachyon-garden.styles.font-style :as font-style]
   ;; [tachyon-garden.styles.font-weight :as font-weight]
   ;; [tachyon-garden.styles.forms :as forms]
   ;; [tachyon-garden.styles.heights :as heights]
   ;; [tachyon-garden.styles.hovers :as hovers]
   ;; [tachyon-garden.styles.images :as images]
   ;; [tachyon-garden.styles.letter-spacing :as letter-spacing]
   ;; [tachyon-garden.styles.line-height :as line-height]
   ;; [tachyon-garden.styles.links :as links]
   ;; [tachyon-garden.styles.lists :as lists]
   ;; [tachyon-garden.styles.main :as main]
   ;; [tachyon-garden.styles.max-widths :as max-widths]
   ;; [tachyon-garden.styles.media-queries :as media-queries]
   ;; [tachyon-garden.styles.negative-margin :as negative-margin]
   ;; [tachyon-garden.styles.nested :as nested]
   ;; [tachyon-garden.styles.normalize :as normalize]
   ;; [tachyon-garden.styles.opacity :as opacity]
   ;; [tachyon-garden.styles.outlines :as outlines]
   ;; [tachyon-garden.styles.overflow :as overflow]
   ;; [tachyon-garden.styles.position :as position]
   ;; [tachyon-garden.styles.rotations :as rotations]
   ;; [tachyon-garden.styles.skins :as skins]
   ;; [tachyon-garden.styles.skins-pseudo :as skins-pseudo]
   ;; [tachyon-garden.styles.spacing :as spacing]
   ;; [tachyon-garden.styles.tables :as tables]
   ;; [tachyon-garden.styles.text-align :as text-align]
   ;; [tachyon-garden.styles.text-decoration :as text-decoration]
   ;; [tachyon-garden.styles.text-transform :as text-transform]
   ;; [tachyon-garden.styles.type-scale :as type-scale]
   ;; [tachyon-garden.styles.typography :as typography]
   ;; [tachyon-garden.styles.utilities :as utilities]
   ;; [tachyon-garden.styles.vertical-align :as vertical-align]
   ;; [tachyon-garden.styles.visibility :as visibility]
   ;; [tachyon-garden.styles.white-space :as white-space]
   ;; [tachyon-garden.styles.widths :as widths]
   ;; [tachyon-garden.styles.z-index :as z-index]

   ;; [tachyon-garden.styles.box-sizing :as box-sizing]
   ;; [tachyon-garden.styles.aspect-ratios :as aspect-ratios]
   ;; [tachyon-garden.styles.nested :as nested]
   ;; [tachyon-garden.styles.vertical-align :as vertical-align]

   [tachyon-garden.styles.media-queries :refer [with-media breakpoint]]))

(refer-timbre)



(->defsigs aspect-ratios/styledefs)
(->defsigs background-position/styledefs)
(->defsigs background-size/styledefs)
(->defsigs border-color/styledefs)

;; (->defsigs border-radius/styledefs)
;; (->defsigs borders/styledefs)
;; (->defsigs border-style/styledefs)
;; (->defsigs border-width/styledefs)
;; (->defsigs box-shadow/styledefs)
;; (->defsigs box-sizing/styledefs)
;; (->defsigs clears/styledefs)
;; (->defsigs code/styledefs)
;; (->defsigs color/styledefs)
;; (->defsigs coordinates/styledefs)
;; (->defsigs debug-children/styledefs)
;; (->defsigs debug/styledefs)
;; (->defsigs debug-grid/styledefs)
;; (->defsigs display/styledefs)
;; (->defsigs flexbox/styledefs)
;; (->defsigs floats/styledefs)
;; (->defsigs font-family/styledefs)
;; (->defsigs font-style/styledefs)
;; (->defsigs font-weight/styledefs)
;; (->defsigs forms/styledefs)
;; (->defsigs heights/styledefs)
;; (->defsigs hovers/styledefs)
;; (->defsigs images/styledefs)
;; (->defsigs letter-spacing/styledefs)
;; (->defsigs line-height/styledefs)
;; (->defsigs links/styledefs)
;; (->defsigs lists/styledefs)
;; (->defsigs main/styledefs)
;; (->defsigs max-widths/styledefs)
;; (->defsigs media-queries/styledefs)
;; (->defsigs negative-margin/styledefs)
;; (->defsigs nested/styledefs)
;; (->defsigs normalize/styledefs)
;; (->defsigs opacity/styledefs)
;; (->defsigs outlines/styledefs)
;; (->defsigs overflow/styledefs)
;; (->defsigs position/styledefs)
;; (->defsigs rotations/styledefs)
;; (->defsigs skins/styledefs)
;; (->defsigs skins-pseudo/styledefs)
;; (->defsigs spacing/styledefs)
;; (->defsigs tables/styledefs)
;; (->defsigs text-align/styledefs)
;; (->defsigs text-decoration/styledefs)
;; (->defsigs text-transform/styledefs)
;; (->defsigs type-scale/styledefs)
;; (->defsigs typography/styledefs)
;; (->defsigs utilities/styledefs)
;; (->defsigs vertical-align/styledefs)
;; (->defsigs visibility/styledefs)
;; (->defsigs white-space/styledefs)
;; (->defsigs widths/styledefs)
;; (->defsigs z-index/styledefs)

;; (->defsigs box-sizing/styledefs)
;; (->defsigs aspect-ratios/styledefs)
;; (->defsigs nested/styledefs)
