package zijieliu;

import java.io.*;
import java.util.Arrays;

public class judge {
    public static void main(String[] args) {
       FileReader reader=null;
       FileWriter writer=null;
       BufferedReader buff=null;
        String str="";
        String str2="";
        try {
            File file1=new File("iofile\\exp5_1.txt");
            File file2=new File("iofile\\ex5_3.txt");
            reader= new FileReader(file1);
           writer= new FileWriter(file2);
           buff =new BufferedReader(reader);

            while((str=buff.readLine())!=null){
                str2=str2+str;//将所有数据全部读取出来
            }
            String [] num2=str2.split(" ");//分割空格
            System.out.println(Arrays.toString(num2));
           for(int i=0;i<num2.length;i++){
               if(Integer.parseInt(num2[i])%2==1){
                   writer.write(num2[i]+" ");
               }
           }

           } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(buff!=null)
                buff.close();
                if(writer!=null)
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
