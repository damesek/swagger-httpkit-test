(ns swagger-httpkit-test.domain
  (:require [ring.swagger.schema :refer :all]))

(defmodel Item {:name String})
