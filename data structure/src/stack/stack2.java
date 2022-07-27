package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//利用堆栈进行表达式的计算
public class stack2 {
    public   int maxsize=100;
    public String []stack=new String[maxsize];
    public int index=-1;

    //判断是不是运算符
  public boolean isoper(String a){
      return a.equals("-")||a.equals("+")||a.equals("*")||a.equals("/");
  }
    //判断符号的优先级
    public int priority(String a){
        if(a.equals("*")||a.equals("/")){
            return 1;
        }else if(a.equals("+")||a.equals("-"))return 0;
        throw  new RuntimeException("符号错误");
    }
    //计算
    public int count(int number1,int number2,String oper){
        int sum=0;
        switch (oper){
            case "+":
                sum=number1+number2;break;
            case "-":
                sum=number2-number1;break;
            case "*":
                sum=number1*number2;break;
            case "/":
                sum= (int) (number2*1.0/number1);break;
        }
           return sum;
    }
    //压入数堆栈
    public void push(String number){
          if(isfull1()==false){
              stack[++index]= number;
          }else {
              System.out.println("堆栈满了");
          }
    }

    //抛出数堆栈
    public  String pop(){
        if(isempty()==false){
            return stack[index--];
        }else{
            throw  new RuntimeException("堆栈空");
        }
    }

    //判断数堆栈是否满
    public boolean isfull1(){
        return index==maxsize-1;
    }

    //判断数堆栈是否空
    public boolean isempty(){
        return index==-1;
    }
    //放回堆栈顶部
    public String top(){
      return stack[index];
    }
}


class show {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        int num1;//先抛出的数
        int num2;//后抛出的数
        int index = 0;//扫描字符串
        String oper="";//接受操作符
        int res;//计算结果
        stack2 numberstack = new stack2();//创建两个对象
        stack2 operstack = new stack2();
        int count = 1;
        //把字符串转成字符集合
        List<String>list=new ArrayList<>();
        String str="";
        int i=0;

        while(i<string.length()){
            char c=string.charAt(i);
            if(c>'9'||c<'0'){//如果是符号，直接添加进去
                 i++;
                 list.add(""+c);
            }else{//如果是数字，考虑多位数字
                str="";//初始化
                while(i<string.length()&&(c<='9'&&c>='0')){
                    i++;
                    str=str+c;//拼接字符串
                    if(i<string.length())c=string.charAt(i);
                }
                list.add(str);
             }
          }
        //将负号全部变成正号，并且将负号后面的数符号全部改变
        for(i=2;i<list.size();i++){
            if(list.get(i-1).equals("-")){
                list.set(i-1,"+");
                int number=Integer.parseInt(list.get(i));
                number=-number;
                list.set(i,""+number);
            }
        }
          int n=list.size();//集合的长度

           for(i=0;i<n;i++){
               String ch=list.get(i);//获取字符串
               if(operstack.isoper(ch)){//是字符
                   if(operstack.isempty()){//如果符号堆栈空，压入
                       operstack.push(ch);
                   }else{//如果不为空，当前符号小于等于堆栈中符号的优先级，从符号堆栈中Pop出做运算，否则，直接Push
                       if(operstack.priority(ch)<=operstack.priority(operstack.top())){
                            num1=Integer.parseInt(numberstack.pop());
                            num2=Integer.parseInt(numberstack.pop());
                            oper=operstack.pop();
                            res=numberstack.count(num1,num2,oper);
                            //把结果和符号分别压入堆栈
                           numberstack.push(""+res);
                           operstack.push(ch);
                       }else{//当前符号优先级大于堆栈顶，直接push
                           operstack.push(ch);
                       }
                   }
               }else{//如果是数字，直接push
                   numberstack.push(ch);
               }
           }
        //扫描结束后，顺序从两个堆栈中Pop出对应的数字和符号进行运算
        while (true) {
            //符号堆栈为空的时候，数堆栈中结果就是最后4的结果
            if (operstack.isempty() == true) break;
            num1 = Integer.parseInt(numberstack.pop());
            num2 = Integer.parseInt(numberstack.pop());
            oper = operstack.pop();
            res = numberstack.count(num1, num2, oper);
            numberstack.push(res+"");
        }
        System.out.println(numberstack.top());
    }
}
