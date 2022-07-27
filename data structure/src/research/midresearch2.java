package research;

import java.util.ArrayList;
import java.util.List;

//一次找多个数,用二分查找
public class midresearch2 {
    public static List<Integer> find(int[]a,int n,int left,int right){
        if(left>right){
            List<Integer>list=new ArrayList<>();
            list.add(-1);
            return  list;
        }
        int mid=(left+right);
        int midvalue=a[mid];
        if(n>midvalue)return find(a,n,mid+1,right);
        if(n<midvalue)return find(a,n,left,mid-1);
        else{
            List<Integer>list=new ArrayList<>();
            int temp=mid-1;
            while(temp>0&&a[temp]==n){
                list.add(temp);
                temp--;
            }
            list.add(mid);
            temp=mid+1;
            while(temp<a.length&&a[temp]==n){
                list.add(temp);
                temp++;
            }
            return  list;
        }
    }

    public static void main(String[] args) {
        int []a={1,3,5,5,5,7,8,44,67,77,77,100};
        var b=find(a,13,0,a.length-1);
        System.out.println(b);
    }
}
