(ns exercise3)

(def fib-seq
     (lazy-cat [0 1] (map + (rest fib-seq) fib-seq)))

(defn fibonacci
  "Returns fibonacci sequence"
  [x]
  (last (take (+ x 1) fib-seq))
)






