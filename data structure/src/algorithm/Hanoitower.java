package algorithm;

public class Hanoitower {
    static int count=0;
    //汉诺塔问题解决
    public static void hanoitower(int num,char a,char b,char c){
        count++;
        //一个盘子
        if(num==1){
            System.out.println("第1个盘子从"+a+"->"+c);
            return ;
            //如果n>=2，把所有盘子分成最下面一个盘和上面所有
        }else {
              //吧上面盘子从A移到B
              hanoitower(num-1,a,c,b);
              //把最后一个盘从A->C
            System.out.println("第"+num+"个盘从"+a+"->"+c);
            //把B塔的盘子从B->C
            hanoitower(num-1,b,a,c);
        }
    }
    public static void main(String[] args) {
         hanoitower(100,'A','B','C');
        System.out.println("步骤:"+count);
    }
}
