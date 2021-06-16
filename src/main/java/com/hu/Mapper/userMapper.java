package com.hu.Mapper;

import com.hu.pojo.reader_info;

import java.util.List;

public interface userMapper {
    int adduser(reader_info user);
    int deleteuserById(int id);
    int updateuser(reader_info user);
    reader_info queryuserById(int id);
    List<reader_info> queryAllUser();
}
