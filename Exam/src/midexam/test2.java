package midexam;

public class test2 {

    public static void main(String[] args) {
      //规定只有第一种奶茶对普通用户有折扣
        MilkTea[]milkTeas=new MilkTea[10];
        for(int i=0;i<milkTeas.length;i++){
            if(i%2==0)milkTeas[i]=new tea1();
            else milkTeas[i]=new tea2();
        }
        //分别建立新用户，Vip用户，和普通用户的对象
        NewUser newuser=new NewUser();
        VipUser vipuser=new VipUser();
        usualuser usualluser=new usualuser();
        newuser.paymethod();
        System.out.println(newuser.payOrder(milkTeas));
        vipuser.paymethod();
        System.out.println(vipuser.payOrder(milkTeas));
        usualluser.paymethod();;
        System.out.println(usualluser.payOrder(milkTeas));
    }

}
