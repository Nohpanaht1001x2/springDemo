package com.example.springdemo.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class Home {
//    private static final Logger log = (Logger) LoggerFactory.getLogger(Home.class);

    @GetMapping("/src/main/resources/static")
    String index(){
//        log.info("");
        return "Hello World";
    }
}
