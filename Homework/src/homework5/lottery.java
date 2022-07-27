package homework5;

import java.util.*;

public class lottery implements Runnable {
    static int luck;
    static int number;
    static Queue<Integer>queue=new LinkedList<>();//储存已经产生的彩票
    static int flag=33;//中奖号码
    static List<Integer>[]list=new ArrayList[4];


    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("线程一")){
               produce();
        }
        else {
            while(number<1000){
                middle();
            }
        }
    }
    public synchronized void middle()  {
        if(queue.size()==0)return;
          take();
    }
    //生产彩票
    public  void produce()  {
        number=1;
        while(number<1000){
              if(queue.size()<20){
                  queue.add(number);
                  number++;
              }
        }
    }
    public synchronized void take() {
            int i=0;
            String a = Thread.currentThread().getName();
            switch (a) {
                case "线程二":
                    i = 0;
                    break;
                case "线程三":
                    i = 1;
                    break;
                case "线程四":
                    i = 2;
                    break;
                case "线程五":
                    i = 3;
                    break;
            }
            if(queue.size()>0) {
                if(queue.peek()==flag)luck=i;
                list[i].add(queue.poll());
            }
    }

}
