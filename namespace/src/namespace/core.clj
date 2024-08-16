(ns namespace.core
  (:gen-class)
  
  (:require [namespace.dir1.dir2.greeting_file :as dir]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (dir/greeting))
