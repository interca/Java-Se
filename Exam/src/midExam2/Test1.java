package midExam2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str= "xumingchi&&abc123&&2021/10/01";
        String[]num=str.split("&&");
        System.out.println("用户名是："+num[0]);
        System.out.println("密码是："+num[1]);
        System.out.println("日期是："+num[2]);
        //密码由英文字母和数字组成，长度大于等于6，小于等于20
        int flag=0;
        int n=num[1].length();
        var sum=0;
        if(n<6||n>20) System.out.println("密码不匹配");
        else {
           for(int i=0;i<n;i++){
               if(num[1].charAt(i)<='z'&&num[1].charAt(i)>='a'||num[1].charAt(i)<='Z'
               &&num[1].charAt(i)>='A'||num[1].charAt(i)<='9'&&num[1].charAt(i)>='1'){
                   sum++;
               }
           }
           if(sum==n) System.out.println("密码正确");
           else System.out.println("密码不匹配");
        }
        sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<='z'&&str.charAt(i)>='a'||str.charAt(i)<='Z'&&str.charAt(i)
            >='A'){
                sum++;
            }
        }
        System.out.println("该字符串有"+sum+"个英文字母");
        String str2=num[2].replace('/','-');
        System.out.println(str2);
    }

}
