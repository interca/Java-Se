package weiming;

public class show {
    public static void main(String[] args) {
    Weather weather1=new Weather(new todaynoon());
    Weather weather2=new Weather(new todaynight());
    Weather weather3=new Weather(new tomorrownoon());
    Weather weather4=new Weather(new tomorrownight());
    weather1.show();
    weather2.show();
    weather3.show();
    weather4.show();
    }
}
