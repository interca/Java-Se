package thread1;
//生产者和消费者问题
class clerk{//店员
    private int number=0;//产品数量
    public  synchronized void produce() {
        if(number<20){
            number++;
            System.out.println(Thread.currentThread().getName()+"开始生产第"+number+"个");
            notifyAll();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void custom() {
        if(number>0){
            System.out.println(Thread.currentThread().getName()+"开始购买第"+number+"个");
            notifyAll();
            number--;
        }else{
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class producter extends Thread{//生产者
   private clerk p;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+"开始生产产品");
        while(true){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p.produce();
        }
    }

    public producter(clerk p) {//店员是共享的
        this.p = p;
    }
}
class Custom extends Thread{//消费者
   private clerk p;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+"开始买产品");
        while(true){
            try {
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p.custom();
        }
    }

    public Custom(clerk p) {
        this.p = p;
    }
}

public class Product {
    public static void main(String[] args) {
          clerk p=new clerk();//同步店员
          producter p1=new producter(p);
          Custom p2=new Custom(p);
          Custom p3= new Custom(p);
          p1.setName("生产者");
          p2.setName("消费者1");
          p3.setName("消费者2");
          p1.start();
          p2.start();
          p3.start();
    }
}
