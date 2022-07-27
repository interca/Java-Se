package String;

import java.util.Arrays;

//字符数组和String转换
public class Stringtest2 {
    public static void main(String[] args) {
        String a="abcde";
        char [] b=a.toCharArray();
        for(char c:b){
            System.out.println(c);
        }
        char []c={'你','好'};
        String d=new String(c);
      int [] w={1,2,3};
        System.out.println(Arrays.toString(w));
    }
}
