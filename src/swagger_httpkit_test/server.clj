(ns swagger-httpkit-test.server
  (:gen-class)
  (:require [org.httpkit.server :as httpkit]
            [ring.middleware.json :refer [wrap-json-response]]))

(defn run! []
  (require 'swagger-httpkit-test.routes)
  (let [app (eval `swagger-httpkit-test.routes/app)]
    (httpkit/run-server
      (-> app
        wrap-json-response)
      {:port 8080})
    (println "server started")))

(defn -main []
  (run!))
