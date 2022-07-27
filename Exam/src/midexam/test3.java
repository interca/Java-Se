package midexam;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //初始化三个属性
        var username="";
        var  password=0;
        var ip="";
            System.out.println("输入：");
             username= in.nextLine();
             password= in.nextInt();
             ip= in.next();

             var flag=0;//标记有几个属性符号
             //开始逐一匹配
             //用户名数字组成或者字母组成
             int flagnumber=0;
             for(int i=0;i<username.length();i++){
                 if((username.charAt(i)>='a'&&username.charAt(i)<='z')||(username.charAt(i)>='A')&&
                 username.charAt(i)<='Z'||(username.charAt(i)>='0'&&
                         username.charAt(i)<='9'))flagnumber++;
                 else {
                     System.out.println("非法用户名格式");
                     break;
                 }
             }
             if(flagnumber==username.length())flag++;
             String str=""+password;
             if(str.length()<=18&&str.length()>=6)flag++;
             else System.out.println("非法密码格式");
             String []num=ip.split("\\.");
             //分割字符串
             if(num.length==4){
                 var flag2=0;
                 int []number=new int[4];
                 for(int i=0;i<4;i++){
                     number[i]=Integer.parseInt(num[i]);
                     if(number[i]>=0&&number[i]<=255)flag2++;
                 }
                 if(flag2==4){
                     flag++;
                 }else {
                     System.out.println("非法IPV4格式");
                 }
             }else {
                 System.out.println("非法IPV4格式");
             }
             if(flag==3) System.out.println("正确");
    }
}
