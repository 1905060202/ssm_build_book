package com.hu.Mapper;

import com.hu.pojo.c_course;


import java.util.List;

public interface CourseMapper {
    int insertCourse(c_course course);
    int updateCourse(c_course course);
    List<c_course> selectAllCourse();
}
