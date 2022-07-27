package zijieliu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//字节流处理文本
//文本文件最好用字符流，否则字节流中文可能乱码
public class Fileinputstrem {
    public static void main(String[] args) {
        FileInputStream str=null;
        try {
            File file1=new File("iofile\\hi.txt");
           str=new FileInputStream(file1);
            byte[]p=new byte[7];
            int len;
            while((len=str.read(p))!=-1){
                String s=new String(p,0,len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(str!=null){
                    str.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
