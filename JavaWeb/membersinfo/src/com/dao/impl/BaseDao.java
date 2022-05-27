package com.dao.impl;

import com.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

    //ʹ��DbUtils�������ݿ�
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * update() ��������ִ�У�Insert\Update\Delete���
     *
     * @return �������-1,˵��ִ��ʧ��<br/>����������ʾӰ�������
     */
    public int update(String sql, Object... args) {
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * ��ѯ����һ��javaBean��sql���
     *
     * @param type ���صĶ�������
     * @param sql  ִ�е�sql���
     * @param args sql��Ӧ�Ĳ���ֵ
     * @param <T>  ���ص����͵ķ���
     * @return
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(con);
        }
        return null;
    }

    /**
     * ��ѯ���ض��javaBean��sql���
     *
     * @param type ���صĶ�������
     * @param sql  ִ�е�sql���
     * @param args sql��Ӧ�Ĳ���ֵ
     * @param <T>  ���ص����͵ķ���
     * @return
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection con = JdbcUtils.getConnection();
        try {
            return queryRunner.query(con, sql, new BeanListHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(con);
        }
        return null;
    }

    /**
     * ִ�з���һ��һ�е�sql���
     * @param sql   ִ�е�sql���
     * @param args  sql��Ӧ�Ĳ���ֵ
     * @return
     */
    public Object queryForSingleValue(String sql, Object... args){

        Connection conn = JdbcUtils.getConnection();

        try {
            return queryRunner.query(conn, sql, new ScalarHandler(), args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(conn);
        }
        return null;

    }

}
