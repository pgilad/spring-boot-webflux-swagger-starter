package com.example.springbootwebfluxswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class SpringBootWebfluxSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebfluxSwaggerApplication.class, args);
    }
}
