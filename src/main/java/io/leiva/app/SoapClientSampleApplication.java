package io.leiva.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.leiva.app")
public class SoapClientSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapClientSampleApplication.class, args);
    }

}
