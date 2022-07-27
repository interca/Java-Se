package likou;

import java.util.*;

public class likou5 {
    public static int max;
    public static List<Integer> p=new ArrayList<>();
    public static int []help;
    public static int i=0;
    public static void process(int a[],int n){
        if(n>=max){
            print();
            help=new int[max];
        }else{
            for(;n<max;n=n+1){
                help[n]=a[n];
                process(a,n+2);
            }
        }
    }

    public static void print(){
        int sum=0;
        System.out.println(Arrays.toString(help));
        for(int i=0;i<max;i++){
            sum=sum+help[i];
        }
        p.add(sum);
    }

    public static void main(String[] args) {
        int []nums={1,2,3,1};
        max=nums.length;
        help=new int[max];
        process(nums,0);
        System.out.println(Collections.max(p));
    }
}
class p{
    int []num;
    public static void main(String[] args) {
        String a="ABCd";

        p p1=new p();
        System.out.println(p1.numTilePossibilities(a));

    }
    public void find(String tiles, HashSet<String> p, String s){
        if(s.length()==tiles.length()){
            return ;
        };
        for(int i=0;i<tiles.length();i++){
              if(num[i]==0) {
                  String str = s;
                  num[i]=1;
                  str = str + tiles.charAt(i) + "";
                  if(s.length()<=3){
                      p.add(str);
                  }
                  find(tiles, p, str);
                  num[i]=0;
             }
        }
    }
    public int numTilePossibilities(String tiles) {
        num=new int[tiles.length()];
        int n=tiles.length();
        HashSet<String>p=new HashSet<>();
        String s="";
        find(tiles,p,s);
        return p.size();
    }
}