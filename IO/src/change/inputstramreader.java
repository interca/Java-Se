package change;

import java.io.*;

//转换流
public class inputstramreader {
    public static void main(String[] args) {
        InputStreamReader p2= null;
        try {
            FileInputStream p1=new FileInputStream("iofile\\hh.txt");
            //字节输入转字符
            p2 = new InputStreamReader(p1);
            char []a=new char[20];
            int len;
            while((len=p2.read(a))!=-1){
                String str=new String(a,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(p2!=null)
                p2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
class inputstramreader2{
    //字符输出转字节输出流
    public static void main(String[] args) {
        InputStreamReader p3= null;
        OutputStreamWriter p4=null;
        try {
            File file1=new File("iofile\\hi.txt");
            File file2=new File("iofile\\hh.txt");
            FileInputStream p1=new FileInputStream(file1);
            FileOutputStream p2=new FileOutputStream(file2);
            p3 = new InputStreamReader(p1);
             p4=new OutputStreamWriter(p2,"gbk");
            char []a=new char[20];
            int len;
            while((len=p3.read(a))!=-1){
                p4.write(a,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(p3!=null)
                p3.close();
                if(p4!=null)
                p4.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
