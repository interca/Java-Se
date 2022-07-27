package midexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            List<Character>list=new ArrayList<>();
            var flag=1;
            System.out.println("");
            String str = in.nextLine();
            if (str.length() == 0) System.out.println("非法整数字符串");
            int i;
            for ( i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-'&&flag==1) {
                    list.add('-');
                    flag=0;
                }
                else if(str.charAt(i)=='+'&&flag==1) {
                    flag=0;
                }
                else if(flag==0&&(str.charAt(i)=='-'||str.charAt(i)=='+'))break;
                else if (str.charAt(i) == ' ' || (str.charAt(i) >= 'a' && str.charAt(i) <='z') ||
                        (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A')) {
                    System.out.println("非法整数格式字符串");
                    break;
                } else {
                    list.add(str.charAt(i));
                }
            }
            if(i==str.length()){
                for(char k:list){
                    System.out.print(k);
                }
            }
        }
    }
}
