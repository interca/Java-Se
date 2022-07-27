package Sort;

import java.util.Arrays;

public class Heapsort {
    //堆排序
    public static void heapsort(int []a){
       for(int i=a.length/2-1;i>=0;i--){
           adjustheap(a,i,a.length);
       }
        for(int i=a.length-1;i>0;i--){
            int temp=a[i];
            a[i]=a[0];
            a[0]=temp;
            adjustheap(a,0,i);
        }
        System.out.println(Arrays.toString(a));
    }
    //将一个数组调整为大顶堆
    //i,是非叶子结点的索引，length是表示对多少个元素进行调整
    public static void adjustheap(int []a,int i,int length){
        int temp=a[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length&&a[k]<a[k+1]){
                k++;
            }
            if(a[k]>temp){
                a[i]=a[k];
                i=k;
            }else {
                break;
            }
        }
        a[i]=temp;
    }
    public static void main(String[] args) {
        int []a={11,-2,4,6,81,5,93,33,11};
        heapsort(a);
    }
}
