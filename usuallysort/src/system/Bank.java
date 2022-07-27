package system;

public class Bank {
    public static void main(String[] args) {
        Account account=new Account();
        Customer cust=new Customer();

        cust.id="XXXXXXXXXXXXXXXX";
        cust.name="zhangzeyu";
        cust.phoneNumber="13715780586";
        System.out.println(cust.say());
        account.cid ="1354648984";
        account.blance =20000;
        account.getInfo();
        account.save(1000);
        account.getInfo();
        account.withdraw(200);
        account.getInfo();
    }
}


class Account{

    String cid;
    int blance;

    public void getInfo() {
        System.out.println("卡号："+cid+"\n余额:"+blance);
    }


    public boolean withdraw(int n) {
        if(n<=blance) {
            blance-=n;
            return true;
        }
        else {
            return false;
        }
    }


    public boolean save(int n) {
        if(n>=0) {
            blance+=n;
            return true;
        }
        else {
            return false;
        }
    }


}

class Customer{

    String name;
    String id;
    String phoneNumber;

    public String say() {
        return "姓名："+name+"身份证号码："+id+"\n电话号码"+phoneNumber;
    }

}