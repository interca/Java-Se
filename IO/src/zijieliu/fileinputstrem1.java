package zijieliu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//用字节流处理非文本文件
public class fileinputstrem1 {

    public static void main(String[] args) {
        FileInputStream p1=null;
        FileOutputStream p2=null;
        try {
            File file1=new File("iofile\\photo_2022-02-07_21-50-14.jpg");
            File file2 =new File("iofile\\图片.jpg");
            p1=new FileInputStream(file1);
            p2=new FileOutputStream(file2);
            byte []buffer=new byte[5];
            int len;
            while((len=p1.read(buffer))!=-1){
                p2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(p1!=null)
                    p1.close();
                if(p2!=null)
                    p2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
