; Last updated: 14/07/2026, 14:44:47
(define/contract (sum num1 num2)
  (-> exact-integer? exact-integer? exact-integer?)
  (+ num1 num2)
  )