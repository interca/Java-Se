package compare;

import java.util.Comparator;

public class test implements Comparable, Comparator<Goods> {

    //先按名字由低到高，如果名字一样价格从高的低
    public int compare(Goods o1, Goods o2) {
        
        if(o1 instanceof Goods&&o2 instanceof Goods){
            Goods p1=(Goods)o1;
            Goods p2=(Goods)o2;
            if(p1.getName().equals(p2.getName())){
                return -Double.compare(p1.getPrice(),p2.getPrice());
            }else{
                return p1.getName().compareTo(p2.getName());
            }
        }else{
            throw new RuntimeException("数据错误");
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
