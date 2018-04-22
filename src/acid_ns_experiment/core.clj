(ns acid-ns-experiment.core)

(defn experiment []
  (println "I'm in " *ns*)
  :ok)

(comment
  (experiment))
