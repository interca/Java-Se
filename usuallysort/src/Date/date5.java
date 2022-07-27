package Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class date5 {
    public static void main(String[] args) {
        //now获取当前日期或者时间
        LocalDate time1=LocalDate.now();
        LocalTime time2=LocalTime.now();
        LocalDateTime time3= LocalDateTime.now();
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        //of方法来调

        System.out.println("--------------------------------");
        //设定指定年月日
        LocalDateTime t=LocalDateTime.of(2022,3,17,12,12,12);//2022,3,17
        System.out.println(t);
        System.out.println("----------------------------------------------");
        ///get
        System.out.println(t.getDayOfMonth());
        System.out.println(t.getMonth());
        System.out.println(t.getMonthValue());
        System.out.println(t.getDayOfWeek());
        System.out.println("-----------------------------");
        //with 设置
        LocalDateTime t2= t.withMonth(2);///本身不变，放回一个改变的值
        System.out.println(t);
        System.out.println(t2);
        System.out.println("-----------------------------------");
        //add添加减少
        LocalDateTime t3=t.plusMonths(5);//加
        System.out.println(t);
        System.out.println(t3);
        t3= t3.minusMonths(3);//减
        System.out.println(t3);
        System.out.println("------------------------------");
        //instant方法
        Instant i=Instant.now();//差标准时间1八小时
        System.out.println(i);
    }
}
