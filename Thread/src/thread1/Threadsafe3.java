package thread1;

import java.util.concurrent.locks.ReentrantLock;

//线程安全方式三：lock锁
class window implements Runnable {
    private ReentrantLock lock = new ReentrantLock();
    private int ticket = 1000;

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();    //调用Lock方法
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + "票：" + ticket);
                    ticket--;
                } else break;
            } finally {
                lock.unlock();//调用解锁方法
            }
        }
    }
}
public class Threadsafe3 {
    public static void main(String[] args) {
          window w=new window();
          Thread p1=new Thread(w);
          Thread p2=new Thread(w);
          Thread p3=new Thread(w);
          p1.setName("线程1");
          p2.setName("线程2");
          p3.setName("线程3");
          p1.start();
          p2.start();
          p3.start();
    }
}

