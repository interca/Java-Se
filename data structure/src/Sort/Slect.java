package Sort;

import java.util.Arrays;

//选择排序
public class Slect {
    public static void main(String[] args) {
         int []a={5,4,-1,7,-10,99,45,22};
         int n=a.length;
         for(int i=0;i<n-1;i++){
             int min=i;
             for(int j=i+1;j<n;j++){
                 if(a[j]<a[min]){
                     min=j;
                 }
             }
             int temp=a[min];
             a[min]=a[i];
             a[i]=temp;
         }
        System.out.println(Arrays.toString(a));
    }
}
