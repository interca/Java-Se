package compare;

import java.util.Arrays;

public class goodtest {
    public static void main(String[] args) {
        good [] p=new good[4];
        p[0]=new good("小米",500);
        p[1]=new good("苹果",2000);
        p[2]=new good("华为",100);
        p[3]=new good("魅族",20000);
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }
}
