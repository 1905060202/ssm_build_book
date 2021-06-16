package com.hu.service;

import com.hu.Mapper.adminMapper;
import com.hu.Mapper.userMapper;
import com.hu.pojo.reader_info;

import java.util.List;

public class userServicelmpl implements userService{
    private com.hu.Mapper.userMapper userMapper;
    @Override
    public int adduser(reader_info user) {
        return userMapper.adduser(user);
    }

    @Override
    public int deleteuserById(int id) {
        return userMapper.deleteuserById(id);
    }

    @Override
    public int updateuser(reader_info user) {
        return userMapper.updateuser(user);
    }

    @Override
    public reader_info queryuserById(int id) {
        return userMapper.queryuserById(id);
    }

    @Override
    public List<reader_info> queryAllUser() {
        return userMapper.queryAllUser();
    }

    public void setUserMapper(userMapper userMapper) {
        this.userMapper=userMapper;
    }
}
