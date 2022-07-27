package oj;

import java.util.Scanner;

public class oj8 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Long l=in.nextLong();
        Long r= in.nextLong();
        Long k= in.nextLong();

        int count=0;
        long t=1;
        for(;;t=t*k){
            if(t>=l&&t<=r){
                System.out.print(t+" ");
                count++;
            }
            if(t>r)break;
        }
        if(count==0){
            System.out.println(-1);
        }
    }
}
