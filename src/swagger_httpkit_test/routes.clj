(ns swagger-httpkit-test.routes
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [swagger-httpkit-test.domain :refer :all]))

(defroutes app
  (swagger-ui)
  (swagger-docs
    :title "Example with http-kit"
    :description "Trying out ring-swagger with http-kit server")
  (swaggered "Test API"
    :description "Test API description"
    (context "/api" []
      (GET* "/item" []
        :return Item
        :summary "Gets an item"
        (ok {:name "Test item"})))))
