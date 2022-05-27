package dao.impl;

import dao.AccountDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pojo.Account;

import java.sql.SQLException;


@Repository
public class AccountDaoImpl implements AccountDao {
    // 注入dbutil
/**
 *  什么使用注解 什么时候xml
 *  注解是写在源码上的，当不能修改源码的时候
 *  我们只能使用xml
 *
 * */
    @Autowired
    private QueryRunner queryRunner;

    @Override
    public Account getAccount(Integer id) {

        System.out.println("AccountDaoImpl");
        String sql="select * from account where id=?";
        Account account =null;
        try {
             account = (Account) queryRunner.query(sql, new BeanHandler(Account.class), id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  account;
    }

    @Override
    public void editAccount(Account account) {

    }
}
