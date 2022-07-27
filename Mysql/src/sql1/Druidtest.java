package sql1;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class Druidtest {
    @Test
    public void test() throws Exception {
        //加载配置文件
        Properties prop=new Properties();
        prop.load(new FileInputStream("C:\\Users\\waili\\Desktop\\Java code of idea\\Mysql\\src\\druid.properties"));
        //获取连接池对象
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        //获取数据库链接
        Connection connection=dataSource.getConnection();
        System.out.println(connection);

    }
}
