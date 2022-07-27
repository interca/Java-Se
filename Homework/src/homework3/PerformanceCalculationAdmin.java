package homework3;

import java.util.Scanner;

public class PerformanceCalculationAdmin {
    //循环打印
    public  void allPerformanceCalculation(PerformanceCalculation[ ]  pe){
        for(int i=0;i<pe.length;i++){
            System.out.println(pe[i].getString(pe[i].doPerformanceCalculation()));
        }
    }
    //主函数
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //创建数组
        PerformanceCalculation []p=new PerformanceCalculation[100];
        //循环输入数据,如果i%3取余为0，输入老师，取一输入研究员，取二，输入实验员
        for(int i=0;i<p.length;i++){
            if(i%3==0){
                p[i]=new Teacher(in.next(), in.next(), in.next(),
                        in.next(), in.next(), in.nextDouble(),
                        in.nextDouble());
            }else if(i%3==1) {
                p[i]=new ResearchStaff(in.next(), in.next(),
                        in.next(), in.next(), in.next(), in.nextDouble());
            }else{
                p[i]=new LaboratoryAssistant(in.next(), in.next(),
                        in.next(), in.next(), in.next(), in.nextDouble(),
                        in.nextDouble());
            }
        }

       PerformanceCalculationAdmin num=new PerformanceCalculationAdmin();
        num.allPerformanceCalculation(p);
    }
}
