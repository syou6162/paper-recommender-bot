(ns paper-recommender-bot.core
  "===================================
   YOU DO NOT NEED TO MODIFY THIS FILE
   ==================================="
  (:require
    [jubot.core :refer [jubot]]))

(def ns-prefix #"^paper-recommender-bot\.")

(def -main (jubot :ns-regexp ns-prefix))
