package com.hu.Mapper;

import com.hu.pojo.book_info;

import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface bookMapper {

    int addbook(book_info book);

    int deleteBookById(int id);

    int updateBook(book_info book);

    book_info queryBookById(int id);

    List<book_info> queryAllBook();
}
