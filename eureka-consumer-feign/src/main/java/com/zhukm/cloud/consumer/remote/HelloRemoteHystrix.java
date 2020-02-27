package com.zhukm.cloud.consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    public String hello(String name) {
        return "Hello World!";
    }
}
