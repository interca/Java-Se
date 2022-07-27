package likou;

import java.util.*;
public class Main{
    public static void main(String[]arg){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int x=in.nextInt();
        int y=in.nextInt();
        int [][]num=new int[n+1][m+1];
        if(x<=n&&y<=m)num[x][y]=1;
        int []help1={1,1,2,2,-2,-2,-1,-1};
        int []help2={2,-2,1,-1,-1,1,2,-2};
        for(int k=0;k<8;k++){
            int k1=x+help1[k];
            int k2=y+help2[k];
            if(k1<0||k2<0||k1>=n+1||k2>=m+1)continue;
            num[k1][k2]=1;
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        long [][]dp=new long[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(num[i][j]==1)dp[i][j]=0;
                else if(i==0&&j==0)dp[i][j]=1;
                else if(i==0)dp[i][j]=dp[i][j-1];
                else if(j==0)dp[i][j]=dp[i-1][j];
                else {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}