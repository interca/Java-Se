package String;

public class String2 {
    public static void main(String[] args) {
      String a=new String("你好");
      String b=new String("你好");
      System.out.println(a==b);
      b=a;
      System.out.println(a==b);
      b="hhhh";
      System.out.println(a);
      String c="hellll";
      String d="hellll";
      System.out.println(c==d);
      d="nihao";
      System.out.println(c);
    }
}
