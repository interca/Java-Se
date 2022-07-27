package Map;

import java.util.*;

public class Hashmap1{
    public static void main(String[] args) {
        HashMap p= new HashMap();
        //put方法,添加，修改
        //putAll将另一个MAP放入一个MAP
        p.put("123",5);
        p.put("234",6);
        p.put("567",5);
        p.put("123","黄");
        HashMap p2=new HashMap();
        p2.putAll(p);
        System.out.println(p);
        System.out.println(p2);
        System.out.println("------------------------------------");

        //remove移除,clear清空
        p.remove("123");
        System.out.println(p);
        p2.clear();
        System.out.println(p2);
        System.out.println("----------------------------------------");

        //get()获取指定的key对应的value；
        HashMap p3=new HashMap();
        p3.put("123",5);
        p3.put("234",6);
        p3.put("567",5);
        p3.put("123","黄");
        System.out.println(p.get("567"));
        System.out.println("--------------------------");

        //containsKey和containValue--是否包括key或者value
        System.out.println(p3.containsValue("黄"));

        //isEmpty-是否为空
        System.out.println(p3.isEmpty());
        System.out.println("---------------------------------------------");

        HashMap p4=new HashMap();
        p4.put("123",1);
        p4.put("234",2);
        p4.put("567",3);
        p4.put("123","黄");
        //迭代器和增强for-》collection和set都可以用
        //遍历所有的key--keyset()
        Set s=p4.keySet();
        Iterator t=s.iterator();
        while(t.hasNext()){

            System.out.println(t.next());
        }
        //遍历所有value
        Collection c=p4.values();
        for(Object w:c){
            System.out.println(w);
        }

        //遍历key-value->entrySet
        Set entry=p4.entrySet();
        for(Object k:entry){
            Map.Entry entyu=(Map.Entry)k;
            System.out.println(entyu.getKey()+"--------"+entyu.getValue());
        }


    }
}
