package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    //广度优先搜索
    static int [][]graph;
    //判断结点是否被访问
    static boolean []vist;
    static int node;
    static int edge;

    //遍历
    public static void bfs(int i){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(i);
        while(!queue.isEmpty()){
            i=queue.poll();
            System.out.println(i);
            vist[i]=true;
            for(int j=0;j< graph.length;j++){
                if(graph[i][j]>0&&vist[j]==false){
                    queue.add(j);
                }
            }
        }
    }
    public static void insert(int i,int j){
        graph[i][j]=1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入结点数和边数");
        node= in.nextInt();
        edge= in.nextInt();
        graph=new int[node][node];
        vist=new boolean[node];
        for(int i=0;i<edge;i++){
            System.out.println("输入链接的边");
            insert(in.nextInt(), in.nextInt());
        }
        for(int i=0;i<node;i++){
            if(vist[i]==false){
                vist[i]=true;
                bfs(i);
            }
        }
    }
}
