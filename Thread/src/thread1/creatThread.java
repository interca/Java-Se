package thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//Callable接口来创建线程
class mythreadest implements Callable{
  private int sum=0;
    @Override
    public Object call() throws Exception {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                sum=sum+i;
            }
        }
        return sum;
    }
}
public class creatThread {
    public static void main(String[] args) {
        mythreadest p=new mythreadest();
        FutureTask p1=new FutureTask(p);
        Thread t =new Thread(p1);
        t.setName("线程1");
       t.start();
        try {
            Object sum=p1.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
