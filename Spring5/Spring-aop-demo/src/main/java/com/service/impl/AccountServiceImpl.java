package com.service.impl;

import com.dao.AccountDao;
import com.service.AccountService;
import com.utils.TXManger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.sql.SQLException;


public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

     private TXManger tx;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTx(TXManger tx) {
        this.tx = tx;
    }

    public void transfer() {
        try {
            tx.begin();
            accountDao.addMoney(1);
//            int a=1/0;
            accountDao.lessMoney(2);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }finally {
            tx.close();
        }
    }


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountServiceImpl accountServiceImpl = context.getBean(AccountServiceImpl.class, "accountServiceImpl");
        accountServiceImpl.transfer();
    }

}
