package com.dao;

import com.entity.Book;
import com.entity.Page;

import java.util.List;

public interface BookDao {
    public List<Book> queryBooks();
    public  Integer queryForPageTotalCount();//查询总数量
    public List<Book> queryForPageItems(int begin, int pageSize);
    List<Book> queryForPageItems(int begin, int pageSize,int min,int max);
    public Book queryBookById(Integer id);
    public int updateBook(Book book);
    public List<Book> queryBookByCommodity(String commodityName);
    public  Integer queryForPageTotalCountByCommodity(String commodityName);
    public int deleteBookById(Integer id);
    public int addBook(Book book);
}
