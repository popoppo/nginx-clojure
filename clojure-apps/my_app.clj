(ns my-app
;  (:require [compojure.core :refer :all]
;            [compojure.route :as route])
)

; (defroutes myapp
;   (GET "/" [] "<h1>Hello World</h1>")
;   (route/not-found "<h1>Page not found</h1>"))

(defn hello-world [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})
