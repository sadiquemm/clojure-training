(ns training.StructMapExample)

(defn struct-map1
  []
  (defstruct pet :PetName :PetAge)
  (def mypet (struct pet "Cat" 1))
  ;;{:PetName Cat, :PetAge 1}
  (println mypet)


  (def newPet (struct-map pet :PetAge 2 :PetName "Dog"))
  ;;{:PetName Dog, :PetAge 2}
  (println newPet)

  ;;assoc - to change key name
  (def newDog (assoc newPet :PetName "New Dog updated"))
  ;;{:PetName New Dog updated, :PetAge 2}
  (println newDog)
  )

(struct-map1)