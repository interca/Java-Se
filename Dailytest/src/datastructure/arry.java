package datastructure;

import java.util.Scanner;

public class arry {
    static int count=0;
    //八皇后
    public static void main(String[] args) {
        Thread p=new Thread();
        Scanner in=new Scanner(System.in);
        System.out.println("输入n:");
        int n= in.nextInt();
        int [][]map=new int[n][n];
        dfs(map,0);
        System.out.println("个数是:"+count);
    }
    public static void  dfs(int[][]map,int n){
        if(n==map.length){
          print(map);
        }
        for(int i=0;i<map.length;i++){
           if(judge(map,n,i)==true) {
               map[n][i] = 1;
               dfs(map, n + 1);
               map[n][i] = 0;
           }
        }
    }
    public static boolean judge(int [][]map,int i,int j){
       for(int k=0;k<map.length;k++){
           for(int w=0;w<map.length;w++){
               if(map[k][w]==1){
                   if(w==j)return false;
                   if(Math.abs(i-k)==Math.abs(j-w))return false;
               }
           }
       }
        return true;
    }
    public static void print(int [][]map){
        System.out.println("------------------------------");
        count++;
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map.length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
        char c='\\';

    }
}
class p1{
    private int a=10;
    public void play(){
        System.out.println(a);
    }
}
class w extends p1{
    public void play(){
        System.out.println(1);
    }

}
