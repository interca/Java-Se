package Graph;

import java.util.Scanner;

public class graph1 {
    //图
    static int[][]graph;
    static int edge=0;
    //图边的插入
    static void insert(int i,int j,int weight){
          graph[i][j]=weight;
          graph[j][i]=weight;
    }

    //打印矩阵
    static void print(){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
      int n;
        Scanner in=new Scanner(System.in);
      System.out.println("输入顶点数");
      n=in.nextInt();
      graph=new int[n][n];
        System.out.println("输入边数");
        edge= in.nextInt();
        for(int i=0;i<edge;i++){
            System.out.println("输入顶点和权重");
            insert(in.nextInt(), in.nextInt(), in.nextInt());
        }
        print();
    }
}
