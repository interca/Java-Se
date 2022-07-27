package xmc;

public class Goods {
    private String num;//编号
    private String name;//名称
    private int price;//单价
    private int number;//购买数量

    public Goods(String num, String name, int price, int number) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getNum() {
        return num;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        return num != null ? num.equals(goods.num) : goods.num == null;
    }

    @Override
    public int hashCode() {
        return num != null ? num.hashCode() : 0;
    }
}
