package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class BookDaoImplTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null, "国哥为什么这么帅！", "191125", new BigDecimal(9999), 1100000, 0, null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(24);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(24, "大家都可以这么帅！", "国哥", new BigDecimal(9999), 1100000, 0, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(24));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryForPageTotalCount() {
        Integer pageTotalCount = bookDao.queryForPageTotalCount();
        System.out.println(pageTotalCount);
    }

    @Test
    public void queryForPageItems() {
        List<Book> books = bookDao.queryForPageItems(0, 4);
        System.out.println(books);
    }

    @Test
    public  void queryForPageTotal(){
        Integer integer = bookDao.queryForPageTotal(10,50);
        System.out.println(integer);
    }
    @Test
    public void queryForPageItems2(){
        System.out.println(bookDao.queryForPageItems(0, 4, 10, 50));
    }



}