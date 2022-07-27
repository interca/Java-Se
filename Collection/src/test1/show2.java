package test1;

import java.util.TreeSet;

public class show2 {
    public static void main(String[] args) {
        compator t=new compator();
        TreeSet p=new TreeSet(t);
        p.add(new Employee("hh",20,new MyDate(2001,12,19)));
        p.add(new Employee("ll",13,new MyDate(2001,1,2)));
        p.add(new Employee("aa",33,new MyDate(9999,12,3)));
        p.add(new Employee("hh",1,new MyDate(1975,2,5)));
        p.add(new Employee("hh",2,new MyDate(2001,12,1)));
       for(Object k:p){
           System.out.println(k);
       }
    }
}
