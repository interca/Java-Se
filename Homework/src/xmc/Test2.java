package xmc;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
    public int getSum(HashSet<Goods>items){
        int sum=0;
        for(Goods p:items){
            sum=sum+p.getNumber()*p.getPrice();
        }
        return sum;
    }
    public static void main(String[] args) {
       Test2 test2=new Test2();
        Scanner in=new Scanner(System.in);
        HashSet<Goods>set=new HashSet<>();
        for(int i=0;i<5;i++){
            Goods goods=new Goods(in.next(), in.next(),in.nextInt(), in.nextInt());
            if(set.add(goods)==false){
                for(Goods p:set){
                    if(p.getNum().equals(goods.getNum())==true){
                        p.setNumber(p.getNumber()+1);
                        break;
                    }
                }
            }
        }
        System.out.println(test2.getSum(set));
    }
}
