package Help;

public class Teacher implements Runnable {
  static boolean flag=false;

    @Override
    public void run() {
       for(int i=0;i<3;i++){
           System.out.println("上课");
       }
       student1.flag=true;
    }
}
