package com.hu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hu.pojo.admin;
import com.hu.pojo.book_info;
import com.hu.service.BookService;
import com.hu.service.adminService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")

public class Book_manage {
    @Resource
    private BookService bookService;
    @RequestMapping("/book_manage")
    public String get_Book_manage(){

        return "book_manage";
    }
    // just return add_book page
    @RequestMapping("/add_book")
    public String add_book_page(){
        return "add_book";
    }
    //return admin book manage page
    @RequestMapping("/admin_overview_book")
    public String back_overview(Model model){
        List<book_info> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "book_manage";
    }
    //implement add_book function
    @RequestMapping("/real_add_book")
    public String add_book(book_info book,Model model){
        int check = bookService.addbook(book);
        if (check>0){
            List<book_info> list = bookService.queryAllBook();
            model.addAttribute("list",list);
            model.addAttribute("ok",1);
            return "book_manage";
        }
        return "add_book";
    }
}
