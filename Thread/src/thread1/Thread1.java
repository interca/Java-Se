package thread1;

public class Thread1 {
    public static void main(String[] args)  {
        hellethead p=new hellethead();
        p.setName("线程1");
        p.setPriority(10);//设置分线程优先级
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);//主线程优先级设置
        p.start();
        //主线程获取名字
        Thread.currentThread().setName("主线程");
        for(int i=0;i<10;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"优先级："+Thread.currentThread().getPriority()+":"+i);
                if(i==5){
                    try {
                        p.join();       //调用分线程，直到分线程全部结束后此线程才继续进行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
class hellethead extends Thread{
    @Override
    public void run() {
        int i;
        for( i=0;i<10;i++){
           if(i%2==0){
          //     try {
               //     sleep(1000);     //延迟此线程，单位毫秒
               //} catch (InterruptedException e) {
                 //  e.printStackTrace();
               //}
               System.out.println(Thread.currentThread().getName()+"优先级："+Thread.currentThread().getPriority()+";"+i);
           }
        }
    }
}