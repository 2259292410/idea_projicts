package com.service.impl;

import com.dao.BookDao;
import com.dao.impl.BookDaoImpl;
import com.entity.Book;
import com.entity.Page;
import com.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookDao bookDao = new BookDaoImpl();
    @Override
    public List<Book> queryBooks() {
        return bookDao.queryBooks();
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public Page<Book> page(int pageNo, int pageSize) {
        Page<Book> page = new Page<>();

        Integer pageTotalCount = bookDao.queryForPageTotalCount();
        page.setPageTotalCount(pageTotalCount);

        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }

        // 设置总页码
        page.setPageTotal(pageTotal);

        page.setPageNo(pageNo);
        page.setPageSize(pageSize);

        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;

        List<Book> books = bookDao.queryForPageItems(begin, pageSize);
        page.setItems(books);

        return page;
    }

    @Override
    public Page<Book> pageByCommodity(String commodityName,int pageNo, int pageSize) {
        Page<Book> page = new Page<>();

        Integer pageTotalCount = bookDao.queryForPageTotalCountByCommodity(commodityName);
        page.setPageTotalCount(pageTotalCount);

        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal+=1;
        }

        // 设置总页码
        page.setPageTotal(pageTotal);

        page.setPageNo(pageNo);
        page.setPageSize(pageSize);

        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;

        List<Book> books = bookDao.queryBookByCommodity(commodityName);
        page.setItems(books);


        return page;
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public void deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }


}
