package algorithm;

public class Dynamicprogramming {
    //动态规划
    public static void main(String[] args) {
        int []a={1,2,4,1,7,8,3};
        int n=a.length;
        int []dp=new int[n];
        dp[0]=a[0];
        dp[1]=Math.max(a[0],a[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+a[i]);
        }
        System.out.println(dp[n-1]);
    }
}
