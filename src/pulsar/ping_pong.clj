(ns pulsar.ping-pong
  "The classic ping-pong example from the Erlang tutorial"
  (:use [co.paralleluniverse.pulsar core actors])
  (:refer-clojure :exclude [promise await]))

;; This example is intended to be a line-by-line translation of the canonical
;; Erlang [ping-pong example](http://www.erlang.org/doc/getting_started/conc_prog.html#id67006),
;; so it is not written in idiomatic Clojure.

(defsfn ping [n pong]
  (if (== n 0)
    (do
      (! pong :finished)
      (println "ping finished"))
    (do
      (! pong [:ping @self])
      (receive
        :pong (println "Ping received pong"))
      (recur (dec n) pong))))

(defsfn pong []
  (receive
    :finished (println "Pong finished")
    [:ping ping] (do
                   (println "Pong received ping")
                   (! ping :pong)
                   (recur))))
