package weiming;

import java.util.Scanner;

public class TestGraph {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("输入矩形长度和宽度");
        Rectangle rectangle=new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println("面积是："+rectangle);

        System.out.println("输入长方体的长宽高：");
        Cuboid cuboid=new Cuboid(in.nextDouble(),in.nextDouble(), in.nextDouble());
        System.out.println("体积是："+cuboid);
    }
}
