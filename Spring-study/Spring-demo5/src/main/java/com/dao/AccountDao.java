package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class AccountDao {

    @Autowired
   private JdbcTemplate jdbcTemplate;

    public void addMoney(Integer id, BigDecimal money){
        String sql="update account set money =money+? where id=?";
        jdbcTemplate.update(sql,100,1);
    }

    public void jianMoney(Integer id, BigDecimal money){
        String sql="update account set money =money-? where id=?";
        jdbcTemplate.update(sql,100,2);
    }
}
