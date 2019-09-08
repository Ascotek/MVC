package com.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome/rest")
public class WelcomeRestController {

    @GetMapping
    @ResponseBody
    public String welcomeByRest(){
        return "<h1>### Welcome in the rest service ###</h1>";
    }
}
