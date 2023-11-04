package com.example.newproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NewProjectApplication {

    @GetMapping
    public String getHelloWorld() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(NewProjectApplication.class, args);
    }
}
