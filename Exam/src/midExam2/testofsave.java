package midExam2;

import java.io.File;
import java.util.Scanner;

public class testofsave {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入加密算法");
        String str= in.next();
       Save p=null;
        File file=new File("c");
        switch (str){
            case "DES":
                p=new DES();
                break;
            case "RSA":
                p=new RSA();
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        if(p!=null)p.fileEncrypt(file);
    }
}
