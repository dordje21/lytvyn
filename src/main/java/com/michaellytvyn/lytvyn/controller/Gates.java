package com.michaellytvyn.lytvyn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Gates {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
