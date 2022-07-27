package sql1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo1 {
    public static void main(String[] args)throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取链接
        String url="jdbc:mysql://127.0.0.1:3306/dbtest1";
        String username="root";
        String password="13538026482";
        Connection p=DriverManager.getConnection(url,username,password);
        //定义sql语句
        String sql="update employees set names='黄裕' where (id=2222)";
        //获取指向sql的对象
        Statement statement=p.createStatement();
        //执行sql
        int count=statement.executeUpdate(sql);//受影响的行数
        System.out.println(count);
        statement.close();
        p.close();
    }
}

