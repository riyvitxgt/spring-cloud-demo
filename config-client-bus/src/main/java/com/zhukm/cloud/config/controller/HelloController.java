package com.zhukm.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RefreshScope
@RestController
public class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @GetMapping("/hello")
    public Mono<String> hello(){
        return Mono.justOrEmpty(hello);
    }
}
