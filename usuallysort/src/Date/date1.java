package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

///JDK8之前的
public class date1 {
    public  void test() {
        SimpleDateFormat p =new SimpleDateFormat();
        Date date=new Date();//当前时间
        System.out.println(date);
        String str =p.format(date);//格式化，放回字符串
        System.out.println(str);
        SimpleDateFormat p2 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //常见模式,转成字符串
        String str2=p2.format(date);
        System.out.println(str2);
        date.getHours();
        //字符串转回去
        try {
            Date date2=p2.parse("2020-02-18  11:48:27");
            System.out.println(date2);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
      date1 p=new date1();
      p.test();
    }
}
