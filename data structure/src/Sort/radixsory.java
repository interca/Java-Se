package Sort;

import java.util.Arrays;

//基数排序
public class radixsory {
    public void radsort(int []a) {
        int max = a[0];//得出大的数
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        String s = max + "";
        int maxsize = s.length();//计算最高位是多少
        int[][] radix = new int[10][a.length];//定义十个桶，每个桶长度为数组长度
        int[] number = new int[10];//记录每个桶有多少个元素

        for (int i = 0, n = 1; i < maxsize; i++, n = n * 10) {
            for (int j = 0; j < a.length; j++) {
                int dignumber = a[j] / n % 10;//取出每个元素对应位数的值
                //System.out.println(dignumber
                //);
                radix[dignumber][number[dignumber]] = a[j];//将对应值放入桶中
                number[dignumber]++;//将对应桶元素个数加一
            }
            //将桶中元素俺顺序放回原来数组
            int index = 0;
            for (int j = 0; j < 10; j++) {
                if (number[j] != 0) {
                    for (int w = 0; w < number[j]; w++) {
                        a[index++] = radix[j][w];
                    }
                }
                number[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int []a={4,5,33,12,1,45,1,12,222,3};
        radixsory p=new radixsory();
        p.radsort(a);
        System.out.println(Arrays.toString(a));
    }
}
