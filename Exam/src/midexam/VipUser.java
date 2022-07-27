package midexam;
//vip用户买一送一
public class VipUser implements BuyMilkTea {

    @Override
    public void paymethod() {
        System.out.println("VIP用户买一送一");
    }
    public double  payOrder(MilkTea[]order) {
         double sum=0;
          for(MilkTea k:order){
              sum+=k.getprice();
          }
          return sum*1.0/2;
    }
}
