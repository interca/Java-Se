package Help;
import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable{
    private final LinkedList<Integer>list;
    private final int Size;
    private int n=0;
    private int []h=new int[]{11,11,11,11,11,11,11,11,11,11};

    private int a=0;

    public Producer(LinkedList<Integer> list ,int i)
    {
        Size=i;
        this.list=list;
    }

    public void run()
    {
        try {while(true)
        {
            Thread.sleep(2000);
            synchronized (list){
                if(list.size()==Size)
                    list.wait();
                else
                {
                    if(n==10)
                        break;
                    list.add(produce());
                    list.notifyAll();
                    n++;
                }
            }
        }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private int produce()
    {
        int f=0;
        int getscore=new Random().nextInt(10000);

        while(f==0)
        {
            boolean h1=true;
            for(int i=0;i<10;i++)
            {
                if(h[i]==getscore)
                {
                    h1=false;
                    break;
                }
            }

            if(h1==true)
            {
                h[a]=getscore;
                a++;
                f=-1;
                break;
            }
            getscore=new Random().nextInt(10000);
        }

        return getscore;
    }
}
