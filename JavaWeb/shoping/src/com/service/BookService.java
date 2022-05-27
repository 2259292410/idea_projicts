package com.service;

import com.entity.Book;
import com.entity.Page;

import java.util.List;

public interface BookService {
    public List<Book> queryBooks();
    public Book queryBookById(Integer id);
    public Page<Book> page(int pageNo, int pageSize);
    public Page<Book> pageByCommodity(String commodityName,int pageNo, int pageSize);
    public int updateBook(Book book);
    public void deleteBookById(Integer id);
    public int addBook(Book book);

}
