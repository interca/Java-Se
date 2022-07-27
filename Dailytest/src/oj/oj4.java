package oj;

import java.util.Scanner;

public class oj4 {
    static int sum=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        char a='a';
        for(int i=0;i<26;i++){
            dfs(n,a,1);
            a++;
        }
        System.out.println(sum);
    }
   public static void dfs(long n1,char a,int n){
        if(n==n1){
            sum++;
            sum=sum%20211121;
            return ;
        }
        for(char i=a;i<='z';i++){
            dfs(n1,i,n+1);
        }
   }
}
