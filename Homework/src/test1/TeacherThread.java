package test1;

public class TeacherThread extends Thread{
    String threadName;
    public TeacherThread(String threadName)
    {	System.out.println("本线程的名字:" + threadName );
        this.threadName=threadName;
    }
    public void run()
    {
        for(int i=0;i<4;i++)
            System.out.println("teacher:上课");

    }

}
