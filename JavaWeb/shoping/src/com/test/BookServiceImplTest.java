package com.test;

import com.service.BookService;
import com.service.impl.BookServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceImplTest {

    private BookService bookService = new BookServiceImpl();
    @Test
    public void queryBooks() {
        System.out.println(bookService.queryBooks());
    }

    @Test
    public void page() {
        System.out.println(bookService.page(0,8));
    }

    @Test
    public  void  testQueryBookById(){
        System.out.println(bookService.queryBookById(1));
    }

    @Test
    public void pageByCommodity(){
        System.out.println(bookService.pageByCommodity("i", 0, 8));
    }


}