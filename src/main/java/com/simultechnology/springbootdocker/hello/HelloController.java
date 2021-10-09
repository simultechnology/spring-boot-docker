package com.simultechnology.springbootdocker.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String init() {
        return "Successful!!";
    }

    @GetMapping("/hello")
    public String home() {
        return "Hello Docker World!";
    }
}
