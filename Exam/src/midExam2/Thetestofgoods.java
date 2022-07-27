package midExam2;

public class Thetestofgoods {
    public static void main(String[] args) {
        Shangpin goods1=new Shangpin("1000","足球鞋");
        Shangpin goods2=new Shangpin();
        goods2.setName("篮球鞋");
        goods2.setNum("100");
       boolean num=goods1.equals(goods2.getNum());
       if(num==true) System.out.println("是同一商品");
       else System.out.println("不是同一件商品");
    }
}
