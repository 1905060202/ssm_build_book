package com.hu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class loginController {
    @RequestMapping("/login")
    public String getAbout(){

        return "login";
    }
}
