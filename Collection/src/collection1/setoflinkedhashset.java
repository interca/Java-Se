package collection1;

import java.util.LinkedHashSet;
import java.util.Set;

//顺序指的是储存顺序,存储是无序的，不是遍历顺序，不可重复，实现了set接口
public class setoflinkedhashset {
    public static void main(String[] args) {
        Set p=new LinkedHashSet();
        p.add("AA");
        p.add(4562);
        p.add(21);
        p.add("CC");
        p.add("甲");
        p.add("huang");
        for(Object k:p){
            System.out.println(k);
        }
    }
}
