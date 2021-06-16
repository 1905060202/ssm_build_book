package com.hu.Mapper;

import com.hu.pojo.reader_card;

public interface user_login_Mapper {
    int adduser(reader_card user);
    int deleteuserById(int id);
    int updateuser(reader_card user);
    reader_card queryuserById(int id);
}
