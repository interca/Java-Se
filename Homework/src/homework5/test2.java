package homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        FileReader fileReader= null;
        String a="";
        BufferedReader bufferedReader=null;
        try {
            File file=new File("C:\\Users\\waili\\Desktop\\Java code of idea\\Homework\\src\\homework5\\Java");
            fileReader = new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String b="";
            while((b=bufferedReader.readLine())!=null){
                a=a+" "+b;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        try {
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner in=new Scanner(System.in);
       String[] str=a.split(" ");
        while(true) {
            String str2= in.next();
            int flag=0;
           for(int i=0;i<str.length;i++){
               if(str[i].equals(str2)){
                   System.out.println("是关键字");
                   flag=1;
                   break;
               }
           }
           if(flag==0) System.out.println("不是关键字");
        }
    }

}
