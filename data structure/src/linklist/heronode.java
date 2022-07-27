package linklist;

//水浒传英雄链表
//头结点，不存数据，尾结点
public class heronode{
    public int num;//编号
    public String name;
    public String Nickname;//称号
    public heronode next=null;//指向下一个结点的指针

    public heronode(int num, String name, String nickname) {
        this.num = num;
        this.name = name;
        Nickname = nickname;

    }

    @Override
    public String toString() {
        return "heronode{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", Nickname='" + Nickname + '\'' +
                '}';
    }
}