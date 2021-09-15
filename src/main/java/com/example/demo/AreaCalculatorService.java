package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaCalculatorService {

    @RequestMapping("/math/areaT/{baseLegth}/{height}")
    public String calculate(Areas area) {

        return String.format("The area of a triangle of base %d and height %d is %.2f", 4, 6, area.calculate());
    }
}
