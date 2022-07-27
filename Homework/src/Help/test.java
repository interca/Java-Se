package Help;

public class test {
    public static void main(String[] args) {
      People p=new People();
      p.teacher.setName("老师");
      p.student1.setName("学生1");
      p.student2.setName("学生2");
     p.student1.start();
      p.student2.start();
      p.teacher.start();
    }
}
