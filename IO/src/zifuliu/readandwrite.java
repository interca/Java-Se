package zifuliu;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//rend和write一起
public class readandwrite {
    public static void main(String[] args) {
        FileReader read= null;
        FileWriter wirter= null;
        try {
            File file1=new File("iofile\\writer.txt");
            File file2=new File("iofile\\hh.txt");
            read = new FileReader(file1);
            wirter = new FileWriter(file2);
            char [] a=new char[3];
            int len;
            //读入
            while((len=read.read(a))!=-1){
                //写入
               wirter.write(a,0,len);
               wirter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        //关闭流
        try {
            if(read!=null)
            read.close();
            if(wirter!=null)
            wirter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

