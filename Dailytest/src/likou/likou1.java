package likou;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class likou1 {

    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();

    }
}
class Solution1 {

    public static void main(String[] args) {
        int m=2;
        int n=2;
        int [][]indices={{1,1},{0,0}};
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        for(int i=0;i<indices.length;i++){
            int k1=indices[i][0];
            int k2=indices[i][1];
            if(map1.get(k1)==null){
                map1.put(k1,0);
            }
            map1.put(k1,map1.get(k1)+1);
            if(map2.get(k2)==null){
                map2.put(k2,0);
            }
            map2.put(k2,map2.get(k2)+1);
        }
        int sum=0;
        int k1=0;
        int k2=0;
        System.out.println(map1);
        System.out.println(map2);
        for(int i=0;i<m;i++){
            if(map1.get(i)==null)k1=0;
            else k1=map1.get(i);
            for(int j=0;j<n;j++){
                if(map2.get(j)==null)k2=0;
                else k2=map2.get(j);
                if((k1+k2)%2==1)sum++;
            }
        }
        System.out.println(sum);
    }

}
