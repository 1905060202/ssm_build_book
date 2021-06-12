package com.hu.service;

import com.hu.Mapper.adminMapper;
import com.hu.Mapper.bookMapper;
import com.hu.pojo.admin;

import java.util.List;

public class adminServicelmpl implements adminService{

    private adminMapper adminMapper;
    public void setAdminMapper(adminMapper adminMapper){
        this.adminMapper = adminMapper;
    }
    @Override
    public int addadmin(admin admin) {
        return adminMapper.addadmin(admin);
    }

    @Override
    public int deleteadminById(int id) {
        return adminMapper.deleteadminById(id);
    }

    @Override
    public int updateadmin(admin admin) {
        return adminMapper.updateadmin(admin);
    }

    @Override
    public admin queryadminById(int id) {
        return adminMapper.queryadminById(id);
    }

    @Override
    public List<admin> queryAlladmin() {
        return adminMapper.queryAlladmin();
    }

    @Override
    public admin checkLogin(int admin_id, String password) {
        admin admin = adminMapper.queryadminById(admin_id);
        if(admin!=null&&admin.getPassword().equals(password)){
            return admin;
        }else{
            return null;
        }
    }
}
