(ns paper-recommender-bot.paper
  (:require [jubot.handler :as handler])
  (:require [clj-http.client :as client])
  (:require [clojure.data.json :as json]))

(def max-paper-num 3)

(defn paper-recommendations-hander
  [{text :text}]
  (let [base-url "http://paper-recommender.herokuapp.com"]
    (if (= text "paper")
      (->> (get (client/get base-url) :body)
           (json/read-str)
           (take max-paper-num)
           (map str)
           (clojure.string/join "\n")))))

(paper-recommendations-hander {:text "paper"})
