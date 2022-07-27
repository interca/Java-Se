package linklist;

public class creatLinkelist {
     heronode head=null;//new heronode(0,"","");//头结点
     heronode last=null;//heronode(0,"","");//尾结点
    //普通添加
    public void insert(heronode node){
        if(head==null){
            head=node;
            last=node;
        }else{
            last.next=node;
            last=node;
        }
    }
    public  void  disprint(){//链表反转
        if(head.next!=null) {
            heronode left = null;
            heronode right = head;
            while (right != null) {
                heronode third = right.next;
                right.next = left;
                left = right;
                right = third;
            }
            head=left;
        }
    }
    //按照编号添加
    public void addsort(heronode node){
        if(head==null){
            head=node;
            last=node;
            return ;
        }
        heronode pre=null;
        heronode head1=head;
        while(true){
            if(pre==null&&head1.num>=node.num){
                head=node;
                node.next=head1;
                break;
            }
            if(pre!=null&&head1==null){
                pre.next=node;
                break;
            }
            if(head1!=null&&pre!=null&&pre.num<=node.num&&head1.num>=node.num){
                pre.next=node;
                node.next=head1;
                break;
            }
            pre=head1;
            head1=head1.next;
        }
    }
    //删除
    public void delect(int number){
        heronode p=null;
        heronode q=head;
        while ((q!=null)){
            if(q.num==number){
                if(p==null){
                    head=q.next;
                }else{
                    p.next=q.next;
                }
                return;
            }
            p=q;
            q=q.next;
        }
        System.out.println("没有找到");
    }
    //遍历链表
    public  void print(){
        heronode head1=head;
        while(true){
            if(head1==null){
                break;
            }
            System.out.println(head1.toString());
            head1=head1.next;
        }
    }

}
