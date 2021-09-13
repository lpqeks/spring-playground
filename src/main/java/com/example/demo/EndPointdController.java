package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointdController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/messages")
    public String postMessages() {
        return"POST messages to route";
    }

    @GetMapping("/math/pi")
    public String getPiValue() {
        return String.valueOf(Math.PI);
    }

}
