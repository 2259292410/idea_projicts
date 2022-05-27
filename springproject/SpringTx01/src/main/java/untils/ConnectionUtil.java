package untils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionUtil {

    //  所有的连接从该工具类中获取
    //  java web 中都是多线程中，如何保证我们连接是同一连接了？
    //  可以吧connection 保存在当前的线程中，

    //  ThreadLocal 在当前线程上保存数据
    private  ThreadLocal<Connection> threadLocal=new ThreadLocal<>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection (){
        Connection connection = threadLocal.get();
        if(connection ==null){
            try {
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return  connection;
    }


    public void close(){
        Connection connection = getConnection();
        try {
            connection.close();
            threadLocal.remove();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
