; Last updated: 14/07/2026, 14:48:19
(define/contract (get-sum a b)
  (-> exact-integer? exact-integer? exact-integer?)
  (+ a b)
  )