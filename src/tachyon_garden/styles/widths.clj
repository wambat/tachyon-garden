(ns tachyon-garden.styles.widths
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:w1              {"width" (clojure.core/str "1" " " "rem")}
   :w2              {"width" (clojure.core/str "2" " " "rem")}
   :w3              {"width" (clojure.core/str "4" " " "rem")}
   :w4              {"width" (clojure.core/str "8" " " "rem")}
   :w5              {"width" (clojure.core/str "16" " " "rem")}
   :w-10            {"width" (clojure.core/str "10%")}
   :w-20            {"width" (clojure.core/str "20%")}
   :w-25            {"width" (clojure.core/str "25%")}
   :w-30            {"width" (clojure.core/str "30%")}
   :w-33            {"width" (clojure.core/str "33%")}
   :w-34            {"width" (clojure.core/str "34%")}
   :w-40            {"width" (clojure.core/str "40%")}
   :w-50            {"width" (clojure.core/str "50%")}
   :w-60            {"width" (clojure.core/str "60%")}
   :w-70            {"width" (clojure.core/str "70%")}
   :w-75            {"width" (clojure.core/str "75%")}
   :w-80            {"width" (clojure.core/str "80%")}
   :w-90            {"width" (clojure.core/str "90%")}
   :w-100           {"width" (clojure.core/str "100%")}
   :w-third         {"width" (clojure.core/str "calc")}
   :w-two-thirds    {"width" (clojure.core/str "calc")}
   :w-auto          {"width" (clojure.core/str "auto")}
   :w1-ns           {"width" (clojure.core/str "1" " " "rem")}
   :w2-ns           {"width" (clojure.core/str "2" " " "rem")}
   :w3-ns           {"width" (clojure.core/str "4" " " "rem")}
   :w4-ns           {"width" (clojure.core/str "8" " " "rem")}
   :w5-ns           {"width" (clojure.core/str "16" " " "rem")}
   :w-10-ns         {"width" (clojure.core/str "10%")}
   :w-20-ns         {"width" (clojure.core/str "20%")}
   :w-25-ns         {"width" (clojure.core/str "25%")}
   :w-30-ns         {"width" (clojure.core/str "30%")}
   :w-33-ns         {"width" (clojure.core/str "33%")}
   :w-34-ns         {"width" (clojure.core/str "34%")}
   :w-40-ns         {"width" (clojure.core/str "40%")}
   :w-50-ns         {"width" (clojure.core/str "50%")}
   :w-60-ns         {"width" (clojure.core/str "60%")}
   :w-70-ns         {"width" (clojure.core/str "70%")}
   :w-75-ns         {"width" (clojure.core/str "75%")}
   :w-80-ns         {"width" (clojure.core/str "80%")}
   :w-90-ns         {"width" (clojure.core/str "90%")}
   :w-100-ns        {"width" (clojure.core/str "100%")}
   :w-third-ns      {"width" (clojure.core/str "calc")}
   :w-two-thirds-ns {"width" (clojure.core/str "calc")}
   :w-auto-ns       {"width" (clojure.core/str "auto")}
   :w1-m            {"width" (clojure.core/str "1" " " "rem")}
   :w2-m            {"width" (clojure.core/str "2" " " "rem")}
   :w3-m            {"width" (clojure.core/str "4" " " "rem")}
   :w4-m            {"width" (clojure.core/str "8" " " "rem")}
   :w5-m            {"width" (clojure.core/str "1616" " " "rem")}
   :w-10-m          {"width" (clojure.core/str "10%")}
   :w-20-m          {"width" (clojure.core/str "20%")}
   :w-25-m          {"width" (clojure.core/str "25%")}
   :w-30-m          {"width" (clojure.core/str "30%")}
   :w-33-m          {"width" (clojure.core/str "33%")}
   :w-34-m          {"width" (clojure.core/str "34%")}
   :w-40-m          {"width" (clojure.core/str "40%")}
   :w-50-m          {"width" (clojure.core/str "50%")}
   :w-60-m          {"width" (clojure.core/str "60%")}
   :w-70-m          {"width" (clojure.core/str "70%")}
   :w-75-m          {"width" (clojure.core/str "75%")}
   :w-80-m          {"width" (clojure.core/str "80%")}
   :w-90-m          {"width" (clojure.core/str "90%")}
   :w-100-m         {"width" (clojure.core/str "100%")}
   :w-third-m       {"width" (clojure.core/str "calc")}
   :w-two-thirds-m  {"width" (clojure.core/str "calc")}
   :w-auto-m        {"width" (clojure.core/str "auto")}
   :w1-l            {"width" (clojure.core/str "1" " " "rem")}
   :w2-l            {"width" (clojure.core/str "2" " " "rem")}
   :w3-l            {"width" (clojure.core/str "4" " " "rem")}
   :w4-l            {"width" (clojure.core/str "8" " " "rem")}
   :w5-l            {"width" (clojure.core/str "1616" " " "rem")}
   :w-10-l          {"width" (clojure.core/str "10%")}
   :w-20-l          {"width" (clojure.core/str "20%")}
   :w-25-l          {"width" (clojure.core/str "25%")}
   :w-30-l          {"width" (clojure.core/str "30%")}
   :w-33-l          {"width" (clojure.core/str "33%")}
   :w-34-l          {"width" (clojure.core/str "34%")}
   :w-40-l          {"width" (clojure.core/str "40%")}
   :w-50-l          {"width" (clojure.core/str "50%")}
   :w-60-l          {"width" (clojure.core/str "60%")}
   :w-70-l          {"width" (clojure.core/str "70%")}
   :w-75-l          {"width" (clojure.core/str "75%")}
   :w-80-l          {"width" (clojure.core/str "80%")}
   :w-90-l          {"width" (clojure.core/str "90%")}
   :w-100-l         {"width" (clojure.core/str "100%")}
   :w-third-l       {"width" (clojure.core/str "calc")}
   :w-two-thirds-l  {"width" (clojure.core/str "calc")}
   :w-auto-l        {"width" (clojure.core/str "auto")}})