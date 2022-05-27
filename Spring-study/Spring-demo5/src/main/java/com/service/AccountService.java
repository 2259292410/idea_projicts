package com.service;

import com.dao.AccountDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service

public class AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional(propagation=Propagation.REQUIRED)
    public void transfer(){
        accountDao.jianMoney(1,new BigDecimal(100));
//        int a=1/0;
        accountDao.addMoney(2,new BigDecimal(100));
    }

}
