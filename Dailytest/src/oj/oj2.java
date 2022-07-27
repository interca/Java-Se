package oj;


import java.util.Scanner;
public class oj2 {
    public static void main(String[] args) {

        //动态规划
        int q=20211114;
        Scanner in=new Scanner(System.in);
        long n= in.nextLong();
        int k= in.nextInt();
        long[]dp=new long[Math.toIntExact(n)];
        if(k==1) System.out.println(1);
        else {
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                long sum = 0;
                for (int j = i; j >= i - k && j >= 0; j--) {
                    sum = (sum + dp[j]) % q;

                }
                dp[i] = sum;
            }
           System.out.println(dp[Math.toIntExact(n)]);
        }
    }
}
class oj5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=10;
        int sum;
        int min=0;
        int count=1;
        for(int i=0;i<n;i++){
             sum=0;
            for(int j=0;j<5;j++){
                int a=in.nextInt();
                sum+=a;
            }
            if(i==0)min=sum;
            else {
                if(sum>min)count++;
            }
        }
    }
}
