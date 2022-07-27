package homework5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class merge {
    public static void main(String[] args) {
        File file1;
        File file2;
        FileInputStream read=null;
        FileOutputStream write=null;
        try {
            file1=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\Homework\\src\\homework5\\text1");
            file2=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\Homework\\src\\homework5\\text2");
            read= new FileInputStream(file1);
            write=new FileOutputStream(file2,true);
            byte[]b=new byte[1024];
            int len;
            while((len=read.read(b))!=-1){
                write.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(read!=null)
                read.close();
                if(write!=null)
                write.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
