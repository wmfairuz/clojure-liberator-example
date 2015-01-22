(ns clojure-liberator-example.core
  (:require [liberator.core :refer [resource defresource]]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defresource hello-world
  :available-media-types ["text/html"]
  :handle-ok "<html>Hello, Internet.</html>")

(defroutes app-routes
  (GET "/" [] hello-world)
  (route/not-found "Not Found"))
