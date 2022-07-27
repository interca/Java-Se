package File;

import java.io.File;
import java.io.IOException;

//测试
public class firetest5 {
    public static void main(String[] args) {
        File file1=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\hi.txt");
        //在file1文件上层文件下创建一个文件
        File file2=new File(file1.getParentFile(),"hh.txt");
        try {
            System.out.println(file2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
