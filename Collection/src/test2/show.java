package test2;

import java.util.HashSet;

public class show {
    public static void main(String[] args) {
        HashSet p=new HashSet();
        Person p1=new Person(1001,"aa");
        Person p2=new Person(1001,"bb");
        p.add(p1);
        p.add(p2);
        System.out.println(p);
        p1.setName("cc");
        //哈希值去找位置，位置为空所以什么都没有删除
        p.remove(p1);
        System.out.println(p);
        p.add(new Person(1001,"cc"));
        System.out.println(p);
        p.add(new Person(1001,"aa"));
        System.out.println(p);
    }
}
