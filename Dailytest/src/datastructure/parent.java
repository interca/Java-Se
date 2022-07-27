package datastructure;


import java.util.Scanner;

public class parent {
   protected int age=12;

}
class son extends parent {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //物品
        int n=in.nextInt();
        //背包容量
        int m=in.nextInt();
        int [][]dp=new int[n+1][m+1];
        int []weight=new int[n];
        int []price=new int[n];
        for(int i=0;i<n;i++){
            weight[i]= in.nextInt();
            price[i]= in.nextInt();
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(weight[i-1]>j)dp[i][j]=dp[i-1][j];
                else {
                    dp[i][j]=Math.max(dp[i-1][j],price[i-1]+dp[i-1][j-weight[i-1]]);
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }

}
