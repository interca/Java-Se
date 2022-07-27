package buffered;

import java.io.*;

//缓冲流操作
public class Buffered1 {
    public static void main(String[] args)  {
        //复制图片
        //缓冲流
        BufferedInputStream p3= null;
        BufferedOutputStream p4= null;
        try {
            File file1=new File("iofile\\photo_2022-02-07_21-50-14.jpg");
            File file2=new File("iofile\\图片1.jpg");
            //造结点流
            FileInputStream p1=new FileInputStream(file1);
            FileOutputStream p2=new FileOutputStream(file2);
            //造缓冲流
            p3 = new BufferedInputStream(p1);
            p4 = new BufferedOutputStream(p2);
            byte[]b=new byte[5];
            int len;
            while((len=p3.read(b))!=-1){
                p4.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(p3!=null){
                    p3.close();
                }
                if(p4!=null){
                    p4.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }

}
