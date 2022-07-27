package Sort;

import java.util.Arrays;

//希尔排序
public class xiersort {
    public static void main(String[] args) {
        int []a={9,5,4,3,2,1,99,77,55,16};
        int n=a.length/2;
        while(n>0){
            for(int i=n;i<a.length;i++){
                for(int j=i-n;j>=0;j=j-n){
                    if(a[j+n]<a[j]){
                        int temp=a[j+n];
                        a[j+n]=a[j];
                        a[j]=temp;
                    }
                }
            }
            n=n/2;
        }
        System.out.println(Arrays.toString(a));
    }
}
