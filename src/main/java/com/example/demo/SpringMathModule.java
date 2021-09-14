package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringMathModule {

    @GetMapping("/math/calculate")
    public String calculate(MathExpression mathExpression) {

        return mathExpression.calculateOp();
    }

    @PostMapping("/math/sum")
    public String listAddition(@RequestParam List<String> n ) {
        int sum = 0;
        //StringBuilder sb = new StringBuilder();

        for (String number : n) {
            sum += Integer.valueOf(number);

        }

        //String.join("+", n);


        String output = String.join(" + ", n) + " = " + String.valueOf(sum);

    return output;

    }

}
