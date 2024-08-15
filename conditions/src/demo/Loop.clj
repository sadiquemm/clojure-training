(ns demo.Loop)

(defn Loop
  []
  (println "loop sample")
  (loop [x 0]
      (when (< x 10)
        (println "Value x " x)
        (recur (inc x))
        )
        )
  )


(Loop)