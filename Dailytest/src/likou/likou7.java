package likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class likou7 {
    public static void main(String[] args) {
        Stack<Integer>p=new Stack<>();
        System.out.println(p.size());
    }
}
//[3,2,4,1,2]
//[[1,1,0,1,2],[2,1,4,0,0],[3,2,4,1,0]]
//[[3,2],[2,4],[7,6]]
//5
//[4,20,16,17,14]
//[[3,1,6,12,18],[12,7,17,19,16],[18,4,7,8,0],[18,9,20,16,4],[17,15,4,7,15],[2,8,9,3,13],[20,12,0,7,17],[3,2,7,5,5]]
//[[13,4],[7,18],[3,11],[6,20],[9,0],[13,16],[18,3],[2,5]]
//1
class Solutio{
    public static void main(String[] args) {
        Solutio w=new Solutio();
        int []materials={4,20,16,17,14};
        int [][]cookbooks={{3,1,6,12,18},{12,7,17,19,16},{18,4,7,8,0},{18,9,20,16,4},{17,15,4,7,15},{2,8,9,3,13},{20,12,0,7,17},{3,2,7,5,5}};
        int [][]attribute={{13,4},{7,18},{3,11},{6,20},{9,0},{13,16},{18,3},{2,5}};
        int limit=1;
        int a=w.perfectMenu(materials,cookbooks,attribute,limit);
        System.out.println(a);
    }
    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        List<Integer> p=new ArrayList<>();
        sort(p,materials,cookbooks,attribute,0,0,0,limit);
        int max=0;
        System.out.println(p);
        if(p.size()==0)return -1;
        for(int i=0;i<p.size();i++){
            if(p.get(i)>p.get(max)){
                max=i;
            }
        }
        return p.get(max);
    }
    public void sort(List<Integer>p,int[]materials,int [][]cookbooks,int [][]attribute,int n,int sum,int baofu,int limt){
        for(int i=n;i<attribute.length;i++){
            System.out.println(Arrays.toString(materials));
            int []help=new int[5];
            for(int w=0;w<5;w++){
                help[w]=materials[w];
            }
            if(cookbooks[i][0]<=help[0]&&cookbooks[i][1]<=help[1]&&cookbooks[i][3]<=help[3]&&cookbooks[i][4]<=help[4]&&cookbooks[i][2]<=help[2]){
                help[0]=help[0]-cookbooks[i][0];
                help[1]=help[1]-cookbooks[i][1];
                help[2]=help[2]-cookbooks[i][2];
                help[3]=help[3]-cookbooks[i][3];
                help[4]=help[4]-cookbooks[i][4];
                System.out.println("i="+"sum="+sum+"att="+attribute[i][0]);
                sort(p,help,cookbooks,attribute,i+1,sum+attribute[i][0],baofu+attribute[i][1],limt);
            }
            else{
                if(baofu>=limt)p.add(sum);

            }
        }
        if(n==attribute.length)if(baofu>=limt)p.add(sum);
    }
}