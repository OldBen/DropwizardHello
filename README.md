# HelloDropwizard

How to start the HelloDropwizard application
---

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/hellodropwizard-1.0-SNAPSHOT.jar server template.yml`
3. To check that your application is running enter url `http://localhost:8080/hello?name=<name>`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
