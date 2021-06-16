package com.hu.service;

import com.hu.Mapper.user_login_Mapper;
import com.hu.pojo.reader_card;
import com.hu.Mapper.userMapper;
import com.hu.pojo.reader_info;

public class user_login_Servicelmpl implements user_login_Service{
    private user_login_Mapper user_login_mapper;
    @Override
    public int adduser(reader_card user) {
        return user_login_mapper.adduser(user);
    }

    @Override
    public int deleteuserById(int id) {
        return user_login_mapper.deleteuserById(id);
    }

    @Override
    public int updateuser(reader_card user) {
        return user_login_mapper.updateuser(user);
    }

    @Override
    public reader_card queryuserById(int id) {
        return user_login_mapper.queryuserById(id);
    }
    @Override
    public reader_card checkLogin(int reader_id,String password){
        reader_card user = user_login_mapper.queryuserById(reader_id);
        if(user!=null&&(user.getPassword().equals(password))){
            return user;
        }else{
            return null;
        }
    }
    public void setUser_login_Mapper(user_login_Mapper user_login_mapper) {
        this.user_login_mapper=user_login_mapper;
    }
}
