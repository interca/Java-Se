package String;

public class String6 {
    public static void main(String[] args) {
        String a="北京你好北北";
        String b=a.replace('北','东');//替换所有指定字符
        System.out.println(b);
        String c=a.replace("北京","深圳");//替换字符串
        System.out.println(c);
        String d="123kshjfakj456mam45m";
        //把数字转换为逗号
        System.out.println(d.replaceAll("\\d+",","));
         d="1234l";
        System.out.println(d.matches("\\d+"));//判断是否全部是数字
        d="0571-4565674";
        //判断是不是7到八位组成
        System.out.println(d.matches("0571-\\d{7,8}"));
        d="hello|world|java";
        String [] STR=d.split("\\|");//切片，以|分割字符串储存在数组中
        for(String k:STR){
            System.out.println(k);
        }
    }
}
