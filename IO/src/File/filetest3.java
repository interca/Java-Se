package File;

import java.io.File;

//file方法测试2
public class filetest3 {
    public static void main(String[] args) {
        File file1=new File("hello.txt");
        //是否是目录
        System.out.println(file1.isDirectory());
        //是否是文件
        System.out.println(file1.isFile());
        //是否存在
        System.out.println(file1.exists());
        //是否可读
        System.out.println(file1.canRead());
        //是否可写
        System.out.println(file1.canWrite());
        //是否隐藏
        System.out.println(file1.isHidden());

        System.out.println("-------------------------------------------");
        File file2=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\hi.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
}
