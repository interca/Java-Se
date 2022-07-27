package Sort;

import java.util.Arrays;

//快速排序第二种方法，取第一，最后，中间三个数最大的元素做主元
public class quicksort2 {
    public static void sort(int[]a,int left,int right){
        int poilt=findpilt(a,left,right);
        int i=left;
        int j=right-1;
        System.out.println("i="+i+",j="+j);
        while(true){
            while(a[i]<poilt){
                i++;
            }
            while(a[j]>poilt){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }else break;
        }

        int temp=a[i];
        a[i]=a[right-1];
        a[right-1]=temp;
        if(left<i-1)sort (a,left,i-1);
        if(right>i+1)sort(a,i+1,right);
    }
    //找主元
    public static int findpilt(int[]a,int left,int right){

        int temp;
        int mid=(left+right)/2;
        if(a[left]>a[mid]){
            temp=a[left];
            a[left]=a[mid];
            a[mid]=temp;
        }
        if(a[left]>a[right]){
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        if(a[mid]>a[right]){
            temp=a[right];
            a[right]=a[mid];
            a[mid]=temp;
        }
        temp=a[right-1];
        a[right-1]=a[mid];
        a[mid]=temp;
        return a[right-1];
    }
    public static void main(String[] args) {
        int []a={2,1,-5,-555};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
