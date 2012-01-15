(ns mario-ai-example-clj.agents
  (:import ch.idsia.benchmark.mario.engine.sprites.Mario)
  (:import ch.idsia.benchmark.mario.environments.Environment))

(gen-class
  :name example.agents.ForwardJumpingAgent
  :extends ch.idsia.agents.controllers.BasicMarioAIAgent
  :constructors {[] [java.lang.String]}
  :init "init"
  :exposes {"action" {:get "action" :set "action"}
            "isMarioAbleToJump" {:get "isMarioAbleToJump"}
            "isMarioOnGround" {:get "isMarioOnGround"}})

(defn -init [] [["ForwardJumpingAgent"] ])

(defn -getAction [this]
  (let [ableToJump (.isMarioAbleToJump this)
        onGround (.isMarioOnGround this)
        should-jump (or ableToJump (not onGround))
        action (.action this)]
    (aset ^booleans action Mario/KEY_SPEED should-jump)
    (aset ^booleans action Mario/KEY_JUMP should-jump)
    action))

(defn -reset [this]
  (let [new-actions (boolean-array Environment/numberOfKeys)]
    (aset ^booleans new-actions Mario/KEY_SPEED true)
    (aset ^booleans new-actions Mario/KEY_RIGHT true)
    (.action ^booleans this new-actions)))