package research;

import java.util.Scanner;

//自定义哈希表
public class hashmap {
    public static void main(String[] args) {
         HashTab hash=new HashTab(7);
        Scanner in=new Scanner(System.in);
        int choice;
        out:
        while(true){
            System.out.println("输入选择：1-添加成员，2-显示成员，3-退出，4-查找，5-删除");
            choice= in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("输入id和姓名:");
                    hash.add(new Emp(in.nextInt(),in.next()));break;
                case 2:
                    hash.printalllink();break;
                case 3:break out;

                case 4:
                    System.out.println("输入查找id：");
                    hash.find(in.nextInt());break;
                case 5:
                    System.out.println("输入删除号码:");
                    hash.delect(in.nextInt());
                    break;
            }

        }
    }
}
//创建哈希表，管理多条链表
class  HashTab{
    EmpLinkedList[]num;
    int size;
    //初始化哈希表链表数量
    public  HashTab(int size){
        this.size=size;
     num=new EmpLinkedList[size];
     for(int i=0;i<size;i++){
         num[i]=new EmpLinkedList();
     }
    }
    //根据员工ID决定添加到哪条链表
    public void add(Emp p){
         int number=hasfun((p.id));
         num[number].add(p);
    }
    //编写散列函数
    public int hasfun(int id){
        return id%size;
    }
    //遍历所有链表
    public void printalllink(){
        for(int i=0;i<num.length;i++){
            System.out.print("链表序号为:"+i+"    ");
            num[i].print();
        }
    }
    //查找
    public void find(int id){
        int number=hasfun(id);
        num[number].find(id);
    }
    public void delect(int id){
        int number=hasfun(id);
        num[number].delect(id);
    }
}
//创建链表
class EmpLinkedList{
    //设置一个头指针,指向第一个元素
    Emp head;
    Emp last;
    public void delect(int id){
        Emp pre=null;
        Emp qre=head;
        while(qre!=null){
            if(qre.id==id){
                if(pre==null){
                    head=qre.next;
                    return;
                }else {
                    pre.next=qre.next;
                    return;
                }
            }
            pre=qre;
            qre=qre.next;
        }
        System.out.println("查无此人,删除失败");
    }
    //添加雇员
    public void add(Emp node){
        if(head==null){
            head=last=node;
        }else {
            last.next=node;
            last=node;
        }
    }
    //遍历
    public void print(){
        if(head==null){
            System.out.println("当前链表为空");
            return;
        }
        Emp head1=head;
        while(head1!=null){
            System.out.print(head1);
            head1=head1.next;
        }
        System.out.println("");
    }
    //查找
    public void find(int id){
        if(head==null){
            System.out.println("查无此人");
            return;
        }
        var head1=head;
        while(head1!=null){
            if(head1.id==id){
                System.out.println("查找成功,员工信息是："+head1);
                return;
            }
        }
        System.out.println("查无此人");
    }
}
//结点,代表员工信息
class Emp{
    int id;
    String name;
    Emp next=null;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
