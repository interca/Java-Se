package Graph;

import java.util.Scanner;

public class DFS {
    //深度优先搜索DFS
    static int [][]graph;
    //判断结点是否被访问
    static boolean []vist;
    static int node;
    static int edge;

    public static void insert(int i,int j){
        graph[i][j]=1;
    }
    public static void dfs(int i){
        System.out.println(i+" ");
        for(int j=0;j<graph.length;j++){
            if(graph[i][j]>0&&vist[j]==false){
                vist[j]=true;
                dfs(j);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入结点和边数");
        node= in.nextInt();
        edge= in.nextInt();
        graph=new int[node][node];
        vist=new boolean[node];
        for(int i=0;i<edge;i++){
            System.out.println("输入边");
            insert(in.nextInt(), in.nextInt());
        }
        for(int i=0;i<node;i++){
             if(vist[i]==false){
                 vist[i]=true;
                 dfs(i);
             }
        }

    }
}
