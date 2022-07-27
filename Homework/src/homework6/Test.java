package homework6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        Scanner in=new Scanner(System.in);
        //输入七个数字
        for(int i=0;i<7;i++){
            list.add(in.nextInt());
        }
        //生成彩票
        while(set.size()<7){
            int k=(int)(Math.random()*30+1);
            set.add(k);
        }
        int sum=0;
        System.out.println("开奖号码为：");
        for(int k:set){
            System.out.print(k+"  ");
        }
        for(int i=0;i<list.size();i++){
            if(set.contains(list.get(i)))sum++;
        }
        if(sum==7) System.out.println("中了一等奖");
        else if(sum==6) System.out.println("中了二等奖");
        else  if(sum==5) System.out.println("中了三等奖");
        else System.out.println("没中奖");
    }
}
