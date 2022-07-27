package homework6;

public class Book implements Comparable {
    double price;
    String name;
    public void setPrice(double c) {
        price=c;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String n) {
        name=n;
    }
    public String getName() {
        return name;
    }
    public int compareTo(Object object) {
        Book book=(Book)object;
       return Double.compare(this.getPrice(),book.getPrice());
    }
}
