package algorithm;

import java.util.*;

public class Kruskal {
    static int[][]graph;
    static  int[][]tree;
    static  int node;
    static  int edge;
    static boolean[]flag;
    static int start=1;
    //把边加入里面，按从小到大排序
    static List<Edge> list=new ArrayList<>();
    //并查集
    static int[]num;
    //并查集主体
     static HashMap<Integer,Integer>map=new HashMap<>();
    //初始化
    public static void creat(){
        graph=new int[node+1][node+1];
        tree=new int[node+1][node+1];
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
        //把边加入集合
        for(int i=1;i<=node;i++){
            map.put(i,i);
            for(int j=1;j<=node;j++){
                if(graph[i][j]>0&&i<=j){
                    list.add(new Edge(i,j,graph[i][j]));
                }
            }
        }
        Collections.sort(list);
        //验证
       for(Edge k:list){
           System.out.println(k);
       }
        System.out.println(map);
    }
    public static void main(String[] args) {
        node= 7;
        edge= 12;
        creat();
        num=new int[node+1];
        Kruskal();
        dfs(start);
    }
    //算法本身
    public static void Kruskal(){
        int n=list.size();
        for(int i=0;i<n;i++){
            Edge p=list.get(0);
            list.remove(0);
            int k1=p.start;
            int k2=p.end;
            int weight=p.weight;
            //寻找根
            int root1=root(k1);
            int root2=root(k2);

            if(root1==root2)continue;
            else {
                map.put(root1,root2);
                tree[k1][k2]=tree[k2][k1]=weight;
            }
        }
    }
    //并查集
    public static int root(int i){
        while(map.get(i)!=i){
            i=map.get(i);
        }
        return i;
    }
    public static void dfs(int v){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(v);
        flag[v]=true;
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
}
//记录两点的边
class Edge implements Comparable<Edge>{
    public int start;
    public int end;
    public int weight;

    public Edge(int start, int end, int weight) {
        this.start = start;
        this.end = end;
       this.weight=weight;
    }

    @Override
    public String toString() {
       return start+"->"+end+",权重是"+weight;
    }

    //按权重大小排序
    @Override
    public int compareTo(Edge o) {
        return Double.compare(this.weight,o.weight);
    }
}