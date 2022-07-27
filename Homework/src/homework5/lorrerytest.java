package homework5;

import java.util.ArrayList;

public class lorrerytest {
    public static void main(String[] args) {
        lottery p=new lottery();
        Thread t1=new Thread(p);
        t1.setName("线程一");
        Thread t2=new Thread(p);
        t2.setName("线程二");
        Thread t3=new Thread(p);
        t3.setName("线程三");
        Thread t4=new Thread(p);
        t4.setName("线程四");
        Thread t5=new Thread(p);
        t5.setName("线程五");
        for(int i=0;i<4;i++){
           lottery. list[i]=new ArrayList<>();
        }
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        while(true){
            if(t5.isAlive()==false&&t2.isAlive()==false&&t3.isAlive()==false
                    &&t4.isAlive()==false)break;
        }
        System.out.println("线程二彩票有" + lottery.list[0]);
        System.out.println("线程三彩票有" + lottery.list[1]);
        System.out.println("线程四彩票有" + lottery.list[2]);
        System.out.println("线程五彩票有" + lottery.list[3]);
        System.out.println("开奖号码为:"+lottery.flag);
        int a=lottery.luck;
        String number="";
        switch (a){
            case 0:
                number="线程二";break;
            case 1:
                number="线程三";break;
            case 2:
                number="线程四";break;
            default:
                number="线程五";break;
        }
        System.out.println("中奖的线程是："+number);
    }
}
