package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//逆波兰计算器完整版
public class polandnotation2 {
    public static int pority(String a){//判断优先级
        int sum;
        if(a.equals("/")||a.equals("*")){
            sum=1;
        }else if(a.equals("-")||a.equals("+")){
            sum=0;
        }else {
            System.out.println(a);
            throw  new RuntimeException("符号错误");
        }
        return  sum;
    }
    //获得中缀表达式的集合
    public  static List<String>getlist(String string){
        List<String>list=new ArrayList<>();
        String str="";
        int i;
        for(i=0;i<string.length();){
            char c=string.charAt(i);
            if(c>'9'||c<'0'){//是括号或者运算符
                list.add(c+"");
                i++;
            }else{
                str="";
                while(i<string.length()&&(c>='0'&&c<='9')){
                    str=str+c;
                    i++;
                    if(i<string.length())c=string.charAt(i);
                }
                list.add(str);
            }
        }
        return  list;
    }
    //返回后缀表达式的list
    public static List<String>latelist(List<String>list1){
        List<String>list=new ArrayList<>();
        //定义两个堆栈，一个数字堆栈，一个符号堆栈,又因为数字堆栈没有pop操作，可以用一个集合代替
        List<String>numberlist=new ArrayList<>();//数字堆栈(中间结果）
        Stack<String>stackoper=new Stack<>();//符号堆栈

        for(String p:list1){//遍历list1
            //是数，入数字堆栈
            if(p.matches("\\d+")){
                numberlist.add(p);
            }else if(p.equals("(")){//如果是左括号，就直接入符号堆栈
                stackoper.push(p);
                //如果是右括号，则弹出符号堆栈的运算符并且压入数字堆栈，直到遇到左括号
            }else if(p.equals(")")){
                while(!stackoper.peek().equals("(")){
                    numberlist.add(stackoper.pop());
                }
                stackoper.pop();//最后弹出左括号
            }else{//运算符
                //当前符号堆栈为空，压入，如果不为空，当前运算符优先级如果小于堆栈顶部，
                // 则将顶部运算符加入数字堆栈，重复如此
                while(stackoper.size()!=0&&!stackoper.peek().equals("(")&&pority(p)<=pority(stackoper.peek())){
                    numberlist.add(stackoper.pop());
                }
                stackoper.push(p);//将当前运算符压入堆栈
            }
        }
        //将符号堆栈中剩余的运算符号加入到数字堆栈中
        while(stackoper.size()!=0){
            numberlist.add(stackoper.pop());
        }

        return numberlist;
    }
    public static int getresult(List<String>list){//根据后缀表达式计算结果
        Stack<String>stack=new Stack<>();
        for(String k:list){
            if(k.matches("\\d+")){//是数字，压入堆栈
                 stack.push(k);
            }else{//是运算符
                int num1=Integer.parseInt(stack.pop());
                int num2=Integer.parseInt(stack.pop());
                int res=0;
                switch(k){
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
        String string= in.next();//输入字符串
        //将中缀变为后缀，首先先把中缀放到一个集合里面
        List<String>list=getlist(string);
        System.out.println(list);

        //转换好后，开始进行中缀的List转后缀List
        List<String>list2=latelist(list);//获得后缀表达式的集合
        System.out.println(list2);

        int res=getresult(list2);
        System.out.println(res);
    }
}
