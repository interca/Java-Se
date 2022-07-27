package generic1;

import java.util.TreeSet;
//定制排序用泛型
public class show1 {
    public static void main(String[] args) {
        comp t=new comp();
        TreeSet<Employe> p=new TreeSet<>(t);
        Employe p1=new Employe("bb",12);
        Employe p2=new Employe("aa",25);
        Employe p3=new Employe("dd",33);
        Employe p4=new Employe("aa",1);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);

        for(Employe w:p){
            System.out.println(w);
        }

    }
}
