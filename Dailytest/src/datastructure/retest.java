package datastructure;

import java.util.Arrays;

public class retest {
    public static void main(String[] args) {
        int []a={55,6,3,12,-11,22,33,-22222};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int []a){
        int min;
        var n=a.length;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j])min=j;
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
}
//冒泡
class sort2{
    public static void main(String[] args) {
        int []a={55,6,3,12,-11,22,33,-22222};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a){
        var n=a.length;
        for(int i=0;i<n;i++){
            var flag=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    flag=true;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(flag==false)break;
        }
    }
}
//插入排序
class  sort3{
    public static void main(String[] args) {
        int []a={55,6,3,12,-11,22,33,-22222};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int []a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int flag=i;
            while(flag-1>=0&&a[flag-1]>temp){
                a[flag]=a[flag-1];
                flag--;
            }
            a[flag]=temp;
        }
    }
}
//希尔排序
class sort4{
    public static void main(String[] args) {
        int []a={55,6,3,12,-11,22,33,-22222};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a){
        int n=a.length/2;
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
    }
}
//归并排序
class sort5{
    public static void main(String[] args) {
        int []a={55,6,3,12,-11,22,33,-22222};
        mage(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void mage(int []a,int left,int right){
        if(left>=right)return;
        int mid=(left+right)/2;
        mage(a,left,mid);
        mage(a,mid+1,right);
        sort(a,left,right,mid);
    }
    public static void sort(int []a,int left,int right,int mid){
        int []help=new int[right-left+1];
        int l=left;
        int r=mid+1;
        int index=0;
        while(l<=mid&&r<=right){
            if(a[l]<a[r]){
                help[index++]=a[l++];
            }else{
                help[index++]=a[r++];
            }
        }
        while(l<=mid){
            help[index++]=a[l++];
        }
        while(r<=right){
            help[index++]=a[r++];
        }
        for(int i=0;i<help.length;i++){
            a[left+i]=help[i];
        }
    }
}
//基数排序
class sort6{
    public static void main(String[] args) {
        int []a={55,6,3,12,11,22,33,22222,2,1,6,8,155};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int []a){
       int n=a.length;
       //十个桶，每个桶为数组长度
       int [][]bin=new int[10][a.length];
       int []count=new int[10];//记录每个桶有多少个元素
        int max=a[0];
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        //最大数的长度
        int len=(max+"").length();
        int index=1;
        for(int i=0;i<len;i++,index=index*10){
            for(int j=0;j<a.length;j++){
                //末尾
                int tail=a[j]/index%10;
                bin[tail][count[tail]++]=a[j];
            }
            int index2=0;
            for(int k=0;k<count.length;k++){
                if(count[k]>0){
                   for(int w=0;w<count[k];w++){
                       a[index2++]=bin[k][w];
                   }
                }
                count[k]=0;
            }
        }
    }
}
class sort7{
    public static void main(String[] args) {
        int[] a = {55, 6, 3, 12, -11, 22, 33, -22222};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
    public static  void sort(int []a,int left,int right){
       int l=left;
       int r=right;
       int mid=(left+right)/2;
       while(left<=right){
           while(a[left]<a[mid])left++;
           while(a[right]>a[mid])right--;
           if(left>=right)break;
           int temp=a[left];
           a[left]=a[right];
           a[right]=temp;
           if(a[left]==a[mid])left++;
           if(a[right]==a[mid])right--;
       }
       if(right==left){
           left++;
           right--;
       }
       if(left<r) sort(a,left,r);
       if(right>l) sort(a,l,right);
    }
}