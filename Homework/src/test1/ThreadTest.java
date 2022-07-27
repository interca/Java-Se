package test1;

public class ThreadTest {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根

        TeacherThread teacher=new TeacherThread("teacher");
        Stu1Thread stu1=new Stu1Thread("stu1");
        Stu2Thread stu2=new Stu2Thread("stu2");
        try {
            stu1.sleep(2*1000);
            stu2.sleep(4*1000);
        } catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        System.out.println("你好");
        teacher.start();
        stu2.start();
        stu1.start();
    }


}
