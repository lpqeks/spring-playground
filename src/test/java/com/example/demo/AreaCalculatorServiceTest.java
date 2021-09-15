package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AreaCalculatorService.class)
public class AreaCalculatorServiceTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testAreaCalculatorServiceConnection() throws Exception {
        int baseLength = 4;
        int height = 6;

        RequestBuilder request = MockMvcRequestBuilders
                .get(String.format("/math/areaT/%d/%d", baseLength, height));

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content()
                        .string("The area of a triangle of base 4 and height 6 is 12.00"));

    }
}
