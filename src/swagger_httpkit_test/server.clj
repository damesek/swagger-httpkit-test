(ns swagger-httpkit-test.server
  (:gen-class)
  (:require [org.httpkit.server :as httpkit]
            [swagger-httpkit-test.routes :refer [app]]
            [ring.middleware.json :refer [wrap-json-response]]))

(defn run! []
  (httpkit/run-server
    (-> app
      wrap-json-response)
    {:port 8080}))

(defn -main []
  (run!))
