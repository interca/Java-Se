package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class road {
    //计算从点二到其他点的最短路径
    static int[][]graph;
    static int node;//结点数
    static int edge;//边数
    static int []path;
    static int dist[];
    static int flag;

    //图的初始化
    public static void creat(){
        Scanner in=new Scanner(System.in);
        for(int i=0;i<node;i++){
            dist[i]=-1;
        }
        dist[2]=0;
        path[2]=-1;
        System.out.println("输入链接的边");
        for(int i=0;i<edge;i++){
            graph[in.nextInt()][in.nextInt()]=1;
        }
    }

    public static void main(String[] args) {
        System.out.println("输入结点数量和边数量");
        Scanner in=new Scanner(System.in);
        node= in.nextInt();
        edge=in.nextInt();
        graph=new int[node][node];
        path=new int[node];
        dist=new int[node];
        creat();
        sort(2);
        flag=2;
        print();
    }

    public static void print(){
        Scanner in=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        while(true){
            System.out.println("输入结点");
            int target=in.nextInt();
            System.out.println(dist[target]);
            while(target!=-1){
                stack.add(target);
                target=path[target];
            }
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }
    }

    //单源最短路基本算法
    public static  void sort(int n){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(n);
        while(!queue.isEmpty()){
            int v=queue.poll();
            for(int i=0;i<node;i++){
                if(graph[v][i]==1&&dist[i]==-1){
                    dist[i]=dist[v]+1;
                    path[i]=v;
                    queue.add(i);
                }
            }
        }
    }
}
