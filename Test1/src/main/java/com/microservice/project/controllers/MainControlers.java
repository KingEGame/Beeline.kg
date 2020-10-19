package com.microservice.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControlers {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("Title", "MainSite");
        return "Home";
    }

}
