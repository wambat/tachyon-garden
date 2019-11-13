(ns tachyon-garden.styles.font-weight
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:normal    {"font-weight" (clojure.core/str "normal")}
   :b         {"font-weight" (clojure.core/str "bold")}
   :fw1       {"font-weight" (clojure.core/str "100")}
   :fw2       {"font-weight" (clojure.core/str "200")}
   :fw3       {"font-weight" (clojure.core/str "300")}
   :fw4       {"font-weight" (clojure.core/str "400")}
   :fw5       {"font-weight" (clojure.core/str "500")}
   :fw6       {"font-weight" (clojure.core/str "600")}
   :fw7       {"font-weight" (clojure.core/str "700")}
   :fw8       {"font-weight" (clojure.core/str "800")}
   :fw9       {"font-weight" (clojure.core/str "900")}
   :normal-ns {"font-weight" (clojure.core/str "normal")}
   :b-ns      {"font-weight" (clojure.core/str "bold")}
   :fw1-ns    {"font-weight" (clojure.core/str "100")}
   :fw2-ns    {"font-weight" (clojure.core/str "200")}
   :fw3-ns    {"font-weight" (clojure.core/str "300")}
   :fw4-ns    {"font-weight" (clojure.core/str "400")}
   :fw5-ns    {"font-weight" (clojure.core/str "500")}
   :fw6-ns    {"font-weight" (clojure.core/str "600")}
   :fw7-ns    {"font-weight" (clojure.core/str "700")}
   :fw8-ns    {"font-weight" (clojure.core/str "800")}
   :fw9-ns    {"font-weight" (clojure.core/str "900")}
   :normal-m  {"font-weight" (clojure.core/str "normal")}
   :b-m       {"font-weight" (clojure.core/str "bold")}
   :fw1-m     {"font-weight" (clojure.core/str "100")}
   :fw2-m     {"font-weight" (clojure.core/str "200")}
   :fw3-m     {"font-weight" (clojure.core/str "300")}
   :fw4-m     {"font-weight" (clojure.core/str "400")}
   :fw5-m     {"font-weight" (clojure.core/str "500")}
   :fw6-m     {"font-weight" (clojure.core/str "600")}
   :fw7-m     {"font-weight" (clojure.core/str "700")}
   :fw8-m     {"font-weight" (clojure.core/str "800")}
   :fw9-m     {"font-weight" (clojure.core/str "900")}
   :normal-l  {"font-weight" (clojure.core/str "normal")}
   :b-l       {"font-weight" (clojure.core/str "bold")}
   :fw1-l     {"font-weight" (clojure.core/str "100")}
   :fw2-l     {"font-weight" (clojure.core/str "200")}
   :fw3-l     {"font-weight" (clojure.core/str "300")}
   :fw4-l     {"font-weight" (clojure.core/str "400")}
   :fw5-l     {"font-weight" (clojure.core/str "500")}
   :fw6-l     {"font-weight" (clojure.core/str "600")}
   :fw7-l     {"font-weight" (clojure.core/str "700")}
   :fw8-l     {"font-weight" (clojure.core/str "800")}
   :fw9-l     {"font-weight" (clojure.core/str "900")}})

(defn display [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "d" (when value (str "" (name value))))})))
