package xmc;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        HashSet<Person>set=new HashSet<>();
        set.add(new Person("小明",44));
        set.add(new Person("小李",12));
        set.add(new Person("小红",23));
        set.add(new Person("小明",21));
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
