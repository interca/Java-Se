package thread1;
//两个人分别向账户存钱3000，每次1000，共三次，每次存完打印账户余额
class Acount{
   private double balance;//余额

    public Acount(double balance) {
        this.balance = balance;
    }
    public synchronized void deposit(double money)  {//存钱
          if(money>0){
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              balance+=money;
              System.out.println(Thread.currentThread().getName()+"存钱成功，余额为："+balance);
          }
          else{
              System.out.println("存钱失败，余额为："+balance);
          }
    }
}
class  Customer extends  Thread{
   private Acount acct;//共同账户

    public Customer(Acount acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
         for(int i=0;i<3;i++){
               acct.deposit(1000);
         }
    }
}
public class Threadtest5 {
    public static void main(String[] args) {
         Acount acct=new Acount(0);//初始余额是0
          Customer p1=new Customer(acct);
          Customer p2= new Customer(acct);
          p1.setName("甲");
          p2.setName("乙");
          p1.start();
          p2.start();
    }
}
