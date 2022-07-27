package Threadfrombook;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//银行转账和await的使用，配合锁
class bank implements Runnable{
    private ReentrantLock lock=new ReentrantLock();
    private Condition fund=lock.newCondition();//置顶一个阻碍系统
    int []acount;

    public bank(int n,int max){///设置账户数，以及每个账户分配的钱数
          acount=new int[n];
        Arrays.fill(acount,max);
    }
    @Override
    public void run() {
             lock.lock();
            int fromaccount = (int) (size() * Math.random());//从所有账户中随机抽取转出账户
            int amount = (int) (1000 * Math.random());//随机金额，0-1000；
            int toaccount = (int) (size() * Math.random());
            try {
                while (acount[fromaccount] < amount)
                    fund.await();
                    acount[fromaccount] = acount[fromaccount] - amount;
                acount[toaccount] = acount[toaccount] + amount;
                System.out.println(Thread.currentThread().getName() + ":" + fromaccount + "to" + toaccount + "is" + amount);
                System.out.println("The " + fromaccount + "is " + acount[fromaccount] + "and the " + toaccount + "is " + acount[toaccount]);
                System.out.println("THE sum is :" + blance());
                fund.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

    }
    public  int size(){///返回账户数量
        return acount.length;
    }

    public int blance(){//返回总额
        int sum=0;
        for(int k: acount){
            sum=sum+k;
        }
        return sum;
    }
}

public class Banktest {
int max=1000;
int number=10;
    public static void main(String[] args) {
        bank p=new bank(100,1000);

        while(true){
            new Thread(p).start();
            new Thread(p).start();
            new Thread(p).start();
        }

    }

}
