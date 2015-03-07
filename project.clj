(defproject paper-recommender-bot "0.0.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.namespace "0.2.10"]
                 [org.clojure/data.json "0.2.5"]
                 [clj-http "1.0.1"]
                 [jubot "0.0.1"]]

  :uberjar-name "paper_recommender_bot-standalone.jar"
  :min-lein-version "2.0.0"
  :profiles {:dev {:source-paths ["dev"]}}

  :aliases {"dev" ["run" "-m" "paper-recommender-bot.core/-main"]})
