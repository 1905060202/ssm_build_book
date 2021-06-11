package com.hu.service;

import com.hu.Mapper.bookMapper;
import com.hu.pojo.books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BooksServicelmpl implements BookService{

    //SERVICE -->dao
    private bookMapper bookMapper;
    public void setBookMapper(bookMapper bookMapper){
        this.bookMapper = bookMapper;
    }
    @Override
    public int addbook(books book) {
        return bookMapper.addbook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(books book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
