package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class likou2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> p = new HashMap<>();
    }
}
class sort implements Comparator<Map.Entry<Integer,Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o1.getValue()-o2.getValue();
    }
}
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int []num=new int[1001];
        for(int []a:trips){
            num[a[1]]+=a[0];
            num[a[2]]-=a[0];
        }
        if(num[0]>capacity)return false;
        for(int i=1;i<1001;i++){
            num[i]=num[i-1]+num[i];
            if(num[i]>capacity)return false;
        }
        return true;
    }
}

 class Main1{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int [][]num=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j]=in.nextInt();
            }
        }
        int  sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(num[i][j]!=0){
                    sum++;
                    dfs(num,i,j);
                }
            }
        }
        System.out.println(sum);
    }
    public static void dfs(int [][]num,int i,int j){
        if(i>=num.length||j>=num[0].length||i<0||j<0||num[i][j]==0)return ;
        num[i][j]=0;
        dfs(num,i+1,j);
        dfs(num,i,j+1);
    }
}

