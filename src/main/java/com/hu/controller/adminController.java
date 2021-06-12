package com.hu.controller;

import com.hu.pojo.admin;
import com.hu.service.adminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/book")
public class adminController {
@Resource
    private adminService adminService;

//check user
@RequestMapping("/book_manage_2")
public String login(admin admin,Model model){
    admin = adminService.checkLogin(admin.getAdmin_id(),admin.getPassword());
    if(admin!=null)
    {
        return "book_manage";
    }
    model.addAttribute("v",-1);
    return "fail";
}
}
