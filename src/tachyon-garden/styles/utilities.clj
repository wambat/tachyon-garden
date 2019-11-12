(ns tachyon-garden.styles.utilities
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:overflow-container {"overflow-y" (clojure.core/str "scroll")}
   :center {"margin-right" (clojure.core/str "auto"),
             "margin-left" (clojure.core/str "auto")}
   :mr-auto {"margin-right" (clojure.core/str "auto")}
   :ml-auto {"margin-left" (clojure.core/str "auto")}
   :center-ns {"margin-right" (clojure.core/str "auto"),
                "margin-left" (clojure.core/str "auto")}
   :mr-auto-ns {"margin-right" (clojure.core/str "auto")}
   :ml-auto-ns {"margin-left" (clojure.core/str "auto")}
   :center-m {"margin-right" (clojure.core/str "auto"),
               "margin-left" (clojure.core/str "auto")}
   :mr-auto-m {"margin-right" (clojure.core/str "auto")}
   :ml-auto-m {"margin-left" (clojure.core/str "auto")}
   :center-l {"margin-right" (clojure.core/str "auto"),
               "margin-left" (clojure.core/str "auto")}
   :mr-auto-l {"margin-right" (clojure.core/str "auto")}
   :ml-auto-l {"margin-left" (clojure.core/str "auto")}})
