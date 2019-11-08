(ns tachyon-garden.styles.heights
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:h1 {"height" (clojure.core/str "11" " " "rem")}
   :h2 {"height" (clojure.core/str "22" " " "rem")}
   :h3 {"height" (clojure.core/str "44" " " "rem")}
   :h4 {"height" (clojure.core/str "88" " " "rem")}
   :h5 {"height" (clojure.core/str "1616" " " "rem")}
   :h-25 {"height" (clojure.core/str "25%")}
   :h-50 {"height" (clojure.core/str "50%")}
   :h-75 {"height" (clojure.core/str "75%")}
   :h-100 {"height" (clojure.core/str "100%")}
   :min-h-100 {"min-height" (clojure.core/str "100%")}
   :vh-25 {"height" (clojure.core/str "2525" " " "vh")}
   :vh-50 {"height" (clojure.core/str "5050" " " "vh")}
   :vh-75 {"height" (clojure.core/str "7575" " " "vh")}
   :vh-100 {"height" (clojure.core/str "100100" " " "vh")}
   :min-vh-100 {"min-height" (clojure.core/str "100100" " " "vh")}
   :h-auto {"height" (clojure.core/str "auto")}
   :h-inherit {"height" (clojure.core/str "inherit")}
   :h1-ns {"height" (clojure.core/str "11" " " "rem")}
   :h2-ns {"height" (clojure.core/str "22" " " "rem")}
   :h3-ns {"height" (clojure.core/str "44" " " "rem")}
   :h4-ns {"height" (clojure.core/str "88" " " "rem")}
   :h5-ns {"height" (clojure.core/str "1616" " " "rem")}
   :h-25-ns {"height" (clojure.core/str "25%")}
   :h-50-ns {"height" (clojure.core/str "50%")}
   :h-75-ns {"height" (clojure.core/str "75%")}
   :h-100-ns {"height" (clojure.core/str "100%")}
   :min-h-100-ns {"min-height" (clojure.core/str "100%")}
   :vh-25-ns {"height" (clojure.core/str "2525" " " "vh")}
   :vh-50-ns {"height" (clojure.core/str "5050" " " "vh")}
   :vh-75-ns {"height" (clojure.core/str "7575" " " "vh")}
   :vh-100-ns {"height" (clojure.core/str "100100" " " "vh")}
   :min-vh-100-ns {"min-height" (clojure.core/str "100100" " " "vh")}
   :h-auto-ns {"height" (clojure.core/str "auto")}
   :h-inherit-ns {"height" (clojure.core/str "inherit")}
   :h1-m {"height" (clojure.core/str "11" " " "rem")}
   :h2-m {"height" (clojure.core/str "22" " " "rem")}
   :h3-m {"height" (clojure.core/str "44" " " "rem")}
   :h4-m {"height" (clojure.core/str "88" " " "rem")}
   :h5-m {"height" (clojure.core/str "1616" " " "rem")}
   :h-25-m {"height" (clojure.core/str "25%")}
   :h-50-m {"height" (clojure.core/str "50%")}
   :h-75-m {"height" (clojure.core/str "75%")}
   :h-100-m {"height" (clojure.core/str "100%")}
   :min-h-100-m {"min-height" (clojure.core/str "100%")}
   :vh-25-m {"height" (clojure.core/str "2525" " " "vh")}
   :vh-50-m {"height" (clojure.core/str "5050" " " "vh")}
   :vh-75-m {"height" (clojure.core/str "7575" " " "vh")}
   :vh-100-m {"height" (clojure.core/str "100100" " " "vh")}
   :min-vh-100-m {"min-height" (clojure.core/str "100100" " " "vh")}
   :h-auto-m {"height" (clojure.core/str "auto")}
   :h-inherit-m {"height" (clojure.core/str "inherit")}
   :h1-l {"height" (clojure.core/str "11" " " "rem")}
   :h2-l {"height" (clojure.core/str "22" " " "rem")}
   :h3-l {"height" (clojure.core/str "44" " " "rem")}
   :h4-l {"height" (clojure.core/str "88" " " "rem")}
   :h5-l {"height" (clojure.core/str "1616" " " "rem")}
   :h-25-l {"height" (clojure.core/str "25%")}
   :h-50-l {"height" (clojure.core/str "50%")}
   :h-75-l {"height" (clojure.core/str "75%")}
   :h-100-l {"height" (clojure.core/str "100%")}
   :min-h-100-l {"min-height" (clojure.core/str "100%")}
   :vh-25-l {"height" (clojure.core/str "2525" " " "vh")}
   :vh-50-l {"height" (clojure.core/str "5050" " " "vh")}
   :vh-75-l {"height" (clojure.core/str "7575" " " "vh")}
   :vh-100-l {"height" (clojure.core/str "100100" " " "vh")}
   :min-vh-100-l {"min-height" (clojure.core/str "100100" " " "vh")}
   :h-auto-l {"height" (clojure.core/str "auto")}
   :h-inherit-l {"height" (clojure.core/str "inherit")}})
