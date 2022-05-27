package com.hspedu.dao_.test;

import com.hspedu.dao_.dao.UserTestDAO;
import com.hspedu.dao_.domain.UserTest;
import com.hspedu.dao_.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

//测试类
public class TestDAO {
    public static void main(String[] args) throws Exception {
//        UserTestDAO userTestDAO = new UserTestDAO();
//        UserTest userTests = userTestDAO.querySingle("SELECT * FROM usertest WHERE uid>=?", UserTest.class,5);
//        System.out.println(userTests);
//        Connection connection = JDBCUtilsByDruid.getConnection();
//        QueryRunner queryRunner =new QueryRunner();
//        String sql = "select * from userTest where uid=?";
//        List<UserTest> query = queryRunner.query(connection, sql, new BeanListHandler<>(UserTest.class), 5);
//        System.out.println(query);
//        JDBCUtilsByDruid.close(null,null,connection);

String str1="fdsggdsg";
//        String str2 = str1.substring(1);
        //
//        System.out.println(str2);
//        System.out.println(str1.substring(3, 4));
        System.out.println(str1.indexOf("d",5));

    }


}
