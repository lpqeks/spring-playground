package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SpringMathModule.class)
public class SpringMathModuleTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testMathOperationsModuleAdd () throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/math/calculate?operation=add&x=4&y=6");

        this.mvc.perform(request)
                //.andExpect(status().isOk());
               .andExpect(content().string("4 + 6 = 10"));
    }

    @Test
    public void testMathOperationsModuleSubtract () throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/math/calculate?operation=subtract&x=4&y=6");

        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("4 - 6 = -2"));
    }

    @Test
    public void testMathOperationsModuleMultiply () throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/math/calculate?operation=multiply&x=4&y=6");

        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("4 * 6 = 24"));
    }
    @Test
    public void testMathOperationsModuleDivide () throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/math/calculate?operation=divide&x=4&y=6");

        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("4 / 6 = 0"));
    }

    @Test
    public void testMathOperationsModuleDefault () throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/math/calculate?x=4&y=6");

        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("4 + 6 = 10"));
    }

    @Test
    public void testMathOperationsModuleListAddition () throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .post("/math/sum?n=5&n=6&n=7");

        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("5 + 6 + 7 = 18"));
    }


}
