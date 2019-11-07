(clojure.core/ns
 styles._text-align
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.tl {"text-align" (clojure.core/str "left")}]
 [:.tr {"text-align" (clojure.core/str "right")}]
 [:.tc {"text-align" (clojure.core/str "center")}]
 [:.tj {"text-align" (clojure.core/str "justify")}]
 [:.tl-ns {"text-align" (clojure.core/str "left")}]
 [:.tr-ns {"text-align" (clojure.core/str "right")}]
 [:.tc-ns {"text-align" (clojure.core/str "center")}]
 [:.tj-ns {"text-align" (clojure.core/str "justify")}]
 [:.tl-m {"text-align" (clojure.core/str "left")}]
 [:.tr-m {"text-align" (clojure.core/str "right")}]
 [:.tc-m {"text-align" (clojure.core/str "center")}]
 [:.tj-m {"text-align" (clojure.core/str "justify")}]
 [:.tl-l {"text-align" (clojure.core/str "left")}]
 [:.tr-l {"text-align" (clojure.core/str "right")}]
 [:.tc-l {"text-align" (clojure.core/str "center")}]
 [:.tj-l {"text-align" (clojure.core/str "justify")}])
