package linklist;

import java.util.Scanner;
//用堆栈倒序遍历数组
public class show2 {
    static int []a=new int[2000];
    static int index=0;
    public static void push(int number){
        a[index++]=number;
    }
    public  static  void pop(){
        index--;
         while(index>=0){
             System.out.println(a[index]);
             index--;
         }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入人数:");
        int n=in.nextInt();
        System.out.println("输入信息:");
        creatLinkelist p1=new creatLinkelist();
        for(int i=0;i<n;i++) {
            p1.insert((new heronode(in.nextInt(), in.next(), in.next())));
        }
        heronode head=p1.head;
        while(head!=null){
            push(head.num);
            head=head.next;
        }
        pop();
    }
}
