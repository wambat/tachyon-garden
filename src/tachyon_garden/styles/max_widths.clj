(ns tachyon-garden.styles.max-widths
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:mw-100     {"max-width" (clojure.core/str "100%")}
   :mw1        {"max-width" (clojure.core/str "1" "rem")}
   :mw2        {"max-width" (clojure.core/str "2" "rem")}
   :mw3        {"max-width" (clojure.core/str "4" "rem")}
   :mw4        {"max-width" (clojure.core/str "8" "rem")}
   :mw5        {"max-width" (clojure.core/str "16" "rem")}
   :mw6        {"max-width" (clojure.core/str "32" "rem")}
   :mw7        {"max-width" (clojure.core/str "48" "rem")}
   :mw8        {"max-width" (clojure.core/str "64" "rem")}
   :mw9        {"max-width" (clojure.core/str "96" "rem")}
   :mw-none    {"max-width" (clojure.core/str "none")}
   :mw-100-ns  {"max-width" (clojure.core/str "100%")}
   :mw1-ns     {"max-width" (clojure.core/str "1" "rem")}
   :mw2-ns     {"max-width" (clojure.core/str "2" "rem")}
   :mw3-ns     {"max-width" (clojure.core/str "4" "rem")}
   :mw4-ns     {"max-width" (clojure.core/str "8" "rem")}
   :mw5-ns     {"max-width" (clojure.core/str "16" "rem")}
   :mw6-ns     {"max-width" (clojure.core/str "32" "rem")}
   :mw7-ns     {"max-width" (clojure.core/str "48" "rem")}
   :mw8-ns     {"max-width" (clojure.core/str "64" "rem")}
   :mw9-ns     {"max-width" (clojure.core/str "96" "rem")}
   :mw-none-ns {"max-width" (clojure.core/str "none")}
   :mw-100-m   {"max-width" (clojure.core/str "100%")}
   :mw1-m      {"max-width" (clojure.core/str "1" "rem")}
   :mw2-m      {"max-width" (clojure.core/str "2" "rem")}
   :mw3-m      {"max-width" (clojure.core/str "4" "rem")}
   :mw4-m      {"max-width" (clojure.core/str "8" "rem")}
   :mw5-m      {"max-width" (clojure.core/str "16" "rem")}
   :mw6-m      {"max-width" (clojure.core/str "32" "rem")}
   :mw7-m      {"max-width" (clojure.core/str "48" "rem")}
   :mw8-m      {"max-width" (clojure.core/str "64" "rem")}
   :mw9-m      {"max-width" (clojure.core/str "96" "rem")}
   :mw-none-m  {"max-width" (clojure.core/str "none")}
   :mw-100-l   {"max-width" (clojure.core/str "100%")}
   :mw1-l      {"max-width" (clojure.core/str "1" "rem")}
   :mw2-l      {"max-width" (clojure.core/str "2" "rem")}
   :mw3-l      {"max-width" (clojure.core/str "4" "rem")}
   :mw4-l      {"max-width" (clojure.core/str "8" "rem")}
   :mw5-l      {"max-width" (clojure.core/str "16" "rem")}
   :mw6-l      {"max-width" (clojure.core/str "32" "rem")}
   :mw7-l      {"max-width" (clojure.core/str "48" "rem")}
   :mw8-l      {"max-width" (clojure.core/str "64" "rem")}
   :mw9-l      {"max-width" (clojure.core/str "96" "rem")}
   :mw-none-l  {"max-width" (clojure.core/str "none")}})
