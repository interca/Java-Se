package thread1;

//线程安全问题
//同步代码块方法使用同步监视器
public class Threadsafle {
    public static void main(String[] args) {
        mythread2 p=new mythread2();
        Thread p1=new Thread(p);
        Thread p2=new Thread(p);
        Thread p3=new Thread(p);
        p1.setName("线程1");
        p2.setName("线程2");
        p3.setName("线程3");
        p1.start();
        p2.start();
        p3.start();

    }
}
class mythread2 implements Runnable{
    Object p =new Object();
    int ticket=1000;
    @Override
    public void run() {
          while(true) {
              synchronized (p) {
                if (ticket > 0) {
                   System.out.println(Thread.currentThread().getName() + ":" + "票：" + ticket);
                   ticket--;
               } else break;
           }
       }
    }
}