package thread1;

import java.util.concurrent.*;

//线程池
public class Threadpool {
    public static void main(String[] args) {
       ExecutorService p= Executors.newFixedThreadPool(10);//创建线程池
        number2 number=new number2();//创建实现Callable接口的类的对象
        numbers n1=new numbers();
     //  p.execute(n1);//run接口
       // p.execute(new numbers());
        FutureTask futrct=new FutureTask(number);//Callable接口
        p.execute(futrct);

        try {
            futrct.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        p.shutdown();//关闭线程池

    }
}
class  number2 implements Callable{
private  int sum=0;
    @Override
    public Object call() throws Exception {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            sum=sum+i;
        }
        return sum;
    }
}

class  numbers implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}