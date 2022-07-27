package buffered;

import java.io.*;

//缓冲流2
public class Buffered2 {
    public static void main(String[] args) {

        BufferedReader p3 = null;
        BufferedWriter p4=null;
        try {
            File file1=new File("iofile\\hi.txt");
            File file2=new File("iofile\\hh.txt");
            FileReader p1=new FileReader(file1);
            FileWriter p2=new FileWriter(file2);
            p3 = new BufferedReader(p1);
            p4=new BufferedWriter(p2);
            char[]ch=new char[5];
            int len;
            while((len=p3.read(ch))!=-1){
                for(int i=0;i<len;i++){
                    System.out.print(ch[i]);
                }
                p4.write(ch,0,len);
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
