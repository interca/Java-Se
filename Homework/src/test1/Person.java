package test1;

public class Person implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("你好");
        }
    }
}
