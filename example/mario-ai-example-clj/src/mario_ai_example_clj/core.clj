(ns mario-ai-example-clj.core
  (:import ch.idsia.tools.MarioAIOptions)
  (:import ch.idsia.benchmark.tasks.BasicTask))

(defn -main [& args] (let [options (MarioAIOptions. args)]
                       (if-not (contains? args "-ag")
                         (.setAgent options (example.agents.ForwardJumpingAgent.)))
                       (-> (BasicTask. options)
                         (.doEpisodes 1 true 1))
                       (System/exit 0)))