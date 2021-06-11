package com.hu.service;

import com.hu.pojo.books;

import java.util.List;

public interface BookService {
    int addbook(books book);

    int deleteBookById(int id);

    int updateBook(books book);

    books queryBookById(int id);

    List<books> queryAllBook();
}
