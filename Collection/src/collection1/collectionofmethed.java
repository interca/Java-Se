package collection1;

import java.util.*;
import java.util.Iterator;

//collection是接口，里面有方法，Arraylist等实现了接口
public class collectionofmethed {
    public static void main(String[] args) {
        //add方法，添加元素到集合中//什么都可以放
        Collection p=new ArrayList();
        p.add("aa");
        p.add("bb");
        p.add(123);
        p.add((new Date()));
        //size()
        System.out.println(p.size());
        System.out.println("-------------------");

        //addAll,将其他集合的元素加到另一个集合
        Collection p1=new ArrayList();
        p1.add("cccc");
        p.addAll(p1);
        System.out.println(p);
        System.out.println("----------------------------");

        //isEmpty判断集合是不是空
        System.out.println(p.isEmpty());
        System.out.println("--------------------------");

        //clear()清空集合
        System.out.println(p1);
        p1.clear();
        System.out.println(p1);
        System.out.println("--------------------------------");

        //contains()//判断是否包含,字符串判断内容，内容相同就true
        //实际调用equlas一个个比较
        System.out.println(p.contains("aa"));
        System.out.println(p.contains("nuah"));
        System.out.println("--------------------");

        //conttainsAll，一个集合是否包含另一个集合中全部元素
        System.out.println(p1.containsAll(p));
        p1.addAll(p);
        System.out.println(p1.containsAll(p));
        System.out.println("--------------------------");

        //remove 移除,removeAll,移除一个集合中属于另一个集合的元素
        Collection p2=new ArrayList();
        p2.add("123");
        p2.add("55");
        p2.add("78");
        p2.remove("55");
        System.out.println(p2);
        Collection p3=new ArrayList();
        p3.add("123");
        p2.removeAll(p3);
        System.out.println(p2);
        System.out.println("------------------------");

        //retainAll获取交集
        Collection t1=new ArrayList();
        t1.add(123);
        t1.add(2222);
        t1.add(45);
        Collection t2=Arrays.asList(123,4);
        System.out.println(t1);
        System.out.println(t2);
        t1.retainAll(t2);
        System.out.println(t1);
        System.out.println("--------------------------");

        //equals比较两个集合
        System.out.println(t1.equals(t2));
         Collection t3 =new ArrayList();
         Collection t4=new ArrayList();
         t3.add(1);
         t3.add(2);
         t4.add(2);
         t4.add(1);
        System.out.println(t3.equals(t4));//顺序要一样

        //toArray将集合变成数组
        Object [] a=t3.toArray();
        for(Object k:a){
            System.out.println(k);
        }
        System.out.println("-----------------------------");

        //将数组变成集合
        String []z =new String[]{"111","222","3333"};
        List<String> list= Arrays.asList(z);
        System.out.println(list);
        System.out.println("----------------------------------------");

        Iterator<String> w = list.iterator();
        System.out.println(w.next());
        System.out.println(w.next());

    }
}
