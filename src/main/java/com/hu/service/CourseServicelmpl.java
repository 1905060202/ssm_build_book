package com.hu.service;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.List;
import com.hu.Mapper.CourseMapper;
import com.hu.pojo.c_course;
import com.hu.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;

public class CourseServicelmpl implements CourseService {


        private com.hu.Mapper.CourseMapper CourseMapper;
        public void setCourseMapper(CourseMapper CourseMapper){
            this.CourseMapper = CourseMapper;
        }
        @Override
        public int insertCourse(c_course course, MultipartFile file) {
            if (file != null){
                // 生成图片存储的名称，UUID 避免相同图片名冲突
                String originalFileName = file.getOriginalFilename(); // 原始文件名
                String suffix = originalFileName.substring(originalFileName.lastIndexOf(".")); // 图片后缀
                String fileName = UUID.randomUUID().toString() + suffix;
                String filePath = Constants.IMG_PATH + fileName;
                File saveFile = new File(filePath);
                try {
                    // 将上传的文件保存到服务器文件系统
                    file.transferTo(saveFile);
                    // 记录服务器文件系统图片名称
                    course.setCoursepic(fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return CourseMapper.insertCourse(course);
        }

//        @Override
//        public int deleteBookById(int id) {
//            return CourseMapper.deleteBookById(id);
//        }

        @Override
        public int updateCourse(c_course course,MultipartFile file) {
            if (file != null){
                // 生成图片存储的名称，UUID 避免相同图片名冲突
                String originalFileName = file.getOriginalFilename(); // 原始文件名
                String suffix = originalFileName.substring(originalFileName.lastIndexOf(".")); // 图片后缀
                String fileName = UUID.randomUUID().toString() + suffix;
                String filePath = Constants.IMG_PATH + fileName;
                File saveFile = new File(filePath);
                try {
                    // 将上传的文件保存到服务器文件系统
                    file.transferTo(saveFile);
                    // 记录服务器文件系统图片名称
                    course.setCoursepic(fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return CourseMapper.updateCourse(course);
        }

//        @Override
//        public c_course queryBookById(String id) {
//            return CourseMapper.queryBookById(id);
//        }

        @Override
        public List<c_course> selectAllCourse() {
            return CourseMapper.selectAllCourse();
        }


}
