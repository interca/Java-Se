package linklist;

import java.util.Scanner;
//双链表操作
public class show3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,choice;

        System.out.println("输入人数：");
        n= in.nextInt();
        CreatLinkelist2 p=new CreatLinkelist2();
        System.out.println("输入信息");

        for(int i=0;i<n;i++){
            p.insert(new Heronode2(in.next(),in.nextInt()));
        }

        while(true){
            System.out.println("输入选择 1-加入，2-删除，3-遍历，4-顺序加入");
            choice= in.nextInt();
            switch (choice){
                case 1:p.insert(new Heronode2(in.next(),in.nextInt()));break;
                case 2:p.delect(in.nextInt());break;
                case 3:p.print();break;
                case 4:p.insertsort(new Heronode2(in.next(), in.nextInt()));break;
            }
        }
    }
}
