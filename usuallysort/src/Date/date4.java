package Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//Calendar类（抽象）
public class date4 {
    public static void main(String[] args) {
        //Calendar是抽象类，Cre是其子类，两种方法造对象是一样的
        Calendar date1=Calendar.getInstance();
        GregorianCalendar date= new GregorianCalendar();
        //get
        System.out.println(date.get(Calendar.DAY_OF_MONTH));//这个月第几天
        //set可以设置具体时间
        date.set(Calendar.DAY_OF_MONTH,22);///本身改变
        date.set(Calendar.YEAR,1920);
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
        //add
        date.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
          //gettime;//日历->Date类
        Date d=date.getTime();
        System.out.println(d);//获得当前天数距离1970年毫秒
        System.out.println(d.getTime());
        //settime   Date->日历类
        Date a=new Date();
        date.setTime(a);
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
    }
}
