package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String homepage(){
        return"index";
    }
}
