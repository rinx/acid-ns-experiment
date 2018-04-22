(ns acid-ns-experiment.experiment)

(defn experiment []
  (println "I'm in " *ns*)
  :ok)

(comment
  (experiment))
