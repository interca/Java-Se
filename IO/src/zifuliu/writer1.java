package zifuliu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//写操作
//从内存写到文件
public class writer1 {
    public static void main(String[] args)  {
        File file1=new File("iofile\\writer.txt");
        //判断是否覆盖文件内容
        FileWriter fr= null;
        try {
            fr = new FileWriter(file1,true);
            fr.write("你好\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            {
                try {
                    if(fr!=null)
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
