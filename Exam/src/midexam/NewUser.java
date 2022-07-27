package midexam;
//新用户6.8折
public class NewUser implements BuyMilkTea {

    @Override
    public void paymethod() {
        System.out.println("新用户享受6.8折优惠");
    }
    public double  payOrder(MilkTea[]order) {
        double sum=0;
         for(MilkTea k:order){
             sum=sum+k.getprice()*0.68;
         }
         return sum/1.0;
    }
}
