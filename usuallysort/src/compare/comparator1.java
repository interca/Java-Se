package compare;

import java.util.Arrays;
import java.util.Comparator;

public class comparator1 {
    public static void main(String[] args) {
        String[] a={"AAA","DDD","BBBB","ZZZZZ","HHHHH"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //字符串大到小开始排序
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1 instanceof String&&o2 instanceof String){
                    return o2.compareTo(o1);
                }else{
                    throw new RuntimeException("数据错误");
                }
            }
        });
        System.out.println(Arrays.toString(a));
    }
}
