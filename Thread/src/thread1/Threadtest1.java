package thread1;
//实现接口
public class Threadtest1 {
    public static void main(String[] args) {
        //继承接口的类的对象
          mythread p=new mythread();
          //将对象传到Thread类构造器中
          Thread p2=new Thread(p);
          Thread p1=new Thread(p);
          p2.setName("线程1");
          p1.setName("线程2");
          p2.start();
          p1.start();
    }
}
class  mythread implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            if(i%2==0)
            System.out.println(Thread.currentThread().getName()+":"+","+i);
        }
    }
}