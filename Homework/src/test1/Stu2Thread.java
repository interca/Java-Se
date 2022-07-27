package test1;

public class Stu2Thread extends Thread{
    String threadName;
    public Stu2Thread(String threadName)
    {	System.out.println("本线程的名字:" + threadName );
        this.threadName=threadName;
    }
    @Override
    public void run() {
        // TODO 自动生成的方法存根
        System.out.println("本线程" + threadName+"被唤醒" );
    }

}
