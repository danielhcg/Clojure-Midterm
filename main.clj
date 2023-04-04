; this is a function that takes in 2 arguments and calculates their sum 
(defn add [x y]
  (+ x y))

; this is a function that takes in 2 arguemtns and calculates their difference
(defn subtract [x y]
  (- x y))

; this is a function that takes in 2 arguments and calculates their product
(defn multiply [x y]
  (* x y))

; this is a function that takes in 2 arguemtns and calculates their quotient
(defn divide [x y]
  (/ x y))

; string declaration, assignment, concatentation, and printing
(def titleMessage "Welcome to Daniel's Clojure Calculator App")
(println titleMessage)
(def prompt1 "\nSelect an operation ")
(def prompt2 "to perfrom (+, -, *, /)")
(def prompt (str prompt1 prompt2))
(println prompt)



; for loop
; while loop
; doseq
; dotimes
; reduce
; map
; filter
;----------------------------
; double declaration 
; double assignment 
; print double

; char declaration 
; char assignment
; print char 

; print string @
;---------------------------
; string delcaration @
; string assignment @
; string concatenation @
;---------------------------
; multi parameter function @
