package collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//collection 中子接口List,的实现类ArraysList,linkedList
public class listofArrraysList {
    public static void main(String[] args) {
        ArrayList p=new ArrayList();
        p.add(1);
        p.add("123");
        p.add("huang");
       //add方法，一种是指定位置，一种是按顺序插入
        p.add(1,"xiaohuan");
        System.out.println(p);
        System.out.println("----------------------");

        //addAll
        List p1= Arrays.asList(5,6,7);
        p.addAll(1,p1);//index指定位置插入
        System.out.println(p);
        System.out.println("---------------------------");

        //get
        System.out.println(p.get(5));
        System.out.println("--------------------------");

        //indexOf,返回元素第一次出现位置
        System.out.println(p.indexOf("123"));
        System.out.println("--------------------------");

        //lastindexOf,返回最后出现位置

        //remove(index)删除某位置，返回
        System.out.println(p.remove(2));
        System.out.println(p);
        System.out.println("----------------------");

        //set(index)设置某元素值
        p.set(1,"小黄");
        System.out.println(p);
        System.out.println("----------------------");

        //subList，放回下标之间元素,左闭右开,本身不变
        System.out.println(p.subList(1,5));
        System.out.println(p.size());


          Iterator t=  p.iterator();
          while(t.hasNext()){
              System.out.println(t.next());
          }
    }
}
