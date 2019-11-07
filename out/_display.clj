(clojure.core/ns
 styles._display
 (:require
  [garden.def :refer [defstyles]]
  [garden.stylesheet :refer [at-media]]
  [garden.selectors :as sel]
  [garden.units :refer [px]]))
(defstyles
 root
 [:.dn {"display" (clojure.core/str "none")}]
 [:.di nil]
 [:.db {"display" (clojure.core/str "block")}]
 [:.dib {"display" (clojure.core/str "inline-block")}]
 [:.dit {"display" (clojure.core/str "inline-table")}]
 [:.dt {"display" (clojure.core/str "table")}]
 [:.dtc {"display" (clojure.core/str "table-cell")}]
 [:.dt-row {"display" (clojure.core/str "table-row")}]
 [:.dt-row-group {"display" (clojure.core/str "table-row-group")}]
 [:.dt-column {"display" (clojure.core/str "table-column")}]
 [:.dt-column-group
  {"display" (clojure.core/str "table-column-group")}]
 [:.dt--fixed
  {"table-layout" (clojure.core/str "fixed"),
   "width" (clojure.core/str "100%")}]
 [:.dn-ns {"display" (clojure.core/str "none")}]
 [:.di-ns nil]
 [:.db-ns {"display" (clojure.core/str "block")}]
 [:.dib-ns {"display" (clojure.core/str "inline-block")}]
 [:.dit-ns {"display" (clojure.core/str "inline-table")}]
 [:.dt-ns {"display" (clojure.core/str "table")}]
 [:.dtc-ns {"display" (clojure.core/str "table-cell")}]
 [:.dt-row-ns {"display" (clojure.core/str "table-row")}]
 [:.dt-row-group-ns {"display" (clojure.core/str "table-row-group")}]
 [:.dt-column-ns {"display" (clojure.core/str "table-column")}]
 [:.dt-column-group-ns
  {"display" (clojure.core/str "table-column-group")}]
 [:.dt--fixed-ns
  {"table-layout" (clojure.core/str "fixed"),
   "width" (clojure.core/str "100%")}]
 [:.dn-m {"display" (clojure.core/str "none")}]
 [:.di-m nil]
 [:.db-m {"display" (clojure.core/str "block")}]
 [:.dib-m {"display" (clojure.core/str "inline-block")}]
 [:.dit-m {"display" (clojure.core/str "inline-table")}]
 [:.dt-m {"display" (clojure.core/str "table")}]
 [:.dtc-m {"display" (clojure.core/str "table-cell")}]
 [:.dt-row-m {"display" (clojure.core/str "table-row")}]
 [:.dt-row-group-m {"display" (clojure.core/str "table-row-group")}]
 [:.dt-column-m {"display" (clojure.core/str "table-column")}]
 [:.dt-column-group-m
  {"display" (clojure.core/str "table-column-group")}]
 [:.dt--fixed-m
  {"table-layout" (clojure.core/str "fixed"),
   "width" (clojure.core/str "100%")}]
 [:.dn-l {"display" (clojure.core/str "none")}]
 [:.di-l nil]
 [:.db-l {"display" (clojure.core/str "block")}]
 [:.dib-l {"display" (clojure.core/str "inline-block")}]
 [:.dit-l {"display" (clojure.core/str "inline-table")}]
 [:.dt-l {"display" (clojure.core/str "table")}]
 [:.dtc-l {"display" (clojure.core/str "table-cell")}]
 [:.dt-row-l {"display" (clojure.core/str "table-row")}]
 [:.dt-row-group-l {"display" (clojure.core/str "table-row-group")}]
 [:.dt-column-l {"display" (clojure.core/str "table-column")}]
 [:.dt-column-group-l
  {"display" (clojure.core/str "table-column-group")}]
 [:.dt--fixed-l
  {"table-layout" (clojure.core/str "fixed"),
   "width" (clojure.core/str "100%")}])
