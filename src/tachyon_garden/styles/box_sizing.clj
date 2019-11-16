(ns tachyon-garden.styles.box-sizing
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
  root
  [:html
   :body
   :div
   :article
   :aside
   :section
   :main
   :nav
   :footer
   :header
   :form
   :fieldset
   :legend
   :pre
   :code
   :a
   :h1
   :h2
   :h3
   :h4
   :h5
   :h6
   :p
   :ul
   :ol
   :li
   :dl
   :dt
   :dd
   :blockquote
   :figcaption
   :figure
   :textarea
   :table
   :td
   :th
   :tr
   "input[type='email']"
   "input[type='number']"
   "input[type='password']"
   "input[type='tel']"
   "input[type='text']"
   "input[type='url']"
   {"box-sizing" (clojure.core/str "border-box")}])

(def styledefs
 {:border-box {"box-sizing" (clojure.core/str "border-box")}})
