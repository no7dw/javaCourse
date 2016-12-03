#!/bin/bash
java -jar target/dependency/jetty-runner.jar target/*.war 
# or
# mvn package
# mvn -Djetty.port=8090 jetty:run
# now you can 
# curl http://localhost:8090/popdata/1