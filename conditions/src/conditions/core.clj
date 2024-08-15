(ns conditions.core
  (:gen-class))
(declare condition-if)
(declare case-test)
(declare cond-test)

(defn -main
  [& args]

  ;;if condition
  ;;(condition-if)

  ;;Case example
  ;;(case-test)

  ;;Cond example
  ;;(cond-test)
  )


(defn cond-test
  []
  (def var 100)
  (cond
    (<= var 5) (println "less than 10")
    (<= var 20) (println "less than 20")
    (<= var 30) (println "less than 30")
    :else
    (println "else cond")
    )

  )

(defn case-test
  []
  (def var "1")
  (case var
        "2" (println "two")
        "1" (println "one")
        )
  )
(defn condition-if
  []
  (if (= 2 2)
    (println "True")
    (println "False")
    )
  )

