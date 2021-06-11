package com.hu.controller;

import com.hu.pojo.books;
import com.hu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
   @Resource
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
}
