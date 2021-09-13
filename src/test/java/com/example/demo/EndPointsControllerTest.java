package com.example.demo;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EndPointdController.class)
public class EndPointsControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testIndexEndPoint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/hello");
        this.mvc.perform(request).andExpect((content().string("Hello World!")));

    }

    @Test
    public void testPostEndPoint() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/messages");
            this.mvc.perform(request)
                    .andExpect(status().isOk())
                    .andExpect(content().string("POST messages to route"));
    }

    @Test
    public void testMathPi() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");
        this.mvc.perform(request)
                .andExpect(content().string("3.141592653589793"));
    }


}
