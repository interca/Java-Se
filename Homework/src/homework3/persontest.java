package homework3;

import java.util.Scanner;

public class persontest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Person p=new Person();
        System.out.println("请输入数据：");
         while(true){
             try {
                 p.setAge(in.nextInt());
                 break;
             } catch (IleageAgeException e) {
                 e.show();
             }
         }
        System.out.println("年龄是："+p.getAge());
    }
}
