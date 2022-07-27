package Sort;

import java.util.Arrays;

//冒泡排序
public class Bubble {
    public static void main(String[] args) {
         int []a={0,99,5,-10000,8,600,100};
         int n=a.length;
         int flag=0;
         for(int i=0;i<n-1;i++){
             flag=0;
             for(int j=0;j<n-1-i;j++){
                 if(a[j]>a[j+1]){
                     flag=1;
                     int temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                 }
             }
             if(flag==0)break;
         }
        System.out.println(Arrays.toString(a));
    }
}
