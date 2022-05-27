package com.zzq.service;

import com.zzq.bean.Account;
import com.zzq.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface AccountService {
        Account getAccount(Integer id);
}