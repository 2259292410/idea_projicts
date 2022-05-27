package com.jdbc.druid_;

import com.jdbc.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtils_USE {
    public void testQueryMany() throws SQLException {
        //返回结果是多行的情况
        // 1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. 使用 DBUtils 类和接口 , 先引入 DBUtils 相关的 jar , 加入到本 Project
        // 3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 就可以执行相关的方法，返回 ArrayList 结果集
        String sql = "select * from actor where id >= ?";
        // 注意: sql 语句也可以查询部分列 String sql = "select id, name from actor where id >= ?";
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
        System.out.println("输出集合的信息");
        for (Actor actor : list) {
            System.out.print(actor);
        }
        //释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }
}

