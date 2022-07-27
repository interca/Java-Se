package Collections;

import Map.copare;
import Map.people;

import java.util.*;

//集合的工具类，操作collection和map
public class collectionstest1 {
    public static void main(String[] args) {
        //reverse反转list中元素
        ArrayList p=new ArrayList();
        p.add(1);
        p.add(200);
        p.add(5);
        p.add(200);
        Collections.reverse(p);
        System.out.println(p);
        System.out.println("------------------------");

        //对list随机排序,shuffle
        Collections.shuffle(p);
        System.out.println(p);
        System.out.println("-----------------------------");

        //sort自然排序
        Collections.sort(p);
        System.out.println(p);
        System.out.println("-------------------------------");

        ///swap交换元素
        Collections.swap(p,1,2);
        System.out.println(p);
        System.out.println("--------------------------------");

        //sort(List,Comparator)定制排序
        List<people>list=new ArrayList<>();
        people p1=new people("bb",12);
        people p2=new people("zz",15);
        people p3=new people("aa",55);
        people p4=new people("ww",24);
        people p5=new people("aa",1);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        copare t=new copare();
        Collections.sort(list,t);
        System.out.println(list);
        System.out.println("-----------------------------------------------");
        TreeMap t1=new TreeMap<>(t);
        t1.put(p1,2);
        t1.put(p2,12);
        t1.put(p3,1);
        t1.put(p4,16);
        t1.put(p5,24);
        Set entry=t1.entrySet();
        for(Object w:entry){
            Map.Entry e=(Map.Entry)w;
            System.out.println(e.getKey()+"----->"+e.getValue());

        }
        System.out.println("--------------");
        //max,min找最值
        System.out.println(Collections.max(p));
        System.out.println(Collections.min(p));
        System.out.println("-----------------------------------");

        //frequency,出现频率
        System.out.println(Collections.frequency(p,200));

        //copy复制
        //先指定大小
        List l=Arrays.asList(new Object[p.size()]);
        Collections.copy(l,p);
        System.out.println(l);


    }
}
