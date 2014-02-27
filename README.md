# swagger-httpkit-test

An example project that uses [compojure-api](https://github.com/metosin/compojure-api) with [HTTP Kit](http://http-kit.org/). Follows the method in [HTTP Kit Leiningen template](https://github.com/http-kit/lein-template) to create the server. Doesn't currently work because of a suspected problem in compojure-api and AOT compiling.

# How to run (how to fail)

Loading the files in REPL and starting the server works fine, the server answers at http://localhost:8080/api/item and the Swagger API appears at http://localhost:8080/api/api-docs .

Building an uberjar doesn't work. Running `lein uberjar` fails with exception `java.lang.IllegalArgumentException: No matching clause: class compojure.api.swagger.CompojureRoutes, compiling:(swagger_httpkit_test/routes.clj:11:3)`.
