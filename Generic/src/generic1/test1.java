package generic1;

import java.util.*;

//泛型指定数据类型
public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer>p=new ArrayList<>();
        p.add(1);
        p.add(2);
        p.add(-12);
        p.add(-1);
        Collections.sort(p);
       Iterator<Integer> inter=p.iterator();
       while(inter.hasNext()) {
           System.out.println(inter.next());
       }
        System.out.println("------------------------------------");

        Map<String,Integer> map=new HashMap<>();
        map.put("tom",11);
        map.put("ttim",59);
        map.put("jiake",90);

        //遍历key
        Set<String> key1=map.keySet();
        for(String a:key1){
            System.out.println(a);
        }
        System.out.println("---------------------------");

        //遍历value
        Collection<Integer> valu=map.values();
        Iterator<Integer> ing=valu.iterator();
        while(ing.hasNext()){
            System.out.println(ing.next());
        }
        System.out.println("-----------------------------------");

         //遍历key-value
        Set<Map.Entry<String,Integer>> t=map.entrySet();
        Iterator<Map.Entry<String,Integer>> inea=t.iterator();

        while(inea.hasNext()){
           Map.Entry<String,Integer> e =inea.next();
           String key=e.getKey();
           int value=e.getValue();
            System.out.println(key+"--->"+value);
        }

        }
    }

