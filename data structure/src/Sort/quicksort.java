package Sort;

import java.util.Arrays;

//快速排序
public class quicksort {
    //排序主体
    public static void sort(int[]a,int left,int right){
        int l=left;
        int r=right;
        int mid=a[(left+right)/2];//取基准

        //把比下标为mid大的数放右边，小的放左边
        while(l<r) {
            while (a[l] < mid) {
                l++;
            }
            while (a[r] > mid) {
                r--;
            }
            if (l >= r) {//说明Mid左边都是小于a[mid]，右边全是大于
                break;
            }
            //否则交换
            int temp = a[r];
            a[r] = a[l];
            a[l] = temp;
            if (a[l] == mid) {
                r--;
            }
            if (a[r] == mid) {
                l++;
            }
        }
         if(l==r){
              r--;
              l++;
          }
          //开始递归
            if(left<r){
                sort(a,left,r);
            }
            if(right>l){
                sort(a,l,right);
            }
        }
    public static void main(String[] args) {
        int []a={4444,3,12,53,10,2,13,65,86,32,12,1,5,6,7};
         int n=a.length;
       sort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
