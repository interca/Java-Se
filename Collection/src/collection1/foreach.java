package collection1;

import java.util.ArrayList;
import java.util.Collection;

//for each 遍历
public class foreach {
    public static void main(String[] args) {
        Collection p=new ArrayList();
        p.add(123);
        p.add(456);
        p.add("黄裕甲");
        //集合元素类型，局部变量，集合对象
        for(Object t:p){
            System.out.println(t);
        }

    }
}
