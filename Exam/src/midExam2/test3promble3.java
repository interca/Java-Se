package midExam2;

import java.util.Scanner;

public class test3promble3 {
    public static void main(String[] args) {
        //验证字符串大小写
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char []a=str.toCharArray();
        var sum=0;
        for(char num:a){
            if(num>='a'&&num<='z')sum++;
        }
        System.out.println("该字符串有："+sum+"个"+"小写字母");

    }
}
