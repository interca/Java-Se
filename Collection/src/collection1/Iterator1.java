package collection1;

import java.util.ArrayList;
import java.util.Collection;

//使用Iterator（接口）迭代器进行遍历集合
//next和hasNext(判断下一个元素是不是空）
//remove，删除上一次访问的元素，和next一起用
public class Iterator1 {
    public static void main(String[] args) {
        Collection p1 =new ArrayList();
        p1.add("111");
        p1.add("年后");
        p1.add("true");
       java.util.Iterator p2= p1.iterator();
       while(p2.hasNext()){
           System.out.println(p2.next());
           p2.remove();
       }
        System.out.println(p1);

    }


}
