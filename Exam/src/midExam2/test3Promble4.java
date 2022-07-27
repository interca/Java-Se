package midExam2;

import java.util.Scanner;
import java.util.Stack;

public class test3Promble4 {
    public static void main(String[] args) {
        Stack<Character>stack=new Stack<>();
        Scanner in=new Scanner(System.in);
        System.out.println("输入字符串:");
        String str= in.nextLine();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String num="";
        while(stack.size()>0){
            num=num+stack.pop();
        }
        System.out.println("翻转后字符串为："+num);
    }
}
