package weiming;

import java.util.Scanner;

public class TestTaxi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Taxi taxi=new Taxi();
        taxi.addOil(in.nextDouble());
        System.out.println("可以跑："+taxi.remil());
        System.out.printf("邮费：%2f",taxi.remil()*8.6*1.5);
    }
}
