package Bank;

public class Banktest {
    public static void main(String[] args) {

    }
}
class Bank {
   private  static Bank instance =null;
   public  static synchronized Bank geInstance(){
       if(instance==null){
           instance=new Bank();
       }
       return instance;
   }
}
