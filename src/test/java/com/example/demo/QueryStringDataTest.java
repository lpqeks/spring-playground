package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@WebMvcTest(QueryStringData.class)
public class QueryStringDataTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testQueryString() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/employee?name=Pedro&status=Fired");

        this.mvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string("My name is Pedro and I am Fired"));

    }

    @Test
    public void testQueryString01() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/employee/01?name=Pedro&status=Fired");

        this.mvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string("My name is Pedro, I just got Fired"));

    }

    @Test
    public void testQueryString02() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/employee/02?name=Pedro&status=Fired");

        this.mvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string("My name is Pedro, I just got Fired"));

    }

    @Test
    public void testQueryString03() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/employee/03");

        this.mvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string("My name is Pedro, I just got Fired"));

    }


}
