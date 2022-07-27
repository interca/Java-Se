package Enums;
///自定义枚举类
//enum关键字定义枚举类
public class enum1 {
    public static void main(String[] args) {
      System.out.println(season.spring.getSeasondesc());
       season p=season.summer;
        System.out.println(p);
    }
}
class season{
    private  final String seasonname;
    private  final String seasondesc;
    //私有化构造器,并且给初始变量赋值
    private season(String seasonname,String seasondesc){
         this.seasondesc=seasondesc;
         this.seasonname=seasonname;
    }
    public static final season spring=new season("春天","春暖花开");
    public static final season summer=new season("夏天","冲浪");
    public static final season autom=new  season("秋天","看落叶");
    public static final season winter=new season("冬天","冷死");

    public String getSeasondesc() {
        return seasondesc;
    }

    public String getSeasonname() {
        return seasonname;
    }

    @Override
    public String toString() {
        return "season{" +
                "seasonname='" + seasonname + '\'' +
                ", seasondesc='" + seasondesc + '\'' +
                '}';
    }
}
