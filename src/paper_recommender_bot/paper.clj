(ns paper-recommender-bot.paper
  (:require [jubot.handler :as handler])
  (:require [clj-http.client :as client])
  (:require [clojure.data.json :as json]))

(def max-paper-num 3)

(defn paper-recommendations-handler [{text :text}]
  (let [base-url "http://paper-recommender.herokuapp.com"]
    (if (= text "paper")
      (->> (get (client/get base-url) :body)
           (json/read-str)
           (sort-by (fn [item] (get item "score")) >)
           (take max-paper-num)
           (map
            (fn [item]
              (str
               (get item "title") "\n"
               (clojure.string/join "\t" (get item "authors")) "\n"
               (str (get item "url")) ".pdf")))
           (clojure.string/join "\n\n")))))
