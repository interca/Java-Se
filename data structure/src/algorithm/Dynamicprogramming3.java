package algorithm;

public class Dynamicprogramming3 {
    //背包问题
    public static void main(String[] args) {
        int []weight={1,4,3};//物品重量
        int []price={1500,3000,2000};//物品价值
        int m=4;//背包容量
        int n=weight.length;
        int [][]dp=new int[n+1][m+1];
        //dp[i][j]表示前i个装入容量为J的背包最大价值
        int [][]path=new int[n+1][m+1];//记录怎么放置物品
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                //当前物品比剩余容量大，那就取上一次的背包情况
                if(weight[i-1]>j)dp[i][j]=dp[i-1][j];
                else {
                    //dp[i][j]=Math.max(price[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
                    //记录商品在背包中存放的情况
                    if(price[i-1]+dp[i-1][j-weight[i-1]]>dp[i-1][j]){
                        dp[i][j]=price[i-1]+dp[i-1][j-weight[i-1]];
                        path[i][j]=1;
                    }else {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        System.out.println("总容量为"+dp[n][m]);
         int i=path.length-1;
         int j=path[0].length-1;
         while(i>=0&&j>=0){
             if(path[i][j]==1) {
                 System.out.println("放了第" + i + "个物品");
                 j = j - weight[i - 1];
             }
             i--;
         }
    }
}
