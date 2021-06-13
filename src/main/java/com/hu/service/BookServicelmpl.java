package com.hu.service;

import com.hu.Mapper.adminMapper;
import com.hu.Mapper.bookMapper;
import com.hu.pojo.book_info;

import java.util.List;

public class BookServicelmpl implements BookService{
    private bookMapper bookMapper;
    public void setBookMapper(bookMapper bookMapper){
        this.bookMapper = bookMapper;
    }
    @Override
    public int addbook(book_info book) {
        return bookMapper.addbook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(book_info book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public book_info queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<book_info> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
