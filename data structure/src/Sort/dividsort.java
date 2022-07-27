package Sort;

import java.util.Arrays;

//归并排序
public class dividsort {
    public static void mag(int []a,int left,int right){
        if(left==right)return;
        int mid=(left+right)/2;
        //向左递归
        mag(a,left,mid);
        //向右
        mag(a,mid+1,right);
        sort(a,left,right,mid);
    }
    //并的过程
    public static void sort(int []a,int left,int right,int mid){
        //左侧从left到Mid，右侧从Mid+1到right
        int p1=left;
        int p2=mid+1;
        int []help=new int[right-left+1];

        int index=0;
        while(p1<=mid&&p2<=right){
            if(a[p1]<=a[p2]){
                help[index++]=a[p1++];
            }else {
                help[index++]=a[p2++];
            }
        }

        while(p1<=mid){
            help[index++]=a[p1++];
        }
        while(p2<=right){
            help[index++]=a[p2++];
        }
        for(int i=0;i<help.length;i++){
            a[i+left]=help[i];
        }
    }
    public static void main(String[] args) {
        int []a={99,45,333,-11,1,6,9,2,7,0};
         mag(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
