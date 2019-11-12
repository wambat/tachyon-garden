(ns tachyon-garden.styles.text-decoration
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:strike {"text-decoration" (clojure.core/str "line-through")}
   :underline {"text-decoration" (clojure.core/str "underline")}
   :no-underline {"text-decoration" (clojure.core/str "none")}
   :strike-ns {"text-decoration" (clojure.core/str "line-through")}
   :underline-ns {"text-decoration" (clojure.core/str "underline")}
   :no-underline-ns {"text-decoration" (clojure.core/str "none")}
   :strike-m {"text-decoration" (clojure.core/str "line-through")}
   :underline-m {"text-decoration" (clojure.core/str "underline")}
   :no-underline-m {"text-decoration" (clojure.core/str "none")}
   :strike-l {"text-decoration" (clojure.core/str "line-through")}
   :underline-l {"text-decoration" (clojure.core/str "underline")}
   :no-underline-l {"text-decoration" (clojure.core/str "none")}})
