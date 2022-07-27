package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class prime {
    //prime求最小生成树
    static int [][]graph;//图本身
    static int [][]tree;//最小生成树
    static int node;//结点数
    static int edge;//边数
    static boolean []vist;
    static boolean[]flag;
    static int start=4;
    //图的初始化
    public static void creat(){
        graph=new int[node+1][node+1];
        tree=new int[node+1][node+1];
        vist=new boolean[node+1];
        flag=new boolean[node+1];
        //图初始化为-1，表示两个结点之间没有联通
        for(int i=1;i<=node;i++){
            for(int j=1;j<=node;j++){
                graph[i][j]=-1;
                tree[i][j]=-1;
            }
        }
       graph[1][2]=graph[2][1]=2;
       graph[1][3]=graph[3][1]=4;
       graph[1][4]=graph[4][1]=1;
       graph[2][4]=graph[4][2]=3;
       graph[2][5]=graph[5][2]=10;
       graph[3][6]=graph[6][3]=5;
       graph[3][4]=graph[4][3]=2;
       graph[4][5]=graph[5][4]=7;
       graph[5][7]=graph[7][5]=6;
       graph[4][6]=graph[6][4]=8;
       graph[4][7]=graph[7][4]=4;
       graph[6][7]=graph[7][6]=1;
    }
    public static void MakeTree(){
        int sum=0;
        int h1=-1;
        int h2=-1;
        int min=100000;
        vist[start]=true;
        for(int k=1;k<node;k++){
            min=100000;
            for(int i=1;i<=node;i++){
                for(int j=1;j<=node;j++){
                    if(vist[i]==false)break;
                    else {
                        if(vist[j]==false&&graph[i][j]>0){
                           if(min>graph[i][j]){
                               h1=i;
                               h2=j;
                               min=graph[i][j];
                           }
                        }
                    }
                }
            }
            sum=sum+graph[h1][h2];
            System.out.println("收录定点为<"+h1+","+h2+">"+"权重"+graph[h1][h2]);
            tree[h1][h2]=graph[h1][h2];
            vist[h2]=true;
        }
        System.out.println("总权等于:"+sum);
    }
    public static void dfs(int v){
        Queue <Integer>queue=new LinkedList<>();
        queue.add(v);
        while(!queue.isEmpty()){
            v=queue.poll();
            System.out.println(v);
            for(int i=1;i<=node;i++){
                if(tree[v][i]>0&&flag[i]==false){
                    flag[i]=true;
                    queue.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入结点数和边数");
        node= 7;
        edge= 12;
        creat();
        MakeTree();
        //遍历树
        dfs(start);
    }
}
