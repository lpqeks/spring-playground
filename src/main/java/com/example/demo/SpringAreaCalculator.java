package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringAreaCalculator {

    @PostMapping("/math/area")
    public String calculate(Figure figure) {
        return figure.calculateArea();
    }
}
