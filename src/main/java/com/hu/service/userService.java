package com.hu.service;

import com.hu.pojo.reader_card;
import com.hu.pojo.reader_info;

import java.util.List;

public interface userService {
    int adduser(reader_info user);
    int deleteuserById(int id);
    int updateuser(reader_info user);
    reader_info queryuserById(int id);
    public reader_info checkLogin(int reader_id);
    List<reader_info> queryAllUser();
}
