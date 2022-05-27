import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hello {
    public static void main(String[] args) {
//        String user = "root";
//        String pwd = "hsp";
//        String ulr = "jdbc:mysql://localhost:3306/myschool?useUnicode=true&characterEncoding=utf-8";
//        //加载驱动
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Connection con = null;
//        Statement statement = null;
//        ResultSet rs = null;
//        try {
//            String sql = "select * from student";
//            //获得连接对象
//            con = DriverManager.getConnection(ulr, user, pwd);
//            //获取Stateemnt对象
//            statement = con.prepareStatement(sql);
//            rs = statement.executeQuery(sql);
//            while (rs.next()) {
//                System.out.print(rs.getString(3));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                rs.close();
//                statement.close();
//                con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


