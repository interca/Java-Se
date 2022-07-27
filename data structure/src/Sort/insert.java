package Sort;

import java.util.Arrays;

//插入排序
public class insert {
    public static void main(String[] args) {
        int []a={2000000,9,-1,40,2,5,99,32,10000,-10000};
        int n=a.length;
        for(int i=1;i<n;i++){
            int num=a[i];
            int index=i;
            while(index-1>=0&&a[index-1]>num){
                a[index]=a[index-1];
                index--;
            }
            a[index]=num;
        }
        System.out.println(Arrays.toString(a));
    }
}
