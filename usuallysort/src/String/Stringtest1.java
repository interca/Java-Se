package String;

public class Stringtest1 {
    public static void main(String[] args) {
       String a="123";
        int b=Integer.parseInt(a);//字符串变成基本数据类型
        System.out.println(b);
        int c=1234;
        String d=String.valueOf(c);//基本数据类型变成字符串
        System.out.println(d);
        double p= Double.parseDouble(a);
        System.out.println(p);
    }
}
