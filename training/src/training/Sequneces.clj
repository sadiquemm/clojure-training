(ns training.Sequneces)


(defn test-seq
  []
  (def colors (seq ["Red" "Blue"] ) )
  (println "Colors" colors)
  ;; (Green Red Blue)
  (println "Cons append to front" (cons "Green" colors )  )

  ;;Conj keep the structure and append
  ;; (Yellow Red Blue)
  (println "Conj append to front" (conj  colors "Yellow")  )

  ;;Conj with vector
  ;; Vector add elements to last
  ;; [1 4 2 100]
  (println "Conj vector" (conj  [1 4 2] 100)  )


  ;;Concat uses to merge collections
  ;;(Red Blue NewREd New Green)
  (println "Concat " (concat colors ["New Red", "New Green"] )  )

  ;;Distinct
  ;;(Red Green)
  (println "Distinct " (distinct (seq ["Red" "Red", "Green"]))  )

  ;;Sort
  ;; (0 1 2 4 100)
  (println "Sorting" (sort  [1 4 2 0 100] )  )






  )

(test-seq)