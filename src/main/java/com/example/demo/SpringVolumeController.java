package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringVolumeController {

    @RequestMapping("/math/volume/{length}/{width}/{height}")
    public String getVolumeRectangle(Dimensions rectDimensions) {


        return rectDimensions.calculateVolume();
    }
}
