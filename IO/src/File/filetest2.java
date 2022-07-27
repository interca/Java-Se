package File;

import java.io.File;
import java.util.Arrays;

//常用方法
public class filetest2 {
    public static void main(String[] args) {
        File file1=new File("iofile\\writer.txt");
        File file2=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\hi.txt");

        //获取绝对路径
        System.out.println(file1.getAbsoluteFile());
        //获取路径
        System.out.println(file1.getPath());
        //获取名字
        System.out.println(file1.getName());
        //获取上一层目录路径，如果没有返回null
        System.out.println(file1.getParentFile());
        //文件长度，不能获取目录长度
        System.out.println(file1.length());
        //最后一次修改时间
        System.out.println(file1.lastModified());
        System.out.println("----------------------------");

        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParentFile());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());


        //获取文件目录，以数组形式返回
        File file3=new File("C:\\Users\\waili\\Desktop\\Java code of idea");
        String[]num=file3.list();
        System.out.println(Arrays.toString(num));

        //同理，返回file类型
        File[] num2=file3.listFiles();
        for(File k:num2){
            System.out.println(k);
        }

        //重命名，把文件重命名为指定路径,将file1转到file2,前者存在，后者不存在
        System.out.println(file1.renameTo(file2));
    }
}
