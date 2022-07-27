package homework6;

import java.util.*;
public class DelMaxAndMin extends DoThing {
    DoThing nextDoThing ;
    public void setNext(DoThing next) {
        nextDoThing = next;
    }
    public void doThing(double [] a) {

        Arrays.sort(a);
        System.out.print("去掉一个最高分:"+a[a.length-1]+",");
        System.out.println("去掉一个最低分"+a[0]);
        double [] b = Arrays.copyOfRange(a,1,a.length-1);//【代码2 ： 用Arrays 把a中元素第2个到倒数第2的元素拷入b，即去掉最低分和最高分】
        nextDoThing.doThing(b);
    }
}
