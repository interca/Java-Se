package Help;

public class student1 extends Thread {
  static boolean flag=false;

    @Override
    public void run() {
        System.out.println("学生1醒来");
        student2.flag=true;
    }
}
