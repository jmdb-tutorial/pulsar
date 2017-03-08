(defproject pulsar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [co.paralleluniverse/quasar-core "0.7.7"]
                 [co.paralleluniverse/pulsar "0.7.7"]]
  :java-agents [[co.paralleluniverse/quasar-core "0.7.7"]]
  :main pulsar.core)
