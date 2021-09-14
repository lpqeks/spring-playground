package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UsingPathVariable.class)
public class PathVariablesTest {

    @Autowired
    MockMvc mvc;

    //initial test
    @Test
    public void testInitial() throws Exception {
        int employeeId = 76;
        RequestBuilder request = MockMvcRequestBuilders
                .get(String.format("/employees/%d/fired", employeeId));

        this.mvc.perform(request)
                .andExpect(status().isOk());
    }

    @Test
    public void testIndividualParameters() throws Exception {
        int employeeId = 76;
        RequestBuilder request = MockMvcRequestBuilders
                .get(String.format("/employees/%d/fired", employeeId));

        this.mvc.perform(request)
                .andExpect(content().string("The employee id is 76."));
    }

    @Test
    public void testSeveralParameters() throws Exception {
        int id = 10;
        String name = "Popeye";
        String status = "fired";

        RequestBuilder request = MockMvcRequestBuilders
                .get(String.format("/employee/%s/%d/%s", name, id, status));

        this.mvc.perform(request)
                .andExpect(content().string("Popeye 10 fired!"));
    }
    @Test
    public void testSeveralParametersAsMap() throws Exception {
        int id = 10;
        String name = "Popeye";
        String status = "fired";

        RequestBuilder request = MockMvcRequestBuilders
                .get(String.format("/employeeMap/%s/%d/%s", name, id, status));

        this.mvc.perform(request)
                .andExpect(content().string("Popeye 10 fired!"));
    }

    //it is the same procedure while using an object



}
