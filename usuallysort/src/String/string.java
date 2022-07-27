package String;

public class string {
    public static void main(String[] args) {
        String a="abc";
        String b=a;
        System.out.println(a);
        System.out.println(a==b);
        String c=new String("abcd");
        System.out.println(a==c);
        b="cccc";
        System.out.println(a);
        a=c;
        System.out.println(a);
        c="bbbb";
        System.out.println(a);
        String d=new String("你好");
        String h=new String("yi");
        d=h;
        System.out.println(d==h);
        d="ninini";
        System.out.println(h);
        System.out.println(h==d);
        int []w={1,2,3,4};
        int []z=w;
        z[0]=100;
        System.out.println(w);
        System.out.println(w==z);
    }
}
