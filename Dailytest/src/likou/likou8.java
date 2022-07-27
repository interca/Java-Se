package likou;

import java.util.ArrayList;
import java.util.List;

public class likou8 {
    public void find(int []nums,int []help,List<List<Integer>>p1,List<Integer>p2,int n){

        int i,j;
        if(p2.size()==nums.length){
            p1.add(p2);
        }else if(p2.size()<nums.length){
            //System.out.println(p2.size());
            for(j=0;j<nums.length;j++){
                List<Integer>help2=new ArrayList<>();
                    for(int w=0;w<p2.size();w++){
                        //System.out.println(p2.size());
                        help2.add(p2.get(w));
                    }
                //System.out.println(1);
                    if(help[j]==0){
                        if(p2.size()<nums.length)p2.add(nums[j]);
                        help[j]=1;
                        find(nums,help,p1,p2,n+1);
                        help[j]=0;
                        p2=help2;
                    }
                }
        }

    }

    public static void main(String[] args) {
       int []a={1,2,3};
        try {
            for(int i=0;i<=3;i++){
                if(i==3){
                    throw new RuntimeException("越界");
                }
                System.out.println(a[i]);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("nihao");
    }
}
class string1{
    public static void main(String[] args) {
        String s="race a car";
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++) {
            if (s.charAt(i)>=0&&s.charAt(i)<=127) {
                str = str + s.charAt(i) + "";
            }
        }
        str=str.toLowerCase();
        System.out.println(str);
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("false");
            }
        }
    }
}