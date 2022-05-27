package com.dao.impl;

import com.dao.BookDao;
import com.entity.Book;
import com.entity.Page;

import java.util.List;

public class BookDaoImpl extends  BaseDao implements BookDao {
    @Override
    public List<Book> queryBooks() {
        String sql = "SELECT `id`,`name`,`price`,`author`,`sales`,`stock`,`img_path`,`title`\n" +
                "\tFROM book";
        return queryForList(Book.class,sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "SELECT COUNT(*) FROM book";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    @Override
    public List<Book> queryForPageItems(int begin, int pageSize) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` " +
                ", `stock` , `img_path` ,`title` from book limit ?,?";
        List<Book> book = queryForList(Book.class, sql, begin, pageSize);
        return book;
    }

    @Override
    public List<Book> queryForPageItems(int begin, int pageSize, int min, int max) {
        return null;
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql = "SELECT `id`,`name`,`price`,`author`,`sales`,`stock`,`img_path`,`title`,`img_path` \n" +
                "\tFROM `book` WHERE id=?;";
        return queryForOne(Book.class, sql, id);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update book set `name`=?,`author`=?,`price`=?,`sales`=?,`stock`=?,`img_path`=?,`title`=? where id = ?";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImg_path(),book.getTitle(), book.getId());
    }

    @Override
    public List<Book> queryBookByCommodity(String commodityName) {
        String sql ="select `id`,`name`,`price`,`author`,`sales`,`stock`,`img_path`,`title`,`img_path` from book " +
                "where name like ? OR  author LIKE ?";
        return queryForList(Book.class,sql,"%"+commodityName+"%","%"+commodityName+"%");
    }

    @Override
    public Integer queryForPageTotalCountByCommodity(String commodityName) {
        String sql ="SELECT COUNT(*)  FROM book\n" +
                "\tWHERE NAME LIKE ? OR  author LIKE ?";
        Number count = (Number) queryForSingleValue(sql,"%"+commodityName+"%","%"+commodityName+"%");
        return count.intValue();
    }

    @Override
    public int deleteBookById(Integer id) {
        String sql = "delete from book where id=?";
        return update(sql, id);
    }
        @Override
        public int addBook(Book book) {
            String sql = "insert into book(`name`,`author`,`price`,`sales`,`stock`,`img_path`,`title`) values(?,?,?,?,?,?,?)";
            return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImg_path(),book.getTitle());
        }
}
