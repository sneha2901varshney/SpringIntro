package com.example.myFirstProject;

import NamePost.User;
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

    @RequestMapping(value = {"query"}, method = RequestMethod.GET)
    public String name(@RequestParam(value = "name") String name){
        return "Hello" + name + "!";
    }

    @PostMapping("/Post")
    public String namePost(@RequestBody User user){
        return "Hello" + " "  + user.getFirstName() + " " + user.getLastName() + " " + "!";
    }




}

