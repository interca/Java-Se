package Help;

public class People implements Runnable{
   public Thread student1,student2,teacher;

    public People(){
        student1=new Thread(this);
        student2=new Thread(this);
        teacher=new Thread(this);
    }
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        switch (name){
            case "老师":
                try {
                    Thread.sleep(1000*3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=0;i<3;i++)
                System.out.println("上课");
                 student1.interrupt();

                break;
            case "学生1":
                System.out.println(Thread.currentThread().getName()+"睡觉十分钟");
                try {
                    student1.sleep(1000*60*10);
                } catch (InterruptedException e) {
                    System.out.println("学生1起床");
                    student2.interrupt();
                }
                 break;
            case "学生2":
                System.out.println(Thread.currentThread().getName()+"睡觉一个小时");
                try {
                    student2.sleep(1000*60*60);
                } catch (InterruptedException e) {
                    System.out.println("学生2起床");
                }
                break;
        }
    }
}
