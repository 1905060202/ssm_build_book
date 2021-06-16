package com.hu.controller;

import com.hu.pojo.reader_info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hu.pojo.admin;
import com.hu.pojo.book_info;
import com.hu.pojo.reader_card;
import com.hu.service.BookService;
import com.hu.service.adminService;
import com.hu.service.userService;
import com.hu.service.user_login_Service;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")

public class Book_manage {
    @Resource
    private BookService bookService;
    @Resource
    private userService userService;
    @Resource
    private user_login_Service user_login_service;
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
    // just return update_book page
    @RequestMapping("/update_book")
    public String update_book_page(){
        return "update_book";
    }
    // just return add_user page
    @RequestMapping("/add_user")
    public String add_user_page(){
        return "add_user";
    }
    // just return update_user page
    @RequestMapping("/update_user")
    public String update_user_page(){
        return "update_user";
    }
    //return admin book manage page
    @RequestMapping("/admin_overview_book")
    public String back_overview(Model model){
        List<book_info> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "book_manage";
    }
    //return user_overview
    @RequestMapping("/user_overview_book")
    public String back_user_overview(Model model){
        List<reader_info> list = userService.queryAllUser();
        model.addAttribute("list",list);
        return "user_manage";
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
    //implement update_book function
    @RequestMapping("/real_update_book")
    public String update_book(book_info book,Model model){
        int check = bookService.updateBook(book);
        if (check>0){
            List<book_info> list = bookService.queryAllBook();
            model.addAttribute("list",list);
            return "book_manage";
        }
        model.addAttribute("check","fail");
        return "update_book";
    }
    //implement add_user function
    @RequestMapping("/real_add_user")
    public String add_user(reader_info user, Model model){
        int check = userService.adduser(user);
        if (check>0){
            List<reader_info> list =userService.queryAllUser();
            model.addAttribute("list",list);
            return "user_manage";
        }
        return "add_user";
    }
    //implement update_user function
    @RequestMapping("/real_update_user")
    public String update_book(reader_info user,Model model){
        int check = userService.updateuser(user);
        if (check>0){
            List<reader_info> list = userService.queryAllUser();
            model.addAttribute("list",list);
            return "user_manage";
        }
        model.addAttribute("check","fail");
        return "update_user";
    }
    //implement user_login function
    @RequestMapping("/user_login")
    public String user_login(reader_card user,Model model){
       reader_info check = userService.checkLogin(user.getReader_id());
       if(check!=null){
           reader_card check2 = user_login_service.checkLogin(user.getReader_id(),user.getPassword());
           if(check2!=null)
           return "date_book_manage";
           else
               return "user_login";
       }else
       {
           return "user_login";
       }
    }
}
