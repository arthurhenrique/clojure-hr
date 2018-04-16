;Hello World N Times
(defn hello_word_n_times[n]
    ;break case
    (cond
     (> n 1) (hello_word_n_times (- n 1) ))
    ;code
    (print "Hello World")
)
;Repeat n itens of array
(defn g [length item]
  (if (> length 0)
    (println item)) 
  (if (> length 1)
    (g (- length 1) item)))
