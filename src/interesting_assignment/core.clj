(ns interesting-assignment.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def location-item-mappings
  {
   :Warehouse
               {
                :Paracetamol 10
                :Ibuprofen   50
                :Syringe     80
                :Scalpel     100
                }

   :ICU        {
                :Paracetamol 0
                :Ibuprofen   20
                :Syringe     7
                :Scalpel     8
                }

   :Dispensary {
                :Paracetamol 50
                :Ibuprofen   33
                :Syringe     10
                :Scalpel     80
                }
   })


(defn  [type location item colli location-item-mappings]
  (assoc-in b [location item] (type colli (item (location location-item-mappings)))))


