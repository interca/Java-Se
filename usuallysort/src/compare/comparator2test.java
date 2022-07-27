package compare;

import java.util.Arrays;

public class comparator2test {
    public static void main(String[] args) {
        test test1=new test();
          Goods[] a=new Goods[4];
          a[0]=new Goods("xiaomi",50000);
          a[1]=new Goods("xiaomi",100000);
          a[2]=new Goods("zzzzz",1000);
          a[3]=new Goods("oooooo",200);
        Arrays.sort(a,test1);
        System.out.println(Arrays.toString(a));

    }
}
