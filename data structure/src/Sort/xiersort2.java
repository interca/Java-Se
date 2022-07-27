package Sort;

import java.util.Arrays;

//希尔排序移动法
public class xiersort2 {
    public static void main(String[] args) {
        int []a={111,4,5,6,7,-1,1,10,9};
        int n=a.length/2;
        for(;n>0;n=n/2){
            //从n开始，对其所在的组直接插入
            for(int i=n;i<a.length;i++){
                int j=i;
                int temp=a[i];
                if(a[j]<a[j-n]){
                    while(j-n>=0&&temp<a[j-n]){
                        a[j]=a[j-n];
                        j=j-n;
                    }
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
