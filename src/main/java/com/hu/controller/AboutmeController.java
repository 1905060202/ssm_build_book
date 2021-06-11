package com.hu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class AboutmeController {
    @RequestMapping("/about")
    public String getAbout(){

        return "about_me";
    }
}
