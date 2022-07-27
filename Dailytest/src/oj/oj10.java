package oj;

import java.util.Scanner;

public class oj10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long []dp=new long[n];
        long sum;
        int pre=0;
        int last=0;
        long max=0;
        while(n!=0){
            dp=new long[n];
            for(int i=0;i<n;i++)dp[i]= in.nextLong();
            sum=0;
            max=-1;
            int left=0;
            pre=0;
            last=0;
            for(int i=0;i<n;i++){
                sum=sum+dp[i];
                if(sum>max){
                    max=sum;
                    pre=i;
                    last=left;
                }else {
                    left=i+1;
                    sum=0;
                }
            }
            if(max<0){
                System.out.println(0+" "+dp[0]+" "+dp[n-1]);
            }
            else {
                System.out.print(max + " ");
                System.out.print(dp[pre] + " ");
                System.out.println(dp[last]);
            }
            n= in.nextInt();
        }

    }
}

class oj11{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long []dp=new long[n];
        long []a=new long[n];
        long sum;
        int pre=0;
        int last=0;
        long max=0;
        while(n!=0){
            dp=new long[n];
            a=new long[n];
            for(int i=0;i<n;i++)a[i]= in.nextLong();
            dp[0]=a[0];
            max=dp[0];
            pre=0;
            last=0;
            for(int i=1;i<n;i++){
                if(dp[i-1]+a[i]>a[i]){
                    dp[i]=dp[i-1]+a[i];
                    if(max<dp[i]){
                        max=dp[i];
                        last=i;
                    }
                }else {
                    dp[i]=a[i];
                    if(max<dp[i]){
                        max=dp[i];
                       pre=i;
                    }
                }

            }
            if(max<0){
                System.out.println(0+" "+a[0]+" "+a[n-1]);
            }
            else {
                System.out.print(max + " ");
                System.out.print(a[pre] + " ");
                System.out.println(a[last]);
            }
            n= in.nextInt();
        }
    }
}
