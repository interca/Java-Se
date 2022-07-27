package homework5;

import java.io.*;
import java.util.zip.*;
public class ReadZipFile {
    public static void main(String args[]) {
        File f=new File("C:\\Users\\waili\\Desktop\\usual\\实验内容\\实验7\\3\\book.zip");
        File dir=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\Homework\\src\\homework5\\my-book");
        byte b[]=new byte[256];
        dir.mkdir();
        try{
            ZipInputStream in=new ZipInputStream(new FileInputStream(f));
            ZipEntry zipEntry=null;
            while((zipEntry=in.getNextEntry())!=null) {
                File file=new File(dir,zipEntry.getName());
                FileOutputStream out=new  FileOutputStream(file);
                int n=-1;
                System.out.println(file.getAbsolutePath()+"的内容：");

                while((n=in.read(b,0,256))!=-1) {
                    String str=new String(b,0,n);
                    System.out.println(str);
                    out.write(b,0,n);
                }
                out.close();
            }
            in.close();
        }
        catch(IOException ee) {
            System.out.println(ee);
        }
    }
}

