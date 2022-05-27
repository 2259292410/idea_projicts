package com.dao.impl;

import com.dao.AccountDao;
import com.utils.ConnectionUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;


public class AccountDaoImpl implements AccountDao {

    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    private ConnectionUtil connectionUtil;
    public void addMoney(Integer id) {
        String sql="UPDATE `account`  SET money=money+100 WHERE id=?";
        try {
            queryRunner.update(connectionUtil.getCollection(),sql,id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void lessMoney(Integer id) {
        String sql="UPDATE `account`  SET money=money-100 WHERE id=?";
        try {
            queryRunner.update(connectionUtil.getCollection(),sql,id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
