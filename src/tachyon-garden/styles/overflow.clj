(ns tachyon-garden.styles.overflow
  (:require
   [garden.def :refer [defstyles]]
   [garden.stylesheet :refer [at-media]]
   [garden.selectors :as sel]
   [garden.units :refer [px]]))

(def styledefs
  {:overflow-visible {"overflow" (clojure.core/str "visible")}
   :overflow-hidden {"overflow" (clojure.core/str "hidden")}
   :overflow-scroll {"overflow" (clojure.core/str "scroll")}
   :overflow-auto {"overflow" (clojure.core/str "auto")}
   :overflow-x-visible {"overflow-x" (clojure.core/str "visible")}
   :overflow-x-hidden {"overflow-x" (clojure.core/str "hidden")}
   :overflow-x-scroll {"overflow-x" (clojure.core/str "scroll")}
   :overflow-x-auto {"overflow-x" (clojure.core/str "auto")}
   :overflow-y-visible {"overflow-y" (clojure.core/str "visible")}
   :overflow-y-hidden {"overflow-y" (clojure.core/str "hidden")}
   :overflow-y-scroll {"overflow-y" (clojure.core/str "scroll")}
   :overflow-y-auto {"overflow-y" (clojure.core/str "auto")}
   :overflow-visible-ns {"overflow" (clojure.core/str "visible")}
   :overflow-hidden-ns {"overflow" (clojure.core/str "hidden")}
   :overflow-scroll-ns {"overflow" (clojure.core/str "scroll")}
   :overflow-auto-ns {"overflow" (clojure.core/str "auto")}
   :overflow-x-visible-ns {"overflow-x" (clojure.core/str "visible")}
   :overflow-x-hidden-ns {"overflow-x" (clojure.core/str "hidden")}
   :overflow-x-scroll-ns {"overflow-x" (clojure.core/str "scroll")}
   :overflow-x-auto-ns {"overflow-x" (clojure.core/str "auto")}
   :overflow-y-visible-ns {"overflow-y" (clojure.core/str "visible")}
   :overflow-y-hidden-ns {"overflow-y" (clojure.core/str "hidden")}
   :overflow-y-scroll-ns {"overflow-y" (clojure.core/str "scroll")}
   :overflow-y-auto-ns {"overflow-y" (clojure.core/str "auto")}
   :overflow-visible-m {"overflow" (clojure.core/str "visible")}
   :overflow-hidden-m {"overflow" (clojure.core/str "hidden")}
   :overflow-scroll-m {"overflow" (clojure.core/str "scroll")}
   :overflow-auto-m {"overflow" (clojure.core/str "auto")}
   :overflow-x-visible-m {"overflow-x" (clojure.core/str "visible")}
   :overflow-x-hidden-m {"overflow-x" (clojure.core/str "hidden")}
   :overflow-x-scroll-m {"overflow-x" (clojure.core/str "scroll")}
   :overflow-x-auto-m {"overflow-x" (clojure.core/str "auto")}
   :overflow-y-visible-m {"overflow-y" (clojure.core/str "visible")}
   :overflow-y-hidden-m {"overflow-y" (clojure.core/str "hidden")}
   :overflow-y-scroll-m {"overflow-y" (clojure.core/str "scroll")}
   :overflow-y-auto-m {"overflow-y" (clojure.core/str "auto")}
   :overflow-visible-l {"overflow" (clojure.core/str "visible")}
   :overflow-hidden-l {"overflow" (clojure.core/str "hidden")}
   :overflow-scroll-l {"overflow" (clojure.core/str "scroll")}
   :overflow-auto-l {"overflow" (clojure.core/str "auto")}
   :overflow-x-visible-l {"overflow-x" (clojure.core/str "visible")}
   :overflow-x-hidden-l {"overflow-x" (clojure.core/str "hidden")}
   :overflow-x-scroll-l {"overflow-x" (clojure.core/str "scroll")}
   :overflow-x-auto-l {"overflow-x" (clojure.core/str "auto")}
   :overflow-y-visible-l {"overflow-y" (clojure.core/str "visible")}
   :overflow-y-hidden-l {"overflow-y" (clojure.core/str "hidden")}
   :overflow-y-scroll-l {"overflow-y" (clojure.core/str "scroll")}
   :overflow-y-auto-l {"overflow-y" (clojure.core/str "auto")}})