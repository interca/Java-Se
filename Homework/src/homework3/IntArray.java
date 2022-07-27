package homework3;

import java.util.Arrays;

public class IntArray {
     private int[] num={44,2,14,12,56,34,23,-1,77};
    //内部类
   class IntFunctions{
       //排序
        public void sort(){
            Arrays.sort(num);
            System.out.println("排序后数组为："+Arrays.toString(num));
        }
        //找最大值
        public void findmax(){
            int max=num[0];
            for(int i=0;i<num.length;i++){
                if(num[i]>max)max=num[i];
            }
            System.out.println("数组最大值是："+max);
        }
        //找最小值
        public void findmin(){
            int min=num[0];
            for(int i=0;i<num.length;i++){
                if(num[i]<min)min=num[i];
            }
            System.out.println("数组最小值是："+min);
        }
        public void ave(){
            int sum=0;
            for(int k:num){
                sum=sum+k;
            }
            System.out.println("平均值是："+(sum*1.0)/num.length);
        }
    }
    public IntFunctions returnclass(){
        IntFunctions p=new IntFunctions();
        return p;
    }

}
class test{
    public static void main(String[] args) {
        IntArray p=new IntArray();
        var p2=p.returnclass();
        p2.sort();
        p2.findmax();
        p2.findmin();
        p2.ave();
    }
}
