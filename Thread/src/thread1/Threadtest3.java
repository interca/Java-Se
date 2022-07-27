package thread1;
///使用接口来实现线程
public class Threadtest3 {
    public static void main(String[] args) {
        window1 p =new window1();
        Thread p2=new Thread(p);
        Thread p3 =new Thread(p);
        Thread p4=new Thread(p);
        p4.setName("窗口3");
        p2.setName("窗口1");
        p3.setName("窗口2");
        p4.start();
        p2.start();
        p3.start();
    }
}
class  window1 implements Runnable{
    private int ticket=30;
    @Override
    public void run() {
        while(true){
            if(ticket>0){
                ticket--;
                System.out.println(Thread.currentThread().getName()+":"+"卖票"+ticket);
            }else break;
        }
    }
}