package String;

public class String4 {
    public static void main(String[] args) {
        String p="HeWWW";
        System.out.println(p.length());
        System.out.println(p.charAt(1));
        System.out.println(p.toLowerCase());//转换小写，本身不变
        System.out.println(p.toUpperCase());//大写
        String p1="   heew    ";
        System.out.println("-----"+p1+"-----");
        System.out.println("----"+p1.trim()+"-----");//去处收尾空格，本身不变
        String p3=p.concat("abc");//字符串拼接
        System.out.println(p3);
        String p4="abc";
        String p5="abd";
       System.out.println(p5.compareTo(p4));//字符串比较，一一对应
        System.out.println(p.substring(2));//截取字符串，本身不变
        System.out.println(p.substring(1,4));
        //从第一个开始，截取到下一个下标前，包含第一个下标。

    }
}
