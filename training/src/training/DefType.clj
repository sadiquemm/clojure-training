(ns training.DefType)


(defprotocol Calc
  (add [this])
  (mul [this])
  )

(deftype Number1 [num1 num2]
  Calc
  (add [this]
    (+ num1 num2)
    )

  (mul [this]
    (* num1 num2)
    )
  )

(defn -main
  [& args]
  (let [cal (Number1. 2 5)]
    (println "Add" (add cal))
    (println "Mul" (mul cal))
    )
  (println "defProtocol & deftype")
  )


(-main)