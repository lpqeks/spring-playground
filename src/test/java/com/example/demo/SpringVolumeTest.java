package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SpringVolumeController.class)
public class SpringVolumeTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testCalculateVolumeGet() throws Exception {
        //declare variables.  It could be any type
        int length = 3;
        int width = 4;
        int height = 5;

        //constructing request
        RequestBuilder request = MockMvcRequestBuilders
                .get(String.format("/math/volume/%d/%d/%d", length, width, height));

        //performing the test
        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("The volume of a 3x4x5 rectangle is 60"));
    }
    @Test
    public void testCalculateVolumePost() throws Exception {
        //declare variables.  It could be any type
        int length = 3;
        int width = 4;
        int height = 5;

        //constructing request
        RequestBuilder request = MockMvcRequestBuilders
                .post(String.format("/math/volume/%d/%d/%d", length, width, height));

        //performing the test
        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("The volume of a 3x4x5 rectangle is 60"));
    }
    @Test
    public void testCalculateVolumePatch() throws Exception {
        //declare variables.  It could be any type
        int length = 6;
        int width = 7;
        int height = 8;

        //constructing request
        RequestBuilder request = MockMvcRequestBuilders
                .patch(String.format("/math/volume/%d/%d/%d", length, width, height));

        //performing the test
        this.mvc.perform(request)
                //.andExpect(status().isOk());
                .andExpect(content().string("The volume of a 6x7x8 rectangle is 336"));
    }

}
