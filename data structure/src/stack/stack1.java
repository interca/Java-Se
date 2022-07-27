package stack;

import java.util.Scanner;

//堆栈(用数组模拟堆栈）
public class stack1 {
    static int maxsize;
    static int [] stack;
    static  int top=-1;

    //判断堆栈是否满
    public static boolean isfull(){
        return top==maxsize-1;
    }
    //判断堆栈是否空
    public static boolean isempty(){
        return top==-1;
    }
    //压入堆栈
    public static void push(int number){
        if(isfull()==false){
            stack[++top]=number;
        }else{
            System.out.println("堆栈满了");
        }
    }
    //抛出堆栈
    public static void pop(){
        if(isempty()==false){
            System.out.println(stack[top]);
            top--;
        }else{
            System.out.println("堆栈为空");
        }
    }
    //遍历堆栈
    static void print(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        maxsize= in.nextInt();
        stack=new int[maxsize];
        int choice;
        int number;
        while(true){
            System.out.println("输入选择：1-压入堆栈。2-抛出，3-遍历");
            choice= in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("输入数字");
                    push(number= in.nextInt());
                    break;
                case 2:
                    pop();break;
                case 3:
                    print();break;
            }
        }
    }
}
