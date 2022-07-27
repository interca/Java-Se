package File;

import java.io.File;
import java.io.IOException;

//file方法三，创建文件
public class filetest4 {
    public static void main(String[] args) {
        File file1=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\www.txt");
        //创建文件，若存在，则不创建，返回falses
        if(!file1.exists()){
            try {
                System.out.println(file1.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(file1.delete());//存在就删除
        }
        //创建文件目录，如果存在，就不创建了,如果连上级目录都不在，那不造了
         File file2=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\io0");
        System.out.println(file2.mkdir());

        //mkdirs上级，目录不在，一并创造
        File file3=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\io1\\io2\\io3");
        System.out.println(file3.mkdirs());
    }
}
