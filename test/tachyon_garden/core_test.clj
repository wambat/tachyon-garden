(ns tachyon-garden.core-test
  (:require [clojure.test :refer :all]
            [tachyon-garden.core :refer :all]))
#_(deftest translate
  (testing "Translate into garden"
    (is (=
         `(ns test.problems
            (:require [theme.config :refer :all]))
         ;; (is (= (parse-file-tree "collections/form") ""))
         (translate-stylesheet "collections.form" (parse-file-tree "collections/form"))
         #_(translate-stylesheet "test.problems"
                               (parse-file-tree "test/" "problems"))))))

(deftest translate
  (testing "Translate into garden"
    (is (=
         `(ns test.problems
            (:require [theme.config :refer :all]))
         (translate-stylesheet "test.problems"
                               (parse-file-tree "resources/test/problems.less"))))))

#_(deftest parse
  (testing "Parse into structure"
 
    (is (= (parse-file-tree "test/" "problems")
           '(:stylesheet
            (:statement
             (:variableDeclaration
              (:variableName "@" "element") ":"
              (:values (:commandStatement (:expression "'form'")))) ";")
            (:statement
             (:importDeclaration "@import" "(" (:importOption "multiple") ")" (:referenceUrl "'../../theme.config'") ";"))
            (:statement
             (:ruleset
              (:selectors
               (:selector (:element (:identifier ".ui.form"))
                          (:element (:identifier ".field"))
                          (:element (:identifier ".prompt.label"))))
              (:block
               "{"
               (:property
                (:identifier "white-space") ":"
                (:values (:commandStatement (:expression (:identifier "normal"))))) ";"
               (:property
                (:identifier "background") ":"
                (:values (:commandStatement (:expression (:variableName "@" "promptBackground") "!important")))) ";"
               (:property
                (:identifier "border") ":"
                (:values (:commandStatement (:expression (:variableName "@" "promptBorder") "!important")))) ";"
               (:property (:identifier "color") ":"
                          (:values (:commandStatement (:expression (:variableName "@" "promptTextColor") "!important")))) ";" "}")))
            (:statement
             (:ruleset
              (:selectors
               (:selector (:element (:identifier ".ui.form")) (:element (:pseudo "::" "-webkit-datetime-edit"))) ","
               (:selector (:element (:identifier ".ui.form")) (:element (:pseudo "::" "-webkit-inner-spin-button"))))
              (:block "{"
                      (:property (:identifier "height") ":" (:values (:commandStatement (:expression (:variableName "@" "inputLineHeight"))))) ";" "}")))
            (:statement
             (:ruleset (:selectors (:selector (:element (:identifier ".ui.form")) (:element (:identifier ".field")) (:selectorPrefix ">") (:element (:identifier ".selection.dropdown")) (:selectorPrefix ">") (:element (:identifier ".dropdown.icon")))) (:block "{" (:property (:identifier "float") ":" (:values (:commandStatement (:expression (:identifier "right"))))) ";" "}"))))))

    ))
