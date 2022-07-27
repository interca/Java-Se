package datastructure;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
      //冒泡
        int[]a={5,6,7,1,3,5,-100,4};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
class test11{
    public static void main(String[] args) {
      //选择
        int []a={100,2,4,5,-100,55,7,12,32};
        int temp;
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
class test12{
    public static void main(String[] args) {
        //插入
        int []a={4,5,6,8,-11,-333,33,66};
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int index=i;
            while(index-1>=0&&a[index-1]>temp){
                a[index]=a[index-1];
                index--;
            }
            a[index]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
class test13{
    public static void main(String[] args) {
        //希尔排序
        int []a={200,-11,2,3,7,8,11,1,0,-100,9};
        int n=a.length;

        for(;n>0;n=n/2){
            for(int i=n;i<a.length;i++){
                int temp=a[i];
                int index=i;
                while(index-n>=0&&a[index-n]>temp){
                        a[index]=a[index-n];
                        index=index-n;
                }
                a[index]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
class test14{
    public static void sort(int []a,int left,int right){
        int l=left;
        int r=right;
        int mid=a[(l+r)/2];
        while(l<r){
            while(a[l]<mid){
               l++;
            }
            while(a[r]>mid){
                r--;
            }
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            if(a[l]==mid){
                r--;
            }
            if(a[r]==mid){
                l++;
            }
        }
        if(l==r){
            l++;
            r--;
        }
        if(left<r)
        sort(a,left,r);
        if(right>r)
        sort(a,l,right);
    }
    public static void main(String[] args) {
        //快速排序
        int []a={99,45,33,-11,1,6,9,2,7,0};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
class test15{
    public static void main(String[] args) {
        //插入排序练习
        int []a={99,45,333,-11,1,6,9,2,7,0};
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int index=i;
            while(index-1>=0&&a[index-1]>temp){
                a[index]=a[index-1];
                index--;
            }
            a[index]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
class test16{
    //希尔排序
    public static void main(String[] args) {
        int []a={6,5,4444,-1,-222,33,4,5,6,7,8,99};
        int n=a.length;
        for(;n>0;n=n/2){
            for(int i=n;i<a.length;i++){
                int temp=a[i];
                int index=i-n;
                while(index-n>=0&&a[index]>temp){
                    a[index]=a[index-n];
                    index=index-n;
                }
                a[index]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
class test17{
    public static void process(int []a,int left,int right){
        if(left==right)return;
        int mid=(left+right)/2;
        process(a,left,mid);
        process(a,mid+1,right);
        shell(a,left,right,mid);
    }



    public static void   shell(int []a, int left, int right, int mid){
        int []help=new int[right-left+1];
        int p1=left;
        int p2=mid+1;
        int index=0;
        while(p1<=mid&&p2<=right){
            if(a[p1]<a[p2]){
                help[index++]=a[p1++];
            }else{
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
            a[left+i]=help[i];
        }
    }
    public static void main(String[] args) {
        //归并排序
        int []a={4,6,7,-1,777,43,65,7,3,2,8,0,1};
        process(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
class li{
    public static void main(String[] args) {

    }
}
//桶排序
class binsort{
    public static void main(String[] args) {
        int []a={99,22,33,1,5,6,12,3444,2,44,33,1,5,78,345};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a){
        //用二维数组定义桶
        int [][]bin=new int[10][a.length];
        //计算每个桶数字的数量
        int []count=new int[10];
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max)max=a[i];
        }
        String max2=max+"";
        int lenmax= max2.length();
        System.out.println(lenmax);
        for(int i=0,n=1;i<lenmax;n=n*10,i++){
            for(int j=0;j<a.length;j++){
                int index=a[j]/n%10;//末尾数字
                bin[index][count[index]++]=a[j];
            }
            int index=0;
            for(int j=0;j<10;j++){
                if(count[j]>0){
                    for(int w=0;w<count[j];w++){
                        a[index++]=bin[j][w];
                    }
                }
                count[j]=0;
            }
        }
    }

}
class sort100{
    public static void main(String[] args) {
        int []num={4444,3,12,53,10,2,13,65,86,32,12,1,5,6,7};
         mig(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
    public static void mig(int []num,int left,int right){
      if(left==right)return;
      int mid=(left+right)/2;
      mig(num,0,mid);
      mig(num,mid+1,right);
      sort(num,left,right,mid);
    }
    public  static void sort(int[]num,int left,int right,int mid){
        int l=left;
        int r=mid+1;
        int index=0;
        int []help=new int[right-left+1];
        while(l<=mid&&r<=right){
            if(num[l]<num[r]){
                help[index++]=num[l++];
            }else {
                help[index++]=num[r++];
            }
        }
        while(l<=mid){
            help[index++]=num[l++];
        }
        while(r<=right){
            help[index++]=num[r++];
        }
        for(int i=0;i<help.length;i++){
            num[i+left]=help[i];
        }
    }
}
//快速排序
class sort101{
    public static void main(String[] args) {
        int []num={4444,3,12,53,10,2,13,65,86,32,12,1,5,6,7};
        sort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
    public static void sort(int []num,int left,int right){
        int l=left;
        int r=right;
        int mid=num[(left+right)/2];
        while(l<r){
            while(num[l]<mid)l++;
            while(num[r]>mid)r--;
            if(l>=r)break;
            int temp=num[r];
            num[r]=num[l];
            num[l]=temp;
            if(num[l]==mid)r--;
            if(num[r]==mid)l++;
        }
        if(l==r){
            r--;
            l++;
        }
        if(left<r)sort(num,left,r);
        if(l<right)sort(num,l,right);
    }
}