package linklist;
//创建双向链表
public class Heronode2 {
    public String name;
    public  int num;
    Heronode2 pre=null;
    Heronode2 next=null;

    public Heronode2(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Heronode2{" +
                "name=" + name +
                ", num=" + num +"}";

    }
}
