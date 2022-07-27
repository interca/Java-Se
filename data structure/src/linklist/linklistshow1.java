package linklist;

import java.util.Scanner;
//插入，添加，删除，反向
///单向链表
public class linklistshow1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入人数:");
        int n=in.nextInt();
        System.out.println("输入信息:");
        creatLinkelist p1=new creatLinkelist();
        for(int i=0;i<n;i++){
            p1.addsort((new heronode(in.nextInt(),in.next(),in.next())));
        }
        int choice;
        int number;
        while(true){
            System.out.println("输入选择，1-插入，2-删除，3-打印，4-反转");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("输入数");
                    p1.addsort(new heronode(in.nextInt(), in.next(), in.next()));
                    break;
                case 2:
                    System.out.println("输入删除号码");
                    number= in.nextInt();
                    p1.delect(number);break;
                case 3:p1.print();break;

                case 4:p1.disprint();break;
            }
        }
    }
}

