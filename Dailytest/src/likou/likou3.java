package likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class likou3 {
    public static void main(String[] args) {
        int m=13,n=23;
        int nums=m+n-2;
        int count=0;
        long a1=1;
        long a2 =1;
        long a3=1;
        long sum=1;

        for(int i=m,j=1;i<=m+n-2||j<=n-1;j++,i++){
            if(i<=n+m-2){
                sum=sum*i;
            }
              if(j<=n-1){
                  sum=sum/j;
              }
        }

        System.out.println(sum);
    }
}
class test22{
    List<List<Integer>>p1;
    int []result;
    int index;
    int []vist;
    boolean flag=true;

    public static void main(String[] args) {
        test22 p=new test22();
        System.out.println(Arrays.toString(p.findOrder(4,new int[][]{{1,0},{2,0},{3,1},{3,2}})));
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        index=numCourses-1;
        vist=new int[numCourses];
        result=new int[numCourses];
        p1=new ArrayList<List<Integer>>();
        for(int i=0;i<numCourses;i++){
            p1.add(new ArrayList<Integer>());
        }
        for(int []help:prerequisites){
            p1.get(help[1]).add(help[0]);
        }
        for(int i=0;i<numCourses&&flag;i++){
            if(vist[i]==0){
                dfs(i);
            }
        }
        if(flag==false){
            return new int[0];
        }
        return result;
    }
    public  void dfs(int u){
        for(int k:p1.get(u)){
            System.out.println(u);
            System.out.println(p1.get(u));
            if(vist[k]==0){
                dfs(k);
                if(flag==false)return;
            }

            else if(vist[k]==1){
                flag=false;
                return ;
            }
        }
        vist[u]=2;
        result[index--]=u;
    }
}
class test5{
    public static void main(String[] args) {
        List<Integer>p=new ArrayList<>();

    }
}