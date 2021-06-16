package com.hu.Mapper;

import com.hu.pojo.admin;

import java.util.List;


public interface adminMapper {

    int addadmin(admin admin);
    int deleteadminById(int id);
    int updateadmin(admin admin);
    admin queryadminById(int id);
    List<admin> queryAlladmin();


}
