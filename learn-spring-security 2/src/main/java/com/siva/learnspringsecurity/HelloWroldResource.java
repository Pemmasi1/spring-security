package com.siva.learnspringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWroldResource {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
