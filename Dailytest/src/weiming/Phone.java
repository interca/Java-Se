package weiming;

public class Phone {
    private String brand;
    private int price;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
    public void call(){
        System.out.println("手机打电话");
    }
    public void sendmessages(){
        System.out.println("手机发短信");
    }
}
