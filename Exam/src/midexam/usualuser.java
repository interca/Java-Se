package midexam;
//一般用户特定商品八折
public class usualuser implements BuyMilkTea {


    @Override
    public void paymethod() {
        System.out.println("一般用户享受特定商品八折优惠");
    }
    //返回金额
    public double  payOrder(MilkTea[]order) {
        double sum=0;
       for(MilkTea k:order){
           if(k.getprice()==20.0){
               sum=sum+k.getprice()/2;
           }else {
               sum=sum+k.getprice();
           }
       }
       return sum;
    }
}
