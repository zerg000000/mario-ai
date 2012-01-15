(defproject mario-ai-example-clj "1.0.0-SNAPSHOT"
  :description "Example Project for Mario AI in clojure, you can use it as template project."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ch.idsia/mario-ai "0.0.1-SNAPSHOT"]]
  :repositories {"mario-ai repos" "http://zerg000000.github.com/mario-ai/repository"}
  ;need to specify namespace which have gen-class
  :aot [mario-ai-example-clj.agents]
  :main mario-ai-example-clj.core)
