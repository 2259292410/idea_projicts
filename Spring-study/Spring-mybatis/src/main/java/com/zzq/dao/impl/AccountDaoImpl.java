package com.zzq.dao.impl;

import com.zzq.bean.Account;
import com.zzq.dao.AccountDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    public Account getAccount(Integer id) {
        Object aaa = sqlSessionTemplate.selectOne("com.zzq.dao.AccountDao.getAccount", id);
        return (Account)aaa;
    }
}
