package zifuliu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//fileread方法1
public class fileread1 {
    public static void main(String[] args)  {
        File file1=new File("iofile\\hi.txt");
        FileReader fr= null;
        try {
            //提供流
            fr = new FileReader(file1);
            //数据读入
            int data= fr.read();
            while(data!=-1){
                System.out.print((char)data+" ");
                data=fr.read();
            }
            //关闭
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fr!=null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
