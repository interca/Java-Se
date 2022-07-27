package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Hashtable 的子类Properties用于文件的输入，key 和value都是string
public class PropertiseTest {
    public static void main(String[] args) throws FileNotFoundException {
        Properties p=new Properties();
        //创建一个流
        FileInputStream fie= null;
        try {
            fie = new FileInputStream("work.properties");
            p.load(fie);
            String name=p.getProperty("name");
            String num=p.getProperty("num");
            System.out.println("name="+name+",num="+num);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fie.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
