package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//打家劫舍回溯分析
public class recursion2 {
    static int count=0;
    public  void process(int []help, int []num, List<Integer> list, int n, int max){
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
        int []nums={0,1,50,5,333,3333,1000};
        recursion2 spl=new recursion2();
        int max;
        List<Integer>p=new ArrayList<>();

        int i=0;
        max=nums.length;

        int []num=new int[max];
        spl.process(nums,num,p,0,max);
        System.out.println(Collections.max(p));
        System.out.println(count);
    }
}
