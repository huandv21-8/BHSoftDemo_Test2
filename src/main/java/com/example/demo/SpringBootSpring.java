package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@Import(SwaggerConfiguration.class)
public class SpringBootSpring {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSpring.class, args);
    }

}
