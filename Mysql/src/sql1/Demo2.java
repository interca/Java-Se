package sql1;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.testng.annotations.Test;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取链接
        String url="jdbc:mysql://127.0.0.1:3306/book";
        String username="root";
        String password="13538026482";
        Connection p= DriverManager.getConnection(url,username,password);
        //定义sql
        String sql="select*from employees";
        //获取statement对象
        Statement statement=p.createStatement();
        //执行sql语句
        //获取结果集合
        ResultSet set=statement.executeQuery(sql);
        //处理集合
        while(set.next()){
            int id=set.getInt(1);
            String names=set.getString(2);
            int age=set.getInt(3);
            double salary=set.getDouble(4);
            String birthday=set.getString(5);
            double bones=set.getDouble(6);
            System.out.println(id+"\t"+names+"\t"+age+"\t"+salary+"\t"+birthday+"\t"+bones);
            System.out.println("--------------------------");
        }
        set.close();
        statement.close();
        p.close();
    }
    @Test
    public  void test() throws SQLException {
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/book");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("13538026482");
        DruidPooledConnection connection=druidDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
