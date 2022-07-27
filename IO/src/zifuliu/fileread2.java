package zifuliu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//read重载
public class fileread2 {
    public static void main(String[] args)  {
        File file1=new File("iofile\\hi.txt");
        FileReader fir= null;
        try {
            fir = new FileReader(file1);
            char[]a=new char[3];
            int len;
            while((len=fir.read(a))!=-1){
                for(int i=0;i<len;i++){
                    System.out.print(a[i]+" ");
                }
                System.out.println("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fir!=null)
                fir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
