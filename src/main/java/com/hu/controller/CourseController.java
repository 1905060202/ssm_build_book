package com.hu.controller;

import com.hu.pojo.book_info;
import com.hu.pojo.c_course;
import com.hu.service.CourseService;
import com.hu.service.userService;
import com.hu.service.user_login_Service;
import com.hu.util.Constants;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
@Controller
@RequestMapping("/book")
public class CourseController {
    @Resource
    private CourseService courseService;
    @Resource
    private userService userService;
    @Resource
    private user_login_Service user_login_service;
    @RequestMapping("/course_manage_2")
    public String get_Course_manage(){return "course_manage";}
    @RequestMapping("/add_course")
    public String add_Course_page(){return "add_course";}
    @RequestMapping("/update_course")
    public String update_Course_page(){return "update_course";}

    @RequestMapping("/admin_overview_course")
    public String back_overview(Model model){
        List<c_course> list = courseService.selectAllCourse();
        model.addAttribute("list",list);
        return "course_manage";
    }

    @RequestMapping(value = "/real_add_course",method = RequestMethod.POST)
    public String add_course(c_course course,@RequestParam("course_pic") MultipartFile file,
                           Model model){
       /* 其中的@RequestParam中的参数要与form表单中的name一致，但其与实体类属性名不一致(为了表单提交实现文件传输)*/
        int check = courseService.insertCourse(course,file);
        if (check>0){
            List<c_course> list = courseService.selectAllCourse();
            model.addAttribute("list",list);
            return "course_manage";
        }
        return "add_course";
    }

    @RequestMapping("/real_update_course")
    public String update_course(c_course course,@RequestParam("course_pic") MultipartFile file,Model model){
        int check = courseService.updateCourse(course,file);
        if (check>0){
            List<c_course> list = courseService.selectAllCourse();
            model.addAttribute("list",list);
            return "course_manage";
        }
        model.addAttribute("check","fail");
        return "update_course";
    }

    /**
     * 处理图片显示请求
     * @paramfileName
     */
    @RequestMapping("/showPic/{fileName}.{suffix}")
    public void showPicture(@PathVariable("fileName") String fileName,
                            @PathVariable("suffix") String suffix,
                            HttpServletResponse response){
        File imgFile = new File(Constants.IMG_PATH + fileName + "." + suffix);
        responseFile(response, imgFile);
    }

    @RequestMapping("/downloadPic/{fileName}.{suffix}")
    public void downloadPicture(@PathVariable("fileName") String fileName,
                                @PathVariable("suffix") String suffix,
                                HttpServletResponse response){
        // 设置下载的响应头信息
        response.setHeader("Content-Disposition",
                "attachment;fileName=" + "headPic.png");
        File imgFile = new File(Constants.IMG_PATH + fileName + "." + suffix);
        responseFile(response, imgFile);
    }
    /**
     * 响应输出图片文件
     * @param response
     * @param imgFile
     */
    private void responseFile(HttpServletResponse response, File imgFile) {
        try(InputStream is = new FileInputStream(imgFile);
            OutputStream os = response.getOutputStream();){
            byte [] buffer = new byte[1024]; // 图片文件流缓存池
            while(is.read(buffer) != -1){
                os.write(buffer);
            }
            os.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
