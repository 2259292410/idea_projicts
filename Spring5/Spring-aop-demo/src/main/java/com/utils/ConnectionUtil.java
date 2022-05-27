package com.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;



public class ConnectionUtil {

    private ThreadLocal<Connection> threadLocal= new ThreadLocal<Connection>();

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getCollection(){
        Connection connection = threadLocal.get();
        if (connection==null){
            try {
                 connection = dataSource.getConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }


    public void close(){
        try {
            Connection collection = getCollection();
            collection.close();
            threadLocal.remove();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

}
