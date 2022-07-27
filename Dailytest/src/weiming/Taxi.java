package weiming;

public class Taxi {
    private double oil;
    private   double mileage;
    private double money;
    public double remil(){
       return mileage;
    }
    public void addOil(double oil){
        this.oil=this.oil+oil;
        mileage=oil/1.5+mileage;//得到剩余里程
    }
}
