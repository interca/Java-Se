package collection1;

import java.util.HashSet;
import java.util.Set;

//collection子接口Set,存储无序，不可重复元素
public class setofHashset {
    public static void main(String[] args) {
        Set p=new HashSet();
        p.add(1);
        System.out.println(p.add(1));
        p.add(2);
        p.add("黄");
        p.add(4);
        p.add("123");
       for(Object k:p){
           System.out.println(k);
       }
    }
}
