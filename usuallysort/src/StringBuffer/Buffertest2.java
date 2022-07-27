package StringBuffer;

public class Buffertest2 {
    public static void main(String[] args) {
        StringBuffer p=new StringBuffer("hell");
        p.append('1');//添加，本身改变
        System.out.println(p);
        p.delete(0,2);
        System.out.println(p);//删除0到2，不包含2
        StringBuffer p2=new StringBuffer("kkkkk");
        p2.replace(2,4,"jjjjjj");//中间插入字符串，覆盖原有的。左闭右开
        System.out.println(p2);
        p2.setCharAt(0,'黄');//改变单个字符
        System.out.println(p2);

    }
}
