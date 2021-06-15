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
    // just return delete_book page
    @RequestMapping("/delete_book")
    public String delete_book_page(){
        return "delete_book";
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
            return "book_manage";
        }
        return "add_book";
    }
    //implement delete_book function
    @RequestMapping("/real_delete_book")
    public String delete_book(String book_id,Model model){
        int check = bookService.deleteBookById(Integer.parseInt(book_id));
        if (check>0){
            List<book_info> list = bookService.queryAllBook();
            model.addAttribute("list",list);
            return "book_manage";
        }
        model.addAttribute("check","fail");
        return "delete_book";
    }
}
