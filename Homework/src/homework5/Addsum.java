package homework5;

public class Addsum extends Thread{
    static int flag=0;
    static int sum=0;
    int start;
    @Override
    public void run() {
        for(int i=start;i<=start+9;i++){
            sum+=i;
        }
        flag++;
    }
}
