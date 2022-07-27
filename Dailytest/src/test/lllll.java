package test;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

public class lllll {
    @Test
    public void test()throws ParseException {
        SimpleDateFormat sim=new SimpleDateFormat();
        Date date=new Date();
        String str=sim.format(date);
        System.out.println(str);
    }

    public static void main(String[] args) {
        int x=1534236469;
        int n=x;
        x=Math.abs(x);
        if(x==0) System.out.println(0);
        while(x%10==0){
            x=x/10;
        }
        String s=x+"";
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        if(n<0)str="-"+str;
        System.out.println(str);
        //System.out.println(Integer.parseInt(str));
        System.out.println(Math.pow(2,31));
    }
}

class c{
    public static void main(String[] args) {
        int []nums1={4,7,9,7,6,7};
        int []nums2={5,0,0,6,1,6,2,2,4};
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int k:nums1){
            set1.add(k);
        }
        System.out.println(set1);
        for(int k:nums2){
            System.out.println(k);
            System.out.println(set1.add(k));
            if(set1.add(k)==false){
                set2.add(k);
            }
        }
        System.out.println(set2);
        int size=set2.size();
        int []num=new int[size];
        int index=0;
        for(int k:set2){
            num[index++]=k;
        }
        System.out.println(Arrays.toString(num));
    }

}
