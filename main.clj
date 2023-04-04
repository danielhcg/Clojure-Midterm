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
(def titleMessage "\nWelcome to Daniel's Clojure Calculator App")
(println titleMessage)
(def prompt1 "\nSelect an operation ")
(def prompt2 "to perfrom (+, -, *, /)")
(def prompt (str prompt1 prompt2))
(println prompt)

; declaring a variable called useOP and assigning it character by extracting first character of user inputted string 
(def useOP (subs (read-line) 0 1))

; prompting user for first operand, returns value 1 
(defn val1 []
  (print "Enter value 1: ")
  (flush); to flush out buffer
  (Double/parseDouble (read-line))) 

; prompting user for second operand, returns value 1 
(defn val2 []
  (print "Enter value 2: ")
  (flush); to flush out buffer
  (Double/parseDouble (read-line))) 

(defn calcSum []
  (let [x (add (val1) (val2))]
    (println "sum = " x)))

(calcSum)




; for loop
; while loop
; doseq
; dotimes
; reduce
; map
; filter
;----------------------------
; double declaration @
; double assignment @
; print double @

; char declaration @
; char assignment @
; print char @

; print string @
;---------------------------
; string delcaration @
; string assignment @
; string concatenation @
;---------------------------
; multi parameter function @
