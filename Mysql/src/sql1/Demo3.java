package sql1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3 {
    public static void main(String[] args)  throws Exception{
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取链接
        String url="jdbc:mysql://127.0.0.1:3306/dbtest1";
        String username="root";
        String password="13538026482";
        Connection connection= DriverManager.getConnection(url,username,password);
        //创建表语句
        String str="create table table1(name varchar(30),age int,score int);";
        //插入1表数据
        String num1="insert into table1 values('小黄',20,70);";
        String num2="insert into table1 values('小李',22,80);";
        String num3="insert into table1 values('小周',18,40);";
        String num4="insert into table1 values('小明',23,20);";
        Statement statement=connection.createStatement();
        statement.executeUpdate(str);
        statement.executeUpdate(num1);
        statement.executeUpdate(num2);
        statement.executeUpdate(num3);
        statement.executeUpdate(num4);
        ResultSet set=statement.executeQuery("select *from table1");
        while(set.next()){
            String name=set.getString(1);
            int age=set.getInt(2);
            int score=set.getInt(3);
            System.out.println(name+"  "+age+"  "+score+"  ");
            System.out.println("--------------------------------------");
        }
        set.close();
        statement.close();
        connection.close();
    }
}
