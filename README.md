## Spring Boot SOAP client example

This is an example project to demonstrate how to connect to SOAP web services from a Spring Boot component.

It calls a basic SOAP service which converts numbers to words, exposing this function through a REST controller.

All the content and instructions are on my blog [https://leiva.io](https://leiva.io).

### Build & run

This project was built with Spring Initializr using a wrapped maven. So, to build and run this project, execute following commands:

    git clone https://github.com/felipeleivav/spring-boot-soap-client-example.git
    ./mvnw package
    cd target
    java -jar soap-client-sample-0.0.1-SNAPSHOT.jar

To test, just point your browser to:

    http://localhost:8080/num2words/42

This should show something like:

    forty two

Any comment please write me to felipe@leiva.io.