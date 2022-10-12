; 1. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  ultimo  que  receba  uma  lista  e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn ultimo [lista]
  (if (= (count lista) 1)
    (first lista)
    (ultimo (rest lista))))

(println "ultimo: entrada: '(75 38 41 98 25 74 2 68); resultado:" (ultimo '(75 38 41 98 25 74 2 68)))

; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e  devolva  o  penúltimo  elemento  desta  lista  usar as  funções  já  prontas  e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn penultimo [lista]
  (if (= (count lista) 2)
    (first lista)
    (penultimo (rest lista))))

(println "penultimo: entrada: '(75 38 41 98 25 74 2 68); resultado:" (penultimo '(75 38 41 98 25 74 2 68)))

; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o  elemento que  está na  posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure

(defn elementoN [lista n]
  (if (= n 0)
    (first lista)
    (elementoN (rest lista) (- n 1))))

(println "elementoN: entrada: '(75 38 41 98 25 74 2 68) 3; resultado:" (elementoN '(75 38 41 98 25 74 2 68) 3))

; 4. Utilizando  a  linguagem Clojure,  crie  uma função  chamada  inverso  que  receba uma  lista  e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn inverso [lista]
  (if (= (count lista) 0)
    []
    (conj (inverso (rest lista)) (first lista))))

(println "inverso: entrada: '(3 1 2 4 5); resultado:" (inverso '(3 1 2 4 5)))

; 5. Utilizando a  linguagem Clojure, crie uma função chamada  mdc que receba  dois inteiros e devolve o mínimo divisor comum entre eles.  Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn resto [a b]
  (if (>= a b)
    (resto (- a b) b)
    a))

(defn mdc [a b]
  (if (= b 0)
    a
    (mdc b (resto a b))))

(println "mdc: entrada: 12 18; resultado:" (mdc 12 18))