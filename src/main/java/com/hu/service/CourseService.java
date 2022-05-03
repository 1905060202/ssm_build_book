package com.hu.service;

import com.hu.pojo.c_course;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CourseService {
    int insertCourse(c_course course, MultipartFile file);
    int updateCourse(c_course course, MultipartFile file);
    List<c_course> selectAllCourse();
}
