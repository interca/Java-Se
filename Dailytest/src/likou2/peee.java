package likou2;

import java.util.*;

public class peee {
    public static void main(String[] args) {
        String num="1210";
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
            int  w=num.charAt(i)-'0';
            if(map.get(w)==null){
                map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        var sum=0;
        for(int i=0;i<num.length();i++){
            int k=num.charAt(i)-'0';
            int w;
            if(map.get(i)==null)w=0;
            else w=map.get(i);
            if(w==k)sum++;
        }
    }
}
class Solution {
    public static void main(String[] args) {
        int [][]times = {{3,5,78},{2,1,1},{1,3,0},{4,3,59},{5,3,85},
                {5,2,22},{2,4,23},{1,4,43},{4,5,75},{5,1,15},{1,5,91},{4,1,16},
                {3,2,98},{3,4,22},{5,4,31},{1,2,0},{2,5,4},{4,2,51},{3,1,36},{2,3,59}};

        int n = 5, k = 5;
        Solution p=new Solution();
        p.networkDelayTime(times,n,2);
    }
    HashSet<Integer> set;
    public int networkDelayTime(int[][] times, int n, int k) {
        set=new HashSet<>();
        int [][]graph=new int[n+1][n+1];
        //建立图
        for(int i=0;i<times.length;i++){
            graph[times[i][0]][times[i][1]]=times[i][2];
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        int []dist=new int[n+1];
        for(int i=1;i<=n;i++){
            dist[i]=10000000;
        }
        dist[k]=0;
        Disjkstra(graph,dist);
        int max=-100;
        System.out.println(Arrays.toString(dist));
        for(int i=1;i<=n;i++) {
            if (dist[i] == 10000000) return -1;
            max = Math.max(max, dist[i]);
        }
        return max;
    }
    public void Disjkstra(int [][]graph,int []dist){
        int n=dist.length-1;
        int v=0;;
        int min;
        while(true){
            min=10000000;
            int flag=0;
            for(int i=1;i<=n;i++){
                if(set.contains(i)==false){
                    if(dist[i]<min){
                        min=dist[i];
                        v=i;
                        flag=1;
                    }
                }
            }
            if(flag==0)break;
            set.add(v);
            for(int i=1;i<=n;i++){
                if(set.contains(i)==false&&graph[v][i]>0){
                    if (dist[v] + graph[v][i] < dist[i]) {
                        dist[i] = dist[v] + graph[v][i];
                    }
                }
            }
            Queue<Integer>p=new LinkedList<>();
           }

    }
}

class Parent {
    public String ap = this.getStr();//调用的是Child中的getStr()方法,1

    public Parent() {
        System.out.println("parent_construct");
        System.out.println("ap1:"+ap);//2
    }

    public  String getStr() {//这个方法不会被调用
        System.out.println("parent_method");
        return "Parent";
    }

}

class Child extends Parent {

    String ac = getStr();//调用的是自己getStr()的方法

    public Child() {
        super();
        System.out.println("Child_construct");
        System.out.println("ac:"+ac);
    }

    public String getStr() {//这个方法被调用两次
        System.out.println("child_method");
        return "Child";
    }
}

class MainClass {

    public static void main(String[] args) {
        Child c  = new Child();

    }


}
class parr{
    final int a=10;
    public  static void find(){
        System.out.println("你好");
    }
}
class chid implements ww{

    public void print(){
        System.out.println("即将即将军");
    }
    public static void main(String[] args) {
        chid p=new chid();

    }
}
interface  ww{
    public default void print(){
        System.out.println("niaho");
    }
}