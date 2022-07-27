package Help;

import java.util.LinkedList;
import java.util.Random;

public class NUM3 {

    public static void main(String[] args) throws InterruptedException {
        int count=5;//right

        LinkedList<Integer> list=new LinkedList<Integer>();

        Producer h=new Producer(list,4);

        Comsumer[] h1=new Comsumer[4];

        for(int i=0;i<4;i++)
        {
            h1[i]=new Comsumer(list);
        }

        Thread producer=new Thread(h);
        producer.setName("生产者线程");

        Thread comsumer1=new Thread(h1[0]);
        comsumer1.setName("消费者1");

        Thread comsumer2=new Thread(h1[1]);
        comsumer2.setName("消费者2");
        Thread comsumer3=new Thread(h1[2]);
        comsumer3.setName("消费者3");

        Thread comsumer4=new Thread(h1[3]);
        comsumer4.setName("消费者4");

        producer.start();
        comsumer1.start();
        comsumer2.start();
        comsumer3.start();
        comsumer4.start();



        for(int i=0;i<4;i++)
        {
            System.out.println("消费者"+(i+1)+"取得的彩票是");
            h1[i].getNum();
            System.out.println();
        }

        int getscore=new Random().nextInt(10000);
        System.out.println("本期中奖彩票为:"+getscore);

        for(int i=0;i<4;i++)
        {
            if(h1[i].panduan(getscore)==true)
                count=i;
        }

        if(count!=5)
            System.out.println("恭喜线程"+(count+1)+"获奖");
        else
            System.out.println("很遗憾，没有线程中奖");





    }

}

