(ns tachyon-garden.styles.vertical-align
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:v-base {"vertical-align" (clojure.core/str "baseline")}
   :v-mid {"vertical-align" (clojure.core/str "middle")}
   :v-top {"vertical-align" (clojure.core/str "top")}
   :v-btm {"vertical-align" (clojure.core/str "bottom")}
   :v-base-ns {"vertical-align" (clojure.core/str "baseline")}
   :v-mid-ns {"vertical-align" (clojure.core/str "middle")}
   :v-top-ns {"vertical-align" (clojure.core/str "top")}
   :v-btm-ns {"vertical-align" (clojure.core/str "bottom")}
   :v-base-m {"vertical-align" (clojure.core/str "baseline")}
   :v-mid-m {"vertical-align" (clojure.core/str "middle")}
   :v-top-m {"vertical-align" (clojure.core/str "top")}
   :v-btm-m {"vertical-align" (clojure.core/str "bottom")}
   :v-base-l {"vertical-align" (clojure.core/str "baseline")}
   :v-mid-l {"vertical-align" (clojure.core/str "middle")}
   :v-top-l {"vertical-align" (clojure.core/str "top")}
   :v-btm-l {"vertical-align" (clojure.core/str "bottom")}})
