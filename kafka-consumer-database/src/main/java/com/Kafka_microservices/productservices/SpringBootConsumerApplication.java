package com.Kafka_microservices.productservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootConsumerApplication {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to Kafka streams!!";
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringBootConsumerApplication.class);
    }
}
