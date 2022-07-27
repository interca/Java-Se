package collection1;

import java.util.TreeSet;

//set的实现类TreeSet
public class setofTreeset {
    public static void main(String[] args) {
        //数据要是相同类的对象
        //按顺序输出
        TreeSet p=new TreeSet();
        p.add(123);
        p.add(456);
        p.add(-789);
        for(Object k:p){
            System.out.println(k);
        }
    }
}
