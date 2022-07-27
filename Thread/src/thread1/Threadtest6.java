package thread1;
//两个线程交替打印1到一百
class number implements Runnable{
    private int number=1;
    @Override
    public void run() {

         while(true){
             synchronized (this) {
                 notify();//唤醒另一个线程
                 if (number <= 100) {
                     System.out.println(Thread.currentThread().getName() + ":" + "票" + number);
                     number++;
                     try {
                         wait();//使得掉入wait()方法的线程进入阻塞状态。并且释放锁
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 } else break;
             }
         }
    }
}
public class Threadtest6 {
    public static void main(String[] args) {
         number p=new number();
         Thread p1=new Thread(p);
         Thread p2=new Thread(p);
         p1.setName("线程1");
         p2.setName("线程2");
         p1.start();
         p2.start();

    }
}
