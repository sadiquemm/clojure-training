(ns training.Atoms)

(defn atoms-ex
  []
  (def x (atom 10))
  (println "x " @x)

  (swap! x inc)
  (println "swap " @x)

  (reset! x 20)
  (println "reset " @x)

  ;; compare x with 20 if equal set 50
  (compare-and-set! x 20 50)
  (println "compare-and-set! " @x)
  )

(atoms-ex)