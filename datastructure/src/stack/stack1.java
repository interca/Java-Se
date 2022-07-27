package stack;

import java.util.Scanner;

//用链表模拟堆栈
public class stack1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        stack p=new stack();
        out:
        while(true){
            System.out.println("输入选择:1-push,2-pop,3-break");
            int choice= in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("输入要push的数字");
                    p.push(new Node(in.nextInt()));break;
                case 2:
                    p.pop();break;
                case 3:
                    break out;
            }
        }
    }
}
class stack{
    //头结点
    public Node head=null;
    //压入堆栈,用头插法
    public void push(Node node){
       if(head!=null)node.next=head;
       head=node;
    }
    public void pop(){
        if(head==null) System.out.println("堆栈为空");
        else {
            int val=head.val;
            head=head.next;
            System.out.println(val);
        }
    }
}
//代表结点
class Node{
    public int val;
    public Node next=null;

    public Node(int val) {
        this.val = val;
    }

}
class main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        queue p=new queue();
        out:
        while(true){
            System.out.println("输入选择:1-push,2-pop,3-break");
            int choice= in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("输入要push的数字");
                    p.push(new Node(in.nextInt()));break;
                case 2:
                    p.pop();break;
                case 3:
                    break out;
            }
        }
    }
}
class queue{
    //定义头结点和尾结点
    Node head=null;
    Node last=null;

    //压入队列
    public  void push(Node node){
        if(head==null){
            head=last=node;
        }else {
            last.next=node;
            last=node;
        }
    }

    public void pop(){
        if(head==null){
            System.out.println("队列为空，无法抛出");
        }else {
            int val=head.val;
            head=head.next;
            if(head==null)last=null;
            System.out.println(val);
        }
    }

}
