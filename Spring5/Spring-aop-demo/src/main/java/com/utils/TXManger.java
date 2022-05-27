package com.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;


public class TXManger {

    private ConnectionUtil connectionUtil;

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    public void begin()  {
        Connection collection = connectionUtil.getCollection();
        try {
            collection.setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

        public void commit(){
        try {
            Connection collection = connectionUtil.getCollection();
            collection.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void rollback (){
        try {
            Connection collection = connectionUtil.getCollection();
            collection.rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void close() {
        connectionUtil.close();
    }
}