package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class QueryStringData {

    @GetMapping("/employee")
    public String queryEmployeeGetName(@RequestParam String name, String status) {
        return String.format("My name is %s and I am %s", name, status);
    }

    @GetMapping("/employee/01")
    public String fixedWrongParameters(
        @RequestParam("name") String myName,
        @RequestParam("status") String myStatus) {

        return String.format("My name is %s, I just got %s", myName, myStatus);

    }

    //using a map
    @GetMapping("/employee/03")
    public String getParametersAsObject(EmployeeInfo employeeInfo) {

        String parName = employeeInfo.getName();
        String parStatus = employeeInfo.getStatus();

        return String.format("My name is %s, I just got %s", parName, parStatus);
    }



}
