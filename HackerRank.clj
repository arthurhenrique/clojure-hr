;Hello World N Times
(defn hello_world_n_times[n]
  ;break case
  (cond
    (> n 1) (hello_world_n_times (- n 1) ))
    ;code
    (print "Hello World"))
;unit test
(hello_world_n_times 5)

;List Repeats
(defn g [length item]
  (if (> length 0)
    (println item))
  (if (> length 1)
    (g (- length 1) item)))
;unit test
(g 2 2)

(defn f [length itens]
  (if (and (> length 0) (> (count itens) 0))
    (g length (peek itens)))
  (if (> (count itens) 0)
    (f length (pop itens))))
;unit test
(f 2 '(1 2 3))
