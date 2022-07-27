package oj;

import java.util.Scanner;

public class oj9 {
    public static void main(String[] args) {
        int []help1={-2,-1,1,2,-2,-1,1,2};
        int []help2={1,2,2,1,-1,-2,-2,-1};
        Scanner in=new Scanner(System.in);
        //b的坐标
        int x1= in.nextInt();
        int y1= in.nextInt();
        int x2= in.nextInt();
        int y2= in.nextInt();
        long [][]num=new long[x1+1][y1+1];
        num[x2][y2]=-1;
        for(int i=0;i<8;i++){
            int k1=help1[i]+x2;
            int k2=help2[i]+y2;
            if(k1<0||k2<0||k1>x1||k2>y1)continue;
            num[k1][k2]=-1;
        }
        int [][]dp=new int[x1+1][y1+1];

        for(int i=0;i<=x1;i++){
            for(int j=0;j<=y1;j++){
                if(num[i][j]==-1){
                    dp[i][j]=0;
                }
                else if(i==0&&j==0)dp[i][j]=1;
                else if(i==0)dp[i][j]=dp[i][j-1];
                else if(j==0)dp[i][j]=dp[i-1][j];
                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        System.out.println(dp[x1][y1]);
    }
}


 class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int t=in.nextInt();
        int max=0;
        for(int i=0;i<k;i++){
            int x1=in.nextInt();
            int y1=in.nextInt();
            int sum=0;
            for(int j=Math.max(1,x1-t);j<=Math.min(m,x1+t);j++){
                for(int w=Math.max(1,y1-t);w<=Math.min(n,y1+t);w++){
                    if((Math.sqrt((j-x1)*(j-x1)+(w-y1)*(w-y1)))<=t)sum++;
                }
                System.out.println(sum);
            }
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
