package com.example.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/query")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name)
    {
        return "Hello " + name + " from BridgeLabz";
    }
}