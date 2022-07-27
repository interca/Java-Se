package linklist;

import java.util.Scanner;
import java.util.Stack;
//堆栈遍历链表
public class stack1 {
    public static void main(String[] args) {
        //声明一个堆栈
        Stack<heronode> p=new Stack<heronode>();
        Scanner in=new Scanner(System.in);
        System.out.println("输入人数:");
        int n=in.nextInt();
        System.out.println("输入信息:");
        creatLinkelist p1=new creatLinkelist();
        for(int i=0;i<n;i++) {
            p1.insert((new heronode(in.nextInt(), in.next(), in.next())));
        }
        heronode head=p1.head;
        //将结点Push进去堆栈
        while(head!=null){
            p.push(head);
            head=head.next;
        }
        //抛出
        while(p.size()>0){
            System.out.println(p.pop());

        }
    }
}
