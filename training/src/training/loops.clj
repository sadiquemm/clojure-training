(ns training.loops)

;;Loop
(defn loop-ex
  []
  (loop [x 0 ]
    (when (< x 10)
      (println "loop x " x)
      (recur (inc x))
      ))
  )
(loop-ex)


;;Dotimes
(defn dotimes-ex
  []
  (dotimes [x 10]
    (println "do times : " x)
    ))
(dotimes-ex)

;;while do
(defn while-ex
  [count]
  (def x (atom 0))
  (while (< @x count)
    (do (println "while x" @x))
    (swap! x inc))
  )
(while-ex 10)

;;do seq
(defn doseq-ex
  [seq]
  (doseq [x seq]
    (println (inc x))
    )
  )
(doseq-ex [4 3 0 6])