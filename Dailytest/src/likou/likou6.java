package likou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//打家劫舍回溯
public class likou6 {
            static int count=0;
        public  void process(int []help,int []num, List<Integer> list, int n, int max){
           // System.out.println(n);
            if(n>=max){
                print(num,list,max);
            }else{
                for(;n<max;n=n+1){
                    int []help2=new int[max];
                    for(int w=0;w<max;w++){
                        help2[w]=num[w];
                    }
                    num[n]=help[n];
                    int i=n+2;
                     do{
                            int[] help3 = new int[max];
                            for (int w = 0; w < max; w++) {
                                help3[w] = num[w];
                            }
                            process(help, num, list, i, max);
                            i++;
                            num = help3;
                        }while (i<max);

                    num=help2;
                }
            }
            //return help2;
        }

        public  void print(int []help,List<Integer>p,int max){
            count++;
            int sum=0;
            System.out.println(Arrays.toString(help));
            for(int i=0;i<max;i++){
                sum=sum+help[i];
            }
            p.add(sum);
        }

    public static void main(String[] args) {
            int []nums={0,1,50,5,333,333,1000000,100000,22,1};
        likou6 spl=new likou6();
        int max;
        List<Integer>p=new ArrayList<>();
        int []help;
        int i=0;
        max=nums.length;
        help=new int[max];
        int []num=new int[max];
        spl.process(nums,num,p,0,max);
        System.out.println(Collections.max(p));
        System.out.println(count);
    }

}
class likout1{
    public static void main(String[] args) {
        String  s="leetcode";
        List<String>wordDict=new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        int sum=0;
        for(int i=0;i<wordDict.size();i++){
            System.out.println(s.replace(wordDict.get(i),""));
        }

        System.out.println(s);
    }
}