package com.test;

import com.dao.BookDao;
import com.dao.impl.BookDaoImpl;
import com.entity.Book;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookDaoImplTest {

    private BookDao bookDao = new BookDaoImpl();
    @Test
    public void queryBooks() {
        System.out.println(bookDao.queryBooks());
    }
    @Test
    public void addBook(){
        System.out.println(bookDao.addBook(new Book(null,"test",new BigDecimal("33"),"tet",11,11,"4324","432")));
    }
    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() {
        System.out.println(bookDao.queryForPageItems(0, 8));
    }

    @Test
    public void testQueryForPageItems() {
    }

    @Test
    public  void  testQueryBookById(){
        Book book = bookDao.queryBookById(1);
        System.out.println(book);
    }

    @Test
    public void updateBook(){
        bookDao.updateBook(new Book(33,"心安即是归处",new BigDecimal("36.80"),"季羡林",99,1999,"gggg","null"));
    }

    @Test
    public  void  queryBookByCommodity(){
        System.out.println(bookDao.queryBookByCommodity("i"));
    }

    @Test
    public  void queryForPageTotalCountByCommodity(){
        System.out.println(bookDao.queryForPageTotalCountByCommodity("张"));
    }
}