(ns pulsar.core
  "The classic ping-pong example from the Erlang tutorial"
  (:use [co.paralleluniverse.pulsar core actors])
  (:require [pulsar.ping-pong :as p])
  (:refer-clojure :exclude [promise await]))


(defn -main []
  (let [a1 (spawn p/pong)
        b1 (spawn p/ping 3 a1)]
    :ok))

