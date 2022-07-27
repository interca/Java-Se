package sql1;

import org.testng.annotations.Test;

import java.sql.*;

public class Deomo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取链接
        String url="jdbc:mysql://127.0.0.1:3306/book?useSSL=false";
        String username="root";
        String password="13538026482";
        Connection p= DriverManager.getConnection(url,username,password);
        String name="黄裕";
        String word="1111";
        String sql="select *from user_book where username=? and password=?";
        PreparedStatement preparedStatement=p.prepareStatement(sql);
        //设置？的值
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,word);
        //执行sql
        ResultSet resultSet= preparedStatement.executeQuery();
        if(resultSet.next()) System.out.println("成功");
        else System.out.println("失败");
        resultSet.close();
        preparedStatement.close();
        p.close();
    }

    /**
     * 预编译原理
     * @throws Exception
     */
    @Test
    public  void test1() throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取链接
        String url="jdbc:mysql://127.0.0.1:3306/book?useSSL=false&useServerPrepStmts=true";
        String username="root";
        String password="13538026482";
        Connection p= DriverManager.getConnection(url,username,password);
        String name="黄裕";
        String word="1111";
        String sql="select *from user_book where username=? and password=?";
        PreparedStatement preparedStatement=p.prepareStatement(sql);
        //设置？的值
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,word);
        //执行sql
        ResultSet resultSet= preparedStatement.executeQuery();
        if(resultSet.next()) System.out.println("成功");
        else System.out.println("失败");
        resultSet.close();
        preparedStatement.close();
        p.close();
    }
}




