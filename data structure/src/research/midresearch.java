package research;
//二分查找递归版
public class midresearch {
    public static int find(int[]a,int n,int left,int right){
        if(left>right)return -1;
        int mid=(left+right);
        int midvalue=a[mid];
        if(n>midvalue)return find(a,n,mid+1,right);
        if(n<midvalue)return find(a,n,left,mid-1);
        else return mid;
    }
    public static void main(String[] args) {
        int []a={1,33,55,66,77,88,99};
        System.out.println(find(a,54,0,a.length-1));
    }
}
