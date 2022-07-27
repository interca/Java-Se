package File;

import java.io.File;

//文件File类的使用
public class filetest1 {
    public static void main(String[] args) {
        File file1=new File("hello.txt");//当前model所在路径
        //绝对路径
        File file2=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\IO\\he.txt");
        System.out.println(file1);
        System.out.println(file2);

        File file3=new File("C:\\Users","waili");
        System.out.println(file3);

        File file4=new File(file3,"nihao.txt");
        System.out.println(file4);
    }
}
