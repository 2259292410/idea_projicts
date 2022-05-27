package untils;

import java.sql.Connection;
import java.sql.SQLException;

// 事务管理器
public class TXManager {

    //能用单例吗？
    private  ConnectionUtil connectionUtil;

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    public  void begin(){

        Connection connection = connectionUtil.getConnection();
        // 把自动提交设置为手动提交
        try {
            connection.setAutoCommit(false);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public  void commit(){
        Connection connection = connectionUtil.getConnection();
        try {
            connection.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void rollback(){
        Connection connection = connectionUtil.getConnection();
        try {
            connection.rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public  void close(){
        Connection connection = connectionUtil.getConnection();
        connectionUtil.close();
    }
}
