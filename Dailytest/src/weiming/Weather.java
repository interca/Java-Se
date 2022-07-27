package weiming;

public class Weather {
    WeatherState state;
    public  Weather(WeatherState state){
        this.state=state;
    }
    public  void show(){
        state.showState();
    }
}
class todaynoon implements WeatherState{

    @Override
    public void showState() {
        System.out.println("今天白天多云有时阴");
    }
}
class todaynight implements WeatherState{

    @Override
    public void showState() {
        System.out.println("今天夜间小雨转大雨");
    }
}
class tomorrownight implements  WeatherState{

    @Override
    public void showState() {
        System.out.println("明天夜间小雨，有时晴");
    }
}
class  tomorrownoon implements WeatherState{

    @Override
    public void showState() {
        System.out.println("明天白天小雨");
    }
}
