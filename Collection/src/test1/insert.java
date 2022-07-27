package test1;

import java.util.ArrayList;
import java.util.HashSet;

//删除List中重复项
public class insert {
    public static void main(String[] args) {
        ArrayList p =new ArrayList();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(1);
        HashSet p1=new HashSet();
        p1.addAll(p);
        p=new ArrayList(p1);
        for(Object k:p){
            System.out.println(k);
        }

    }
}
