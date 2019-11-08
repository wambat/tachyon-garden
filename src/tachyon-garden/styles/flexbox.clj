(ns tachyon-garden.styles.flexbox
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]
   [tachyon-garden.styles.media-queries :refer [with-media]]))

(def styledefs
  {:flex {"display" (clojure.core/str "flex")}
   :inline-flex {"display" (clojure.core/str "inline-flex")}
   :flex-auto {"flex" (clojure.core/str "11" " " "11" " " "auto"),
               "min-width" (clojure.core/str "00"),
               "min-height" (clojure.core/str "00")}
   :flex-none {"flex" (clojure.core/str "none")}
   :flex-column {"flex-direction" (clojure.core/str "column")}
   :flex-row {"flex-direction" (clojure.core/str "row")}
   :flex-wrap {"flex-wrap" (clojure.core/str "wrap")}
   :flex-nowrap {"flex-wrap" (clojure.core/str "nowrap")}
   :flex-wrap-reverse {"flex-wrap" (clojure.core/str "wrap-reverse")}
   :flex-column-reverse {"flex-direction" (clojure.core/str "column-reverse")}
   :flex-row-reverse {"flex-direction" (clojure.core/str "row-reverse")}
   :items-start {"align-items" (clojure.core/str "flex-start")}
   :items-end {"align-items" (clojure.core/str "flex-end")}
   :items-center {"align-items" (clojure.core/str "center")}
   :items-baseline {"align-items" (clojure.core/str "baseline")}
   :items-stretch {"align-items" (clojure.core/str "stretch")}
   :self-start {"align-self" (clojure.core/str "flex-start")}
   :self-end {"align-self" (clojure.core/str "flex-end")}
   :self-center {"align-self" (clojure.core/str "center")}
   :self-baseline {"align-self" (clojure.core/str "baseline")}
   :self-stretch {"align-self" (clojure.core/str "stretch")}
   :justify-start {"justify-content" (clojure.core/str "flex-start")}
   :justify-end {"justify-content" (clojure.core/str "flex-end")}
   :justify-center {"justify-content" (clojure.core/str "center")}
   :justify-between {"justify-content" (clojure.core/str "space-between")}
   :justify-around {"justify-content" (clojure.core/str "space-around")}
   :content-start {"align-content" (clojure.core/str "flex-start")}
   :content-end {"align-content" (clojure.core/str "flex-end")}
   :content-center {"align-content" (clojure.core/str "center")}
   :content-between {"align-content" (clojure.core/str "space-between")}
   :content-around {"align-content" (clojure.core/str "space-around")}
   :content-stretch {"align-content" (clojure.core/str "stretch")}
   :order-0 {"order" (clojure.core/str "00")}
   :order-1 {"order" (clojure.core/str "11")}
   :order-2 {"order" (clojure.core/str "22")}
   :order-3 {"order" (clojure.core/str "33")}
   :order-4 {"order" (clojure.core/str "44")}
   :order-5 {"order" (clojure.core/str "55")}
   :order-6 {"order" (clojure.core/str "66")}
   :order-7 {"order" (clojure.core/str "77")}
   :order-8 {"order" (clojure.core/str "88")}
   :order-last {"order" (clojure.core/str "9999999999")}
   :flex-grow-0 {"flex-grow" (clojure.core/str "00")}
   :flex-grow-1 {"flex-grow" (clojure.core/str "11")}
   :flex-shrink-0 {"flex-shrink" (clojure.core/str "00")}
   :flex-shrink-1 {"flex-shrink" (clojure.core/str "11")}

   :flex-ns {"display" (clojure.core/str "flex")}
   :inline-flex-ns {"display" (clojure.core/str "inline-flex")}
   :flex-auto-ns {"flex" (clojure.core/str "11" " " "11" " " "auto"),
                  "min-width" (clojure.core/str "00"),
                  "min-height" (clojure.core/str "00")}
   :flex-none-ns {"flex" (clojure.core/str "none")}
   :flex-column-ns {"flex-direction" (clojure.core/str "column")}
   :flex-row-ns {"flex-direction" (clojure.core/str "row")}
   :flex-wrap-ns {"flex-wrap" (clojure.core/str "wrap")}
   :flex-nowrap-ns {"flex-wrap" (clojure.core/str "nowrap")}
   :flex-wrap-reverse-ns {"flex-wrap" (clojure.core/str "wrap-reverse")}
   :flex-column-reverse-ns {"flex-direction" (clojure.core/str "column-reverse")}
   :flex-row-reverse-ns {"flex-direction" (clojure.core/str "row-reverse")}
   :items-start-ns {"align-items" (clojure.core/str "flex-start")}
   :items-end-ns {"align-items" (clojure.core/str "flex-end")}
   :items-center-ns {"align-items" (clojure.core/str "center")}
   :items-baseline-ns {"align-items" (clojure.core/str "baseline")}
   :items-stretch-ns {"align-items" (clojure.core/str "stretch")}
   :self-start-ns {"align-self" (clojure.core/str "flex-start")}
   :self-end-ns {"align-self" (clojure.core/str "flex-end")}
   :self-center-ns {"align-self" (clojure.core/str "center")}
   :self-baseline-ns {"align-self" (clojure.core/str "baseline")}
   :self-stretch-ns {"align-self" (clojure.core/str "stretch")}
   :justify-start-ns {"justify-content" (clojure.core/str "flex-start")}
   :justify-end-ns {"justify-content" (clojure.core/str "flex-end")}
   :justify-center-ns {"justify-content" (clojure.core/str "center")}
   :justify-between-ns {"justify-content" (clojure.core/str "space-between")}
   :justify-around-ns {"justify-content" (clojure.core/str "space-around")}
   :content-start-ns {"align-content" (clojure.core/str "flex-start")}
   :content-end-ns {"align-content" (clojure.core/str "flex-end")}
   :content-center-ns {"align-content" (clojure.core/str "center")}
   :content-between-ns {"align-content" (clojure.core/str "space-between")}
   :content-around-ns {"align-content" (clojure.core/str "space-around")}
   :content-stretch-ns {"align-content" (clojure.core/str "stretch")}
   :order-0-ns {"order" (clojure.core/str "00")}
   :order-1-ns {"order" (clojure.core/str "11")}
   :order-2-ns {"order" (clojure.core/str "22")}
   :order-3-ns {"order" (clojure.core/str "33")}
   :order-4-ns {"order" (clojure.core/str "44")}
   :order-5-ns {"order" (clojure.core/str "55")}
   :order-6-ns {"order" (clojure.core/str "66")}
   :order-7-ns {"order" (clojure.core/str "77")}
   :order-8-ns {"order" (clojure.core/str "88")}
   :order-last-ns {"order" (clojure.core/str "9999999999")}
   :flex-grow-0-ns {"flex-grow" (clojure.core/str "00")}
   :flex-grow-1-ns {"flex-grow" (clojure.core/str "11")}
   :flex-shrink-0-ns {"flex-shrink" (clojure.core/str "00")}
   :flex-shrink-1-ns {"flex-shrink" (clojure.core/str "11")}

   :flex-m {"display" (clojure.core/str "flex")}
   :inline-flex-m {"display" (clojure.core/str "inline-flex")}
   :flex-auto-m {"flex" (clojure.core/str "11" " " "11" " " "auto"),
                 "min-width" (clojure.core/str "00"),
                 "min-height" (clojure.core/str "00")}
   :flex-none-m {"flex" (clojure.core/str "none")}
   :flex-column-m {"flex-direction" (clojure.core/str "column")}
   :flex-row-m {"flex-direction" (clojure.core/str "row")}
   :flex-wrap-m {"flex-wrap" (clojure.core/str "wrap")}
   :flex-nowrap-m {"flex-wrap" (clojure.core/str "nowrap")}
   :flex-wrap-reverse-m {"flex-wrap" (clojure.core/str "wrap-reverse")}
   :flex-column-reverse-m {"flex-direction" (clojure.core/str "column-reverse")}
   :flex-row-reverse-m {"flex-direction" (clojure.core/str "row-reverse")}
   :items-start-m {"align-items" (clojure.core/str "flex-start")}
   :items-end-m {"align-items" (clojure.core/str "flex-end")}
   :items-center-m {"align-items" (clojure.core/str "center")}
   :items-baseline-m {"align-items" (clojure.core/str "baseline")}
   :items-stretch-m {"align-items" (clojure.core/str "stretch")}
   :self-start-m {"align-self" (clojure.core/str "flex-start")}
   :self-end-m {"align-self" (clojure.core/str "flex-end")}
   :self-center-m {"align-self" (clojure.core/str "center")}
   :self-baseline-m {"align-self" (clojure.core/str "baseline")}
   :self-stretch-m {"align-self" (clojure.core/str "stretch")}
   :justify-start-m {"justify-content" (clojure.core/str "flex-start")}
   :justify-end-m {"justify-content" (clojure.core/str "flex-end")}
   :justify-center-m {"justify-content" (clojure.core/str "center")}
   :justify-between-m {"justify-content" (clojure.core/str "space-between")}
   :justify-around-m {"justify-content" (clojure.core/str "space-around")}
   :content-start-m {"align-content" (clojure.core/str "flex-start")}
   :content-end-m {"align-content" (clojure.core/str "flex-end")}
   :content-center-m {"align-content" (clojure.core/str "center")}
   :content-between-m {"align-content" (clojure.core/str "space-between")}
   :content-around-m {"align-content" (clojure.core/str "space-around")}
   :content-stretch-m {"align-content" (clojure.core/str "stretch")}
   :order-0-m {"order" (clojure.core/str "00")}
   :order-1-m {"order" (clojure.core/str "11")}
   :order-2-m {"order" (clojure.core/str "22")}
   :order-3-m {"order" (clojure.core/str "33")}
   :order-4-m {"order" (clojure.core/str "44")}
   :order-5-m {"order" (clojure.core/str "55")}
   :order-6-m {"order" (clojure.core/str "66")}
   :order-7-m {"order" (clojure.core/str "77")}
   :order-8-m {"order" (clojure.core/str "88")}
   :order-last-m {"order" (clojure.core/str "9999999999")}
   :flex-grow-0-m {"flex-grow" (clojure.core/str "00")}
   :flex-grow-1-m {"flex-grow" (clojure.core/str "11")}
   :flex-shrink-0-m {"flex-shrink" (clojure.core/str "00")}
   :flex-shrink-1-m {"flex-shrink" (clojure.core/str "11")}

   :flex-l {"display" (clojure.core/str "flex")}
   :inline-flex-l {"display" (clojure.core/str "inline-flex")}
   :flex-auto-l {"flex" (clojure.core/str "11" " " "11" " " "auto"),
                 "min-width" (clojure.core/str "00"),
                 "min-height" (clojure.core/str "00")}
   :flex-none-l {"flex" (clojure.core/str "none")}
   :flex-column-l {"flex-direction" (clojure.core/str "column")}
   :flex-row-l {"flex-direction" (clojure.core/str "row")}
   :flex-wrap-l {"flex-wrap" (clojure.core/str "wrap")}
   :flex-nowrap-l {"flex-wrap" (clojure.core/str "nowrap")}
   :flex-wrap-reverse-l {"flex-wrap" (clojure.core/str "wrap-reverse")}
   :flex-column-reverse-l {"flex-direction" (clojure.core/str "column-reverse")}
   :flex-row-reverse-l {"flex-direction" (clojure.core/str "row-reverse")}
   :items-start-l {"align-items" (clojure.core/str "flex-start")}
   :items-end-l {"align-items" (clojure.core/str "flex-end")}
   :items-center-l {"align-items" (clojure.core/str "center")}
   :items-baseline-l {"align-items" (clojure.core/str "baseline")}
   :items-stretch-l {"align-items" (clojure.core/str "stretch")}
   :self-start-l {"align-self" (clojure.core/str "flex-start")}
   :self-end-l {"align-self" (clojure.core/str "flex-end")}
   :self-center-l {"align-self" (clojure.core/str "center")}
   :self-baseline-l {"align-self" (clojure.core/str "baseline")}
   :self-stretch-l {"align-self" (clojure.core/str "stretch")}
   :justify-start-l {"justify-content" (clojure.core/str "flex-start")}
   :justify-end-l {"justify-content" (clojure.core/str "flex-end")}
   :justify-center-l {"justify-content" (clojure.core/str "center")}
   :justify-between-l {"justify-content" (clojure.core/str "space-between")}
   :justify-around-l {"justify-content" (clojure.core/str "space-around")}
   :content-start-l {"align-content" (clojure.core/str "flex-start")}
   :content-end-l {"align-content" (clojure.core/str "flex-end")}
   :content-center-l {"align-content" (clojure.core/str "center")}
   :content-between-l {"align-content" (clojure.core/str "space-between")}
   :content-around-l {"align-content" (clojure.core/str "space-around")}
   :content-stretch-l {"align-content" (clojure.core/str "stretch")}
   :order-0-l {"order" (clojure.core/str "00")}
   :order-1-l {"order" (clojure.core/str "11")}
   :order-2-l {"order" (clojure.core/str "22")}
   :order-3-l {"order" (clojure.core/str "33")}
   :order-4-l {"order" (clojure.core/str "44")}
   :order-5-l {"order" (clojure.core/str "55")}
   :order-6-l {"order" (clojure.core/str "66")}
   :order-7-l {"order" (clojure.core/str "77")}
   :order-8-l {"order" (clojure.core/str "88")}
   :order-last-l {"order" (clojure.core/str "9999999999")}
   :flex-grow-0-l {"flex-grow" (clojure.core/str "00")}
   :flex-grow-1-l {"flex-grow" (clojure.core/str "11")}
   :flex-shrink-0-l {"flex-shrink" (clojure.core/str "00")}
   :flex-shrink-1-l {"flex-shrink" (clojure.core/str "11")}})

(defn display [{:keys [media value] :as params}]
  (with-media (merge params
                     {:styledefs styledefs
                      :value (str "d" (when value (str "" (name value))))})))
