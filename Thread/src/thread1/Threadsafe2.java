package thread1;
//同步方法来解决安全问题
public class Threadsafe2 {
    public static void main(String[] args) {
         mymethed p=new mymethed();
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
class mymethed  implements Runnable {
    int ticket = 1000;

    @Override
    public void run() {
        while (ticket>0) {
            show();
        }
    }

    public  synchronized void  show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + "票：" + ticket);
            ticket--;
        }
    }
}