package algorithm;


import java.util.Scanner;

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
