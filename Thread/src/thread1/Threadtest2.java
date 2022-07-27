package thread1;

public class Threadtest2 {
    public static void main(String[] args) {
            windows p1=new windows();
            windows p2=new windows();
            windows p3=new windows();
            p1.setName("窗口1");
            p2.setName("窗口2");
            p3.setName("窗口3");
            p1.start();
            p2.start();
            p3.start();
    }
}
class  windows extends Thread{
     private static int ticket=100;
    @Override
    public void run() {
       while(true){
           if(ticket>0) {
               System.out.println(getName() + ":" + "票号" + ticket);
               ticket--;
           }else break;
       }
    }
}