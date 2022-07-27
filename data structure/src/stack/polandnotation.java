package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
//逆波兰表达式

public class polandnotation {

     static public List<String> getlist(String nums){
         List<String> list=new ArrayList<>();
         String [] a=nums.split(" ");//分开空格，将字符串读进字符串数组
         for(String t:a){
             list.add(t);
         }
         return  list;
    }
    public  static  int caulcuate(List<String>list){//计算过程
        Stack<String>stack=new Stack<>();
        for(String nums:list){
            //使用正则表达式取出数
            if(nums.matches("\\d+")){//匹配多位数
                stack.push(nums);
            }else {//是一个运算符
                int num1=Integer.parseInt(stack.pop());
                int num2=Integer.parseInt(stack.pop());
                int res=0;
                switch(nums){
                    case "+":res=num1+num2;break;
                    case "-":res=num2-num1;break;
                    case "*":res=num1*num2;break;
                    case "/":res=num2/num1;break;
                    default:
                        System.out.println("错误");break;
                }
                stack.push(res+"");//计算后重新压入
            }
        }
        return Integer.parseInt(stack.pop());
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入表达式：");

         String exception= "4 13 5 / -";
        List<String> list=getlist(exception);//获得分割好的字符串集合
        System.out.println(list);
          int res=caulcuate(list);
        System.out.println("结果是："+res);
    }
}
