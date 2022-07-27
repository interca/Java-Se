package datastructure;

import java.util.*;

public class Graph {
    //堆实现
    static int max;//堆容量
    static int size=0;//堆当前大小
    static int []heap;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入容量堆大小");
        max= in.nextInt();
        heap=new int[max+1];
        creat();
        int number;
        System.out.println("输入初始堆的数量");
        number= in.nextInt();
        for(int i=0;i<number;i++){
            insert(in.nextInt());
        }
        out:
        while(true){
            int choice;
            System.out.println("输入选择：1-插入，2-删除，3-打印，4-退出");
            choice= in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("输入加入数");
                    insert(in.nextInt());break;
                case 2:
                    System.out.println(delect());
                    break;
                case 3:
                    pirntheap();
                    break;
                case 4:
                    break out;
            }
        }
    }
    //设立哨兵
    static public void creat(){
        heap[0]=100000;
    }
    //堆插入
    static void insert(int number){
        if(size==max){
            System.out.println("堆已经满了");
            return ;
        }
        int i=++size;
        for(;heap[i/2]<number;i=i/2){
            heap[i]=heap[i/2];
        }
        heap[i]=number;
    }
    //堆的删除
    static int delect(){
        if(size==0){
            System.out.println("堆空");
            return -100000000;
        }
        int returnnumber=heap[1];//取出最大值
        int temp=heap[size--];
        int parent=1;
        int child;
        for(;parent*2<=size;parent=child){
            child=parent*2;
            if(parent*2!=size&&heap[parent*2]<heap[parent*2+1]){
                child++;
            }
            if(heap[child]>temp){
                heap[parent]=heap[child];
            }else{
                break;
            }
        }
        heap[parent]=temp;
        return returnnumber;
    }
    //堆的打印
    static void pirntheap(){
        for(int i=1;i<=size;i++){
            System.out.println(heap[i]+" ");
        }
    }
}
//并查集
class node{
    public int date;
    public int parent;

    public node(int date, int parent) {
        this.date = date;
        this.parent = parent;
    }
}
class inbin{
    //并查集
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //寻找父节点
         node[]p=new node[10];
         p[0]=new node(1,-1);
         p[1]=new node(2,0);
         p[2]=new node(3,-1);
         p[3]=new node(4,0);
         p[4]=new node(5,2);
         p[5]=new node(6,-1);
         p[6]=new node(7,0);
         p[7]=new node(8,2);
         p[8]=new node(9,5);
         p[9]=new node(10,5);
        while(true){
            System.out.println("输入要查找的数");
            int n=in.nextInt();
            int number=findparet(n,p);
            if(number==-1) System.out.println("没有这个数");
            else System.out.println("父亲结点是："+p[number].date);
        }
    }
    public static int findparet(int n,node[]p){
       int i=0;
       //找到这个数的下标
       for(;i<p.length&&p[i].date!=n;i++){
       }
       if(i>=p.length)return -1;
       for(;p[i].parent>=0;i=p[i].parent){

       }
       return  i;
    }

}
class road{
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
        Stack<Integer>stack=new Stack<>();
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
        Queue<Integer>queue=new LinkedList<>();
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

class dijkstra{
    //有权图单源最短路
    static int[][]graph;
    static int node;//结点数
    static int edge;//边数
    static int []path;
    static int dist[];
    static int flag;
    static HashSet<Integer>set=new HashSet<>();//判断是否被收录
    //初始化
    public static void creat(){
        for(int i=1;i<node;i++){
            dist[i]=1000;
            path[i]=-1;
        }
        dist[flag]=0;
        graph[1][2]=2;
        graph[1][4]=1;
        graph[2][4]=3;
        graph[2][5]=10;
        graph[3][1]=4;
        graph[3][6]=5;
        graph[4][3]=2;
        graph[4][6]=8;
        graph[4][7]=4;
        graph[4][5]=2;
        graph[5][7]=6;
        graph[6][7]=1;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入结点和边");
        node= in.nextInt();
        edge= in.nextInt();
        graph=new int[node][node];
        path=new int[node];
        dist=new int[node];
        flag=1;
        creat();
        Dijkstra();
        printpath();
    }

    //具体算法
    public static void Dijkstra(){
        while(true){
            int v=-1;
            int min=100000;
            //对于没有被收录进去的结点，找出dist最小的
            for(int i=1;i<node;i++){
                if(set.contains(i)==false){
                    if(dist[i]<min){
                        min=dist[i];
                        v=i;
                    }
                }
            }

            //已经全部收录了
            if(min==100000)break;
            set.add(v);
            for(int i=1;i<node;i++){
                if(graph[v][i]>0&&set.contains(i)==false){
                    if(dist[v]+graph[v][i]<dist[i]){
                        dist[i]=dist[v]+graph[v][i];
                        path[i]=v;
                    }
                }
            }
        }
    }


    public static void printpath(){
        Scanner in=new Scanner(System.in);
        Stack<Integer>queue=new Stack<>();
        while(true){
            System.out.println("输入结点");
            int n;
            n= in.nextInt();
            System.out.println("最短路径为"+dist[n]);
            while(n!=-1){
                queue.add(n);
                n=path[n];
            }
            while(!queue.isEmpty()){
                System.out.print(queue.pop()+" ");
            }
        }
    }
}
class floyd {
    static int [][]graph;
    static int node;
    static int edge;
    static int[][]path;

    public static void insert(){
        for(int i=1;i<node;i++){
            for(int j=1;j<node;j++){
                graph[i][j]=1000;
                path[i][j]=-1;
            }
        }
        graph[1][2]=2;
        graph[1][4]=1;
        graph[2][4]=3;
        graph[2][5]=10;
        graph[3][1]=4;
        graph[3][6]=5;
        graph[4][3]=2;
        graph[4][6]=8;
        graph[4][7]=4;
        graph[4][5]=2;
        graph[5][7]=6;
        graph[7][6]=1;
    }

   public static void printpath(){
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("输入两个结点");
            int n1= in.nextInt();
            int n2= in.nextInt();
            if(graph[n1][n2]==1000) System.out.println("两点之间无通路");
            else{
                System.out.println("路径长度为"+graph[n1][n2]);
                System.out.print("最短路径为："+n1+" ");
                dfs(n1,n2);
                System.out.print(n2);
            }
        }
   }
    public static void dfs(int i,int j){
        if(path[i][j]>=0){
            dfs(i,path[i][j]);
            System.out.print(path[i][j]+" ");
            dfs(path[i][j],j);
        }
    }
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("输入定点和边");
        node= in.nextInt();
        edge= in.nextInt();
        graph=new int[node][node];
        path=new int[node][node];
        insert();
        flyed();
        printpath();
    }

    //具体算法floyed
    public static void flyed(){
        for(int k=1;k<node;k++){
            for(int i=1;i<node;i++){
                for(int j=1;j<node;j++){
                    if(graph[i][k]+graph[k][j]<graph[i][j]){
                        graph[i][j]=graph[i][k]+graph[k][j];
                        path[i][j]=k;
                    }
                }
            }
        }
    }
}
