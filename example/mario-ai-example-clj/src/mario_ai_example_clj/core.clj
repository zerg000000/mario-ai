(ns mario-ai-example-clj.core
  (:require [mario-ai-example-clj.agents])
  (:import ch.idsia.tools.MarioAIOptions)
  (:import ch.idsia.benchmark.tasks.BasicTask)
  (:import mario-ai-example-clj.agents.ForwardJumpingAgent))

(defn -main [& args] (let [options (MarioAIOptions. (into-array String args))]
                       (if-not (contains? args "-ag")
                         (.setAgent options (mario-ai-example-clj.agents.ForwardJumpingAgent.)))
                       (-> (BasicTask. options)
                         (.doEpisodes 1 true 1))
                       (System/exit 0)))