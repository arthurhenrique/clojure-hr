;Hello World N Times
(defn hello_word_n_times[n]
    ;break case
    (cond
     (> n 1) (hello_word_n_times (- n 1) ))
    ;code
    (print "Hello World")
)
