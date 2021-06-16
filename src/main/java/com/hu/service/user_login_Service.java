package com.hu.service;

import com.hu.Mapper.user_login_Mapper;

import com.hu.pojo.reader_card;

public interface user_login_Service {
    int adduser(reader_card user);
    int deleteuserById(int id);
    int updateuser(reader_card user);
    reader_card queryuserById(int id);
    public reader_card checkLogin(int reader_id,String password);
}
