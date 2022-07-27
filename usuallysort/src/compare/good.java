package compare;
public class good implements Comparable {
    private double price;
    private String name;
    @Override
    //排序对商品价格
    public int compareTo(Object o) {
        if(o instanceof good){
            good good1=(good)o;
            if(this.price> good1.price)return 1;
            else if(this.price<good1.price)return -1;
            else return  0;
        }
        throw  new RuntimeException("数据类型不一致");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


  public good(String name,double price){
        this.name=name;
        this.price=price;
  }


    @Override
    public String toString() {
        return "good{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }



}
