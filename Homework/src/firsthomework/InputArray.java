package firsthomework;

import java.util.Arrays;

public class InputArray {
    public static void main(String[] args) {
        int [] a = {100,200,300};
        //输出a的长度
        System.out.println("a的长度是："+a.length);
      // 输出数组a的引用
        System.out.println("a的引用是："+a);
        int b[][]= {{1}, {1,1},{1,2,1}, {1,3,3,1},{1,4,6,4,1}};
      // 输出二维数组b的一维数组的个数
        System.out.println(b.length);
      //将数组a的引用赋给b[4]
        b[4]=a;
        System.out.println(Arrays.toString(b[4]));

    }
}
