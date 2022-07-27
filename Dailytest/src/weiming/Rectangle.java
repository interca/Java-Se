package weiming;

public class Rectangle {
    private double length;
    private double width;
    private double are;
     private  double Perimeter;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.are=length*width;
        this.Perimeter=2*(length+width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getAre() {
        return are;
    }

    public String toString(){
         return "矩形面积是"+are+"，矩形的周长是"+Perimeter;
    }
}
