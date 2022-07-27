package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//三天打鱼；两天晒网
public class date3 {
    public static void main(String[] args) {
        SimpleDateFormat str=new SimpleDateFormat("yyyy-MM-dd");
        Date date1= null;
        Date date2=null;
        //两个日期相减得到毫秒数
        try {
            date1 = str.parse("2021-11-03");
            System.out.println(date1);
            date2=str.parse("2022-06-04");
            System.out.println(date2);
            System.out.println(date1.getTime()-date2.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //两个日期相减得到毫秒数
        System.out.println(Math.abs(date1.getTime()-date2.getTime())/(24*60*60*1000));

    }
}
