package com.zwl.clould.springcloudconsulproducer.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello1")
    public String hello() {
        return "helle consul";
    }

}
