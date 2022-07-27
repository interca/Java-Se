package weiming;

public class Phonetest {
    public static void main(String[] args) {
          Phone phone=new Phone("小米",4000);

        System.out.println("手机品牌是:"+phone.getBrand()+",手机价格是:"+phone.getPrice());
        phone.call();
        phone.sendmessages();
    }
}
