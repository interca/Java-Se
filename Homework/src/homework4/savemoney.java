package homework4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class savemoney {
    //存款日期
    static Date predate;
    //取款日期
    static Date lastdate;
    static double rate;
    static int money;

    public static double getmoney(){
       long day=(lastdate.getTime()-predate.getTime())/(24*60*60*1000);
        System.out.println(day);
       return money*rate*day;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat str = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输入本金和利率");
        money= in.nextInt();
        rate= in.nextDouble();
        System.out.println("分别输入存款日期和取款日期");
        while (true) {
            try {
                predate = str.parse(in.next());
                lastdate = str.parse(in.next());
                break;
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(lastdate);
        System.out.println(predate);
        System.out.println("利息是:"+getmoney());
    }
}
