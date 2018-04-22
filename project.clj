(defproject acid-ns-experiment "0.1.0-SNAPSHOT"
  :description "namespace experiment for acid.nvim PR #22"
  :url "https://github.com/rinx/acid-ns-experiment"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0-alpha4"]]
  :main ^:skip-aot acid-ns-experiment.core
  :target-path "target/%s"
  :source-paths ["src" "src/alts"]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]}
             :uberjar {:aot :all}})
