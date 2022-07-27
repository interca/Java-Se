package weiming;

public class Cuboid extends Rectangle{
    private  double height;
    private  double v;
    public Cuboid(double length, double width,double height) {
        super(length, width);
        this.height=height;
         v=length*width*this.height;
    }
    public String toString(){
        return "体积是："+v;
    }
}
