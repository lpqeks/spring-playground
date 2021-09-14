package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@RestController()
public class UsingPathVariable {
    @GetMapping("/employees/{employeeId}/fired")
    public String initialSetUp(@PathVariable int employeeId) {
        return String.format("The employee id is %d.", employeeId);
    }

    @GetMapping("/employee/{name}/{id}/{status}")
    public String severalParameters(@PathVariable String name
            , @PathVariable int id, @PathVariable String status) {
        return String.format("%s %d %s!", name, id, status);
    }

    @GetMapping("/employeeMap/{name}/{id}/{status}")
    public String usingMaps(@PathVariable Map map) {
        String employeeName = String.valueOf(map.get("name"));
        String employeeId = String.valueOf(map.get("id"));
        String employeeStatus = String.valueOf(map.get("status"));

        return employeeName + " " + employeeId + " " + employeeStatus + "!";
    }

}
