package linklist;
//双向链表
public class CreatLinkelist2 {
    Heronode2 head=null;
    Heronode2 last=null;

    public void insert(Heronode2 p){//普通插入
        if(head==null){
            head=last=p;
        }else{
            p.pre=last;
            last.next=p;
            head.pre=p;
            p.next=head;
            last=p;
        }
    }
    //按照Num的顺序插入
    public  void insertsort(Heronode2 p){
          Heronode2 head1=head;
          while(true){
              if(head1.pre==last&&head1.num>=p.num){
                   p.next=head;
                   p.pre=head.pre;
                   head.pre=p;
                   last.next=p;
                   head=p;
                   break;
              }else if(head1.next==head){
                  last.next=p;
                  p.pre=last;
                  last=p;
                  p.next=head;
                  head.pre=p;
                  break;
              }else if(head1.num<=p.num&&head1.next.num>=p.num){
                  head1.next.pre=p;
                  p.next=head1.next;
                  head1.next=p;
                  p.pre=head1;
                  break;
              }
              head1=head1.next;
          }
    }
    //删除
    public void delect(int number){
        Heronode2 p=head;
        while(true){
            if(p.num==number){
                p.pre.next=p.next;
                p.next.pre=p.pre;
                break;
            }
            p=p.next;
        }
    }
    //遍历
    public  void print(){
        Heronode2 p=head;
        while(true){
            System.out.println(p);
            p=p.next;
            if(p==head)break;
        }
    }
}
