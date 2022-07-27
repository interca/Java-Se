package Help;

public class test3 {
    public static void main(String[] args) {
        DivideFile divideFile=new DivideFile();
        Thread t1=new Thread(divideFile);
        Thread t2=new Thread(divideFile);
        Thread t3=new Thread(divideFile);
        t1.setName("老师1");
        t2.setName("老师2");
        t3.setName("老师3");
        t1.start();
        t2.start();
        t3.start();
    }
}
