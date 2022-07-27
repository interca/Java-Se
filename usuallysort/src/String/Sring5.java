package String;

public class Sring5 {
    public static void main(String[] args) {
        String p1="hellorworld";
        boolean a=p1.endsWith("ld");//判断是否以某字符串结尾
        System.out.println(a);
        boolean b=p1.startsWith("hello");//判断是否以某字符串结尾
        System.out.println(b);
        //从某出开始是不是以某字符串结尾
        boolean c=p1.startsWith("llo",2);
        System.out.println(c);
        String d="wo";
        System.out.println(p1.contains(d));//是否包含某个字符串
        System.out.println(p1.indexOf("lo"));
        System.out.println(p1.indexOf('l'));
        //从5开始找
        System.out.println(p1.indexOf("lo",5));
        System.out.println(p1.lastIndexOf("or"));//反向找
        System.out.println(p1.lastIndexOf("or",6));
    }
}
