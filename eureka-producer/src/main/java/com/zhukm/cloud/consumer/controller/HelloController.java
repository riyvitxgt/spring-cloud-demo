package com.zhukm.cloud.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/")
    public String Hello(@RequestParam String name) {
        return "Hello, " + name + " " + LocalDate.now();
    }
}
