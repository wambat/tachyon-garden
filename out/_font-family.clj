(clojure.core/ns
 styles._font-family
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.sans-serif {"font-family" (clojure.core/str "sans-serif")}]
 [:.serif {"font-family" (clojure.core/str "serif")}]
 [:.system-sans-serif {"font-family" (clojure.core/str "sans-serif")}]
 [:.system-serif {"font-family" (clojure.core/str "serif")}]
 [:code {"font-family" (clojure.core/str "monospace")}]
 [:.code {"font-family" (clojure.core/str "monospace")}]
 [:.courier {"font-family" (clojure.core/str "monospace")}]
 [:.helvetica {"font-family" (clojure.core/str "sans-serif")}]
 [:.avenir {"font-family" (clojure.core/str "sans-serif")}]
 [:.athelas {"font-family" (clojure.core/str "serif")}]
 [:.georgia {"font-family" (clojure.core/str "serif")}]
 [:.times {"font-family" (clojure.core/str "serif")}]
 [:.bodoni {"font-family" (clojure.core/str "serif")}]
 [:.calisto {"font-family" (clojure.core/str "serif")}]
 [:.garamond {"font-family" (clojure.core/str "serif")}]
 [:.baskerville {"font-family" (clojure.core/str "serif")}])
