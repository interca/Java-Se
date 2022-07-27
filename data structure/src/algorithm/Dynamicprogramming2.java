package algorithm;

public class Dynamicprogramming2 {
    //动态规划寻找合适的数
    public static void main(String[] args) {
        int []a={3,34,4,12,5,2};
        int s=9;
        int m=a.length;
        boolean [][]num=new  boolean[m][s+1];
        for(int i=0;i<m;i++){
            num[i][0]=true;
        }
        for(int j=0;j<=s;j++){
            num[0][j]=false;
        }
        num[0][a[0]]=true;

        for(int i=1;i<m;i++){
            for(int j=1;j<=s;j++){
                if(a[i]>j)num[i][j]=num[i-1][j];
                else{
                    boolean str1=num[i-1][j-a[i]];
                    boolean str2=num[i-1][j];
                    num[i][j]=(str1==true||str2==true);
                }
            }
        }
        System.out.println(num[m-1][s]);
    }
}
