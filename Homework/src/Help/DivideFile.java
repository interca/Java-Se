package Help;

public class DivideFile implements Runnable{
    static int file=80;
    @Override
    public void run() {
        while(file>0){
            divide();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void divide(){
            if(file>0){
                System.out.println(Thread.currentThread().getName()+"分发笔记，笔记还剩"+(file-1)+"份");
                file--;
            }

    }
}
