(ns tachyon-garden.styles.clears
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:cf:before {"content" (clojure.core/str " "),
               "display" (clojure.core/str "table")}
   :cf:after {"content" (clojure.core/str " "),
              "display" (clojure.core/str "table")
              "clear" (clojure.core/str "both")}
   :cf {"*zoom" 1}
   :cl {"clear" (clojure.core/str "left")}
   :cr {"clear" (clojure.core/str "right")}
   :cb {"clear" (clojure.core/str "both")}
   :cn {"clear" (clojure.core/str "none")}
   :cl-ns {"clear" (clojure.core/str "left")}
   :cr-ns {"clear" (clojure.core/str "right")}
   :cb-ns {"clear" (clojure.core/str "both")}
   :cn-ns {"clear" (clojure.core/str "none")}
   :cl-m {"clear" (clojure.core/str "left")}
   :cr-m {"clear" (clojure.core/str "right")}
   :cb-m {"clear" (clojure.core/str "both")}
   :cn-m {"clear" (clojure.core/str "none")}
   :cl-l {"clear" (clojure.core/str "left")}
   :cr-l {"clear" (clojure.core/str "right")}
   :cb-l {"clear" (clojure.core/str "both")}
   :cn-l {"clear" (clojure.core/str "none")}})

(defn clear [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "c" (when value (str "" (name value))))})))
