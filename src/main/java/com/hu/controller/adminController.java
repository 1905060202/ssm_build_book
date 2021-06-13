package com.hu.controller;

import com.hu.pojo.admin;
import com.hu.pojo.book_info;
import com.hu.service.BookService;
import com.hu.service.adminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")
public class adminController {
@Resource
    private adminService adminService;
@Resource
    private BookService bookService;
//check user
@RequestMapping("/book_manage_2")
public String login(admin admin,Model model){
    admin = adminService.checkLogin(admin.getAdmin_id(),admin.getPassword());

    if(admin!=null)
    {
        List<book_info> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "book_manage";
    }else{
        return "login";
    }
}
}
