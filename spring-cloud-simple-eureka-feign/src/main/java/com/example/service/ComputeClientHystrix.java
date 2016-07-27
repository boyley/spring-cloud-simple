package com.example.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(Integer a,Integer b) {
        return -9999;
    }

}