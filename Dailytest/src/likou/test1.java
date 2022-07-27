package likou;

import java.util.Arrays;

public class test1 {
    public void change(int []a){
        a[0]=1;
        System.out.println(Arrays.toString(a));
        find(a);
    }
    public void find(int []a){
        a[1]=2;
        System.out.println(Arrays.toString(a));
        int []b=new int [10];
        a=b;
        System.out.println("change"+Arrays.toString(a));
    }
    public static void main(String[] args) {
        int []a=new int[10];
        System.out.println(Arrays.toString(a));
        test1 p=new test1();
        p.change(a);
        System.out.println(Arrays.toString(a));
    }
}
class test2{
    public static void main(String[] args) {
        int []nums={5,4,3,2,1};
        int []a=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            int imprise=0;
            int index=i+1;
            if(nums[i]>=max){
                a[i]=-1;
            }
            else{
                for(int j=index;j<nums.length;j++){
                    if(nums[j]>nums[i]){
                        a[i]=nums[j];
                        imprise=1;
                    }
                }
                if(imprise==0){
                    System.out.println(i);
                    for(int j=0;j<=i;j++){
                        System.out.println("num[j]="+nums[j]+",num[i]="+nums[i]);
                        if(nums[j]>nums[i]){
                            a[i]=nums[j];
                            break;
                        }
                    }
                }
            }
        }

    }
}