package oj;

import java.util.Scanner;

public class oj7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n= in.nextInt();
        String[]month={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        int index=0;
        for(int i=1;i<month.length;i++){
            if(month[i].equals(s)){
                index=i;
                break;
            }
        }
        int m=(index+n);
        if(m>12)m=m%12;
        System.out.println(month[m]);
    }
}

