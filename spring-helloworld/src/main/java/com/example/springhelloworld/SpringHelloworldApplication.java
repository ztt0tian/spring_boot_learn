package com.example.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHelloworldApplication {
    public String index() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloworldApplication.class, args);
    }

}
