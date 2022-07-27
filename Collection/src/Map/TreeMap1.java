package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//保证key是同一个类创建的，key一定要同种类型的参数
//自然排序，定制排序
public class TreeMap1 {
    public static void main(String[] args) {
        people p1=new people("bb",12);
        people p2=new people("zz",15);
        people p3=new people("aa",55);
        people p4=new people("ww",24);
        people p5=new people("aa",1);
        copare t=new copare();
        TreeMap p=new TreeMap<>(t);
        p.put(p1,2);
        p.put(p2,12);
        p.put(p3,1);
        p.put(p4,16);
        p.put(p5,24);
        Set entry=p.entrySet();
        for(Object w:entry){
            Map.Entry e=(Map.Entry)w;
            System.out.println(e.getKey()+"----->"+e.getValue());

        }
    }
}

