package likou;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    int count;
    int []vist;

    public static void main(String[] args) {
        Solution p=new Solution();
        int [][]a={{0,1,3}, {1,0,3}, {3,3,0}};
        System.out.println(p.isCompliance(a, 2));
    }
    public boolean isCompliance(int[][] distance, int n) {
        int n1=distance.length;
        int [][]graph=new int[n1][n1];
        vist=new int[n1];
        //创建二维数组
        for(int i=0;i<n1;i++){
            for(int j=0;j<distance[i].length;j++){
                graph[i][j]=distance[i][j];
            }
        }
        count=0;
        for(int i=0;i<n1;i++){
            if(vist[i]==0){
                vist[i]=1;
                dfs(graph,i);
                count++;
            }
        }
        return count<=n;
    }
    public void dfs(int [][]graph,int k){
        for(int i=0;i<graph.length;i++){
            if(graph[k][i]>=0&&graph[k][i]<=2&&vist[i]==0){
                vist[i]=1;
                dfs(graph,i);
            }
        }
    }
}

 class Main4{
    public static void main(String[]arg){
        String []a={"1","10"};
        pss p=new pss();
        Arrays.sort(a,p);
        System.out.println(Arrays.toString(a));
    }
}
class pss implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return (o2+o1).compareTo(o1+o2);
    }
}
class www{
    public static void main(String[] args) {
        String address="1.1.1.1";
        String []str=address.split("\\.");
        int n=str.length;
        String s="";
        System.out.println(Arrays.toString(str));
        for(int i=0;i<n;i++){
            if(i<n)s=s+str[i]+"[.]";
        }
        System.out.println(s);
    }
}