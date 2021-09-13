package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {

        String message = "Hello World!";

        return message;

    }

    //@GetMapping("/")
    public LocalDateTime dateNow() {
        return LocalDateTime.now();
    }

}
