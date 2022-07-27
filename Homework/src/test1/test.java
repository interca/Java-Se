package test1;

public class test {
    public static void main(String[] args) {
      Person p=new Person();
      Thread t1=new Thread(p);
      t1.start();
      for(int i=0;i<100;i++){
          System.out.println("我好");
      }
    }
}
