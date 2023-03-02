package com.example.demoFirstSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingPageController {

    @GetMapping("/greeting")
    public String viewGreeting(){
        return "greeting";
    }
}
