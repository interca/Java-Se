package firsthomework;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,500,600,700,800};
        int [] b,c,d;
        System.out.println(Arrays.toString(a));
        b = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));
        c=Arrays.copyOf(a,4);//Arrays调用copyOf方法复制数组a的前4个元素
        System.out.println(Arrays.toString(c)); //Arrays调用toString方法返回数组c元素值的字符串
        d =Arrays.copyOfRange(a,a.length-4,a.length);//Arrays调用copyOfRange方法复制数组a的后4个元素
        System.out.println(Arrays.toString(d));
        //将-100赋给数组c的最后一个元素
        c[c.length-1]=-100;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(a));

    }
}
