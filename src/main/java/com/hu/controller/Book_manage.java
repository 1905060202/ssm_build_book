package com.hu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class Book_manage {
    @RequestMapping("/book_manage")
    public String get_Book_manage(){

        return "login";
    }
}
