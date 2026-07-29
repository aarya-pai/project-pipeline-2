package com.example.controller;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/about")
    public String about(){
        return "about.html";
    }


}
