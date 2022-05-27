package com.zzq.service.impl;

import com.zzq.bean.Account;
import com.zzq.dao.AccountDao;
import com.zzq.dao.impl.AccountDaoImpl;
import com.zzq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public Account getAccount(Integer id) {
        return accountDao.getAccount(id);
    }
}
