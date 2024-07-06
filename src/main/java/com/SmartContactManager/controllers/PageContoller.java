package com.SmartContactManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageContoller {
    @RequestMapping("/home")
    public String home(){
        System.out.println("HOME PAGE HANDLER");
        return "home";
    }
}
