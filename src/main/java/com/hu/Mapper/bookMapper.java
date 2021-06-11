package com.hu.Mapper;

import com.hu.pojo.books;

import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface bookMapper {

    int addbook(books book);

    int deleteBookById(@Param("bookID") int id);

    int updateBook(books book);

    books queryBookById(@Param("bookID") int id);

    List<books> queryAllBook();
}
