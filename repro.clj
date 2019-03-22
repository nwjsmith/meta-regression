(require 'clojure.reflect)

(defmacro reflect []
  (clojure.reflect/reflect java.lang.String))

(reflect)
