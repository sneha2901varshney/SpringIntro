package com.example.myFirstProject;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/web")
    public String hello() {
        return "Hello Web";
    }

    @GetMapping("web/message")
    public String message() {
        return "Leads To Message Path";
    }

    @GetMapping("/param/{name}")
    public String nameParam(@PathVariable String name){
        return "Hello" + name + "!";
    }


}

