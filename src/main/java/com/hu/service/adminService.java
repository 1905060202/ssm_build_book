package com.hu.service;

import com.hu.pojo.admin;

import java.util.List;

public interface adminService {
    int addadmin(admin admin);
    int deleteadminById(int id);
    int updateadmin(admin admin);
    admin queryadminById(int id);
    List<admin> queryAlladmin();
    admin checkLogin(int admin_id,String password);

}
