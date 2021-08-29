package com.example.springbakery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingPageController {

    @RequestMapping("/")
    public String home() { return "home.html"; }
}
