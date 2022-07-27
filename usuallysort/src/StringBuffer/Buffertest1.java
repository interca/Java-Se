package StringBuffer;

public class Buffertest1 {
    public static void main(String[] args) {
       StringBuffer a=new StringBuffer("abc");
       a.setCharAt(1,'黄');//改变本身
        System.out.println(a);
        //里面添加元素
        a.append("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        System.out.println(a);
        a.replace(4,7,"hhhh");
        System.out.println(a);

    }
}
