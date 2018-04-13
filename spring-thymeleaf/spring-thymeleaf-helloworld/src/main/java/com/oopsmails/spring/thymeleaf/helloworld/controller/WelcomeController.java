package com.oopsmails.spring.thymeleaf.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("message", "Hello World! form Spring MVC 5 with Thymeleaf");
        return "index";
    }
}
