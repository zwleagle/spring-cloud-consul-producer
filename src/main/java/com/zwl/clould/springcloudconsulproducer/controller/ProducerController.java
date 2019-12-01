package com.zwl.clould.springcloudconsulproducer.controller;

import com.zwl.cloud.client.ProducerServic;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController implements ProducerServic {


    @Override
    public String getHello() {
         return "Hello,70KG......";
    }
}
