package com.hu.controller;

import com.hu.pojo.admin;
import com.hu.pojo.book_info;
import com.hu.pojo.c_course;
import com.hu.pojo.reader_info;
import com.hu.service.BookService;
import com.hu.service.CourseService;
import com.hu.service.adminService;
import com.hu.service.userService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@SuppressWarnings("all")
@Controller
@RequestMapping("/book")
public class adminController {
    @Resource
    private adminService adminService;
    @Resource
    private BookService bookService;
    @Resource
    private userService userService;
    @Resource
    private CourseService courseService;
    //check user
    @RequestMapping("/book_manage_2")
    public String login(admin admin, Model model) {
        admin = adminService.checkLogin(admin.getAdmin_id(), admin.getPassword());
        if (admin != null) {
            List<book_info> list = bookService.queryAllBook();
            model.addAttribute("list", list);
            return "book_manage";
        } else {
            return "login";
        }
    }

    @RequestMapping("/user_manage")
    // login_user_manage
    public String login_manage_user(admin admin,Model model) {
        admin = adminService.checkLogin(admin.getAdmin_id(), admin.getPassword());
        if (admin != null) {
            List<reader_info> list = userService.queryAllUser();
            model.addAttribute("list", list);
            return "user_manage";
        } else {
            return "login_user_manage";
        }
    }


    @RequestMapping("/course_manage")
    // login_course_manage
    public String login_manage_course(admin admin,Model model) {
        admin = adminService.checkLogin(admin.getAdmin_id(), admin.getPassword());
        if (admin != null) {
            List<c_course> list = courseService.selectAllCourse();
            model.addAttribute("list", list);
            return "course_manage";
        } else {
            return "login_course_manage";
        }
    }
}
