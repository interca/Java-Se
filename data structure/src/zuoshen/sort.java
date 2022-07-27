package zuoshen;

import java.util.Arrays;

//归并排序->左神
public class sort {
    //排序算法
    public static void process(int []a,int left,int right){
        if(left==right){
            return;
        }
        int mid=(left+right)/2;
        //现将中点两边排序
        process(a,left,mid);
        process(a,mid+1,right);
        //两边排好序后进行归并
       sort(a,left,right,mid);

    }

    public  static void sort(int []a,int left,int right,int mid){
        System.out.println(left+" "+right+" "+mid);
       int []help=new int[right-left+1];//创建一个辅助数组
        int i=0;
        //左侧left到Mid,右侧是Mid+1到right;
        int p1=left;
        int p2=mid+1;
        while(p1<=mid&&p2<=right){
            if(a[p1]<=a[p2]){
                help[i++]=a[p1++];
            }else{
                help[i++]=a[p2++];
            }
        }

        //当左边有剩余的时候
        while(p1<=mid){
            help[i++]=a[p1++];
        }
        while(p2<=right){
            help[i++]=a[p2++];
        }
        for(i=0;i<help.length;i++){
            a[left+i]=help[i];
        }
    }
    public static void main(String[] args) {
        int []a={4,5,6,8,1,0,-1,2,99,45,33,22};
        System.out.println(Arrays.toString(a));
        process(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
