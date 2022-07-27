package system;

public class Ladder {
    //定义静态成员变量
    static  double H;//高
    static  double down;//下底

    private double S,upper;//面积

    public double getDown() {
        return down;
    }

    public double getUpper() {
        return upper;
    }

    public static void setDown(double down) {
        Ladder.down = down;
    }

    public  void setUpper(double upper) {
       this.upper = upper;
    }
    public double calculate(){
        return (upper+down)*H/2;
    }
}
