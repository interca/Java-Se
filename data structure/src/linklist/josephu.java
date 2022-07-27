package linklist;

import java.util.Scanner;

//约瑟夫环问题
public class josephu {
    public static void main(String[] args) {
     creatjosephu p=new creatjosephu();
        Scanner in =new Scanner(System.in);
        System.out.println("输入n:");
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            p.add(new node(in.nextInt()));
        }
        System.out.println("链表的遍历：");
      //  p.print();
        System.out.println("约瑟夫环:");
        System.out.println("输入k和m");
        int k= in.nextInt();
        int m= in.nextInt();
        p.circle(k,m,n);
    }
}
class  creatjosephu{
    node head=null;
    node last=null;
    int count=1;
    //添加结点
    public  void add(node p){
        if(head==null){
            head=last=p;
            p.next=head;
        }
        else{
            last.next=p;
            p.next=head;
            last=p;
        }
    }
    public void circle(int k,int m,int n){
        int []nums=new int[n];
        int index=0;
          node right=head;
          node left=null;//便于删除结点；
          int count1=1;//计算第一个报数的位置
          while(true){
              if(count1==k)break;
              left=right;
              right=right.next;
              count1++;
          }
          while(right.next!=right){
              if(count==m){
                  nums[index++]=right.number;
                  left.next=right.next;
                  right=right.next;
                  count=1;
              }else {
                  left = right;
                  right = right.next;
                  count++;
              }
          }
          nums[index]=right.number;
          for(int h:nums){
              System.out.println(h);
          }
    }
    public void print(){
        node head1=head;
        while(true){
            System.out.println(head1);
            head1=head1.next;
            if(head1==head)break;
        }
    }
}
///结点，是一个类。里面包含具体信息
class node{
    int number;
    node next=null;

    public node(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "node{" +
                "number=" + number +
                '}';
    }
}