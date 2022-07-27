package collection1;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        methed p=new methed();
        TreeSet t=new TreeSet(p);
        t.add(new people("cc",12));
        t.add(new people("cc",1));
        t.add(new people("aa",69) );
        t.add(new people("AAA",1111));

        for(Object k:t){
            System.out.println(k);
        }
    }
}
class methed implements Comparator<people>{

    @Override
    //按姓名进行排序，然后按年龄
    public int compare(people o1, people o2) {
        if(o1.getName()==o2.getName()){
            return Double.compare(o1.getAge(),o2.getAge());
        }
        else return o1.getName().compareTo(o2.getName());
    }
}
class people{
    String name;
    int age;

    public people(String name,int age){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}