(ns howdy.code)

;; map
(def m {:key :value, "a" "apple", "b" ["berry" "barry"]})
(:key m)
(m :key)
(m "b")

;; Person
(def me {:ln "Seaton" :fn "Greg" :hobbies [:ski :read :surf]})
(:ln me)
(me :fn)
(me :hobbies)

;; filter --------------------------------------------
(filter odd? [1, 2,  3 4 5])
(filter even? [1 2 3 4 5 6])

(defn lt3 [n] (< n 3))

(filter lt3 [1 2 0 2 3 4 6])

(mod 24 5)

(+ 3 2)

(+ 2.23 4.32 2 3 5 4 2 4)

(filter #(< %1 4) [1 2 3 4])

;; map ------------------------------------------------
(map inc [1 2 3 4 5])
(map dec [1 2 3 4 5])

(defn double [n] (* 2 n))
(map double [1 2 3 4 5 6])

(map #(* % %) [1 2 3 4 5])

;; reduce -----------------------------------------------
(reduce + [1 2 3 4])
(reduce - [1 2 3 4])
(reduce + 11 [1 2 3 4])

;; filter as a reduce
(reduce #(if (even? %2) (conj %1 %2) %1) [] [1 2 3 4])
(reduce #(if (odd? %2) (conj %1 %2) %1) [] [1 2 3 4])

(defn filter-as-a-reduce
  [f v]
  (reduce #(if (f %2) (conj %1 %2) %1) [] v))

(filter odd? [1 2 3 4 5 6 7])
(filter-as-a-reduce odd? [1 2 3 4 5 6 7])
(filter-as-a-reduce even? [1 2 3 4 5])

;; map as a reduce
(reduce #(conj %1 (inc %2)) [] [1 2 3 4 5 6])

(defn map-as-a-reduce
  [f v]
  (reduce #(conj %1 (f %2)) [] v))

(map-as-a-reduce inc [1 2 3 4 5])









