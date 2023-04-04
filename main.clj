; this is a function that takes in 2 arguments and calculates their sum 
(defn add [x y]
  (+ x y))

; string declaration, assignment, concatentation, and printing
(def title1 "\nWelcome to Daniel's ")
(def title2 "Clojure Arithmetic App\n")
(def title (str title1 title2))
(println title)

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

; for loop char array
(def sumArray "Sum")

; function that calls multi param function to calculate sum 
(defn calcSum []
  (let [x (add (val1) (val2))]
    (doseq [i sumArray]
      (print i))
    (println " " x "\n")))

(calcSum)

(print "Printing values using a for loop: ")
; for loop prints all values between 4 and 20 and adds it with itself at each iteration 
(println (for [i (range 4 20)]
           (+ i i)))

println "\n"
(print "Printing values using a while loop: ")
; using a while loop to print numbers 1 -10
(let [i (atom 1)] ; i is the atom that is initially set to 0
  (while (< @i 11); while loop statement that iterates while less than 10
    (print @i " ")
    (swap! i inc))) ; increments i each iteration 
(print "\nPrinting values using a dotime loop: ")
(dotimes [i 10]
  (print i " "))
; using reduce to find the sum of all of these numbers starting at 0
(println "\nPrinting the sum of 1 2 3 4 5: " (reduce + 0 [1 2 3 4 5]))

(println "Printing 2 3 4 5 6 but one less using map" (map dec [2 3 4 5 6]))

(println "\nPrinting only the odds from 1 2 3 4 5 6 7 8 using filter: " (filter odd? [1 2 3 4 5 6 7 8]))



; for loop @
; while loop @
; doseq @
; dotimes @
; reduce @
; map @
; filter @
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
