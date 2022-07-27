package algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Dijkstra {
    //有权图单源最短路
    static int[][] graph;
    static int node;//结点数
    static int edge;//边数
    static int[] path;
    static int dist[];
    static int flag;
    static HashSet<Integer> set = new HashSet<>();//判断是否被收录

    //初始化
    public static void creat() {
        for (int i = 1; i < node; i++) {
            dist[i] = 1000;
            path[i] = -1;
        }
        dist[flag] = 0;
        graph[1][2] = 2;
        graph[1][4] = 1;
        graph[2][4] = 3;
        graph[2][5] = 10;
        graph[3][1] = 4;
        graph[3][6] = 5;
        graph[4][3] = 2;
        graph[4][6] = 8;
        graph[4][7] = 4;
        graph[4][5] = 2;
        graph[5][7] = 6;
        graph[6][7] = 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入结点和边");
        node = in.nextInt();
        edge = in.nextInt();
        graph = new int[node][node];
        path = new int[node];
        dist = new int[node];
        flag = 1;
        creat();
        Dijkstra();
        printpath();
    }

    //具体算法
    public static void Dijkstra() {
        while (true) {
            int v = -1;
            int min = 100000;
            //对于没有被收录进去的结点，找出dist最小的
            for (int i = 1; i < node; i++) {
                if (set.contains(i) == false) {
                    if (dist[i] < min) {
                        min = dist[i];
                        v = i;
                    }
                }
            }

            //已经全部收录了
            if (min == 100000) break;
            set.add(v);
            for (int i = 1; i < node; i++) {
                if (graph[v][i] > 0 && set.contains(i) == false) {
                    if (dist[v] + graph[v][i] < dist[i]) {
                        dist[i] = dist[v] + graph[v][i];
                        path[i] = v;
                    }
                }
            }
        }
    }

    public static void printpath() {
        Scanner in = new Scanner(System.in);
        Stack<Integer> queue = new Stack<>();
        while (true) {
            System.out.println("输入结点");
            int n;
            n = in.nextInt();
            System.out.println("最短路径为" + dist[n]);
            while (n != -1) {
                queue.add(n);
                n = path[n];
            }
            while (!queue.isEmpty()) {
                System.out.print(queue.pop() + " ");
            }
        }
    }
}