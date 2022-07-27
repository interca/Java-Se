package String;

public class String3 {
    String str=new String("good");
    char [] ch={'t','e','s','t'};
    public  void  change(String str,char ch[]){
        str=str.replace('o','w');
        System.out.println(str);
        str="test ok";
        System.out.println(str);
        ch[0]='b';
    }
    public static void main(String[] args) {
        String3 p=new String3();
        p.change(p.str,p.ch);
        System.out.println(p.str);
        System.out.println(p.ch);

    }
}
