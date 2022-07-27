package homework3;

public class Teacher extends Employee implements PerformanceCalculation {
    private double teachingLoad;//教学工作量
    private double researchLoad;//科研工作量

    //构造器
    public Teacher(String number, String name, String sex,
                   String birthday, String professionalTitles,
                   double teachingLoad,double researchLoad) {
        super(number, name, sex, birthday, professionalTitles);
        this.teachingLoad=teachingLoad;
        this.researchLoad=researchLoad;
    }

    public void doTeaching(){
        System.out.println("教学");
     }
     public void doReSearch(){
         System.out.println("做科研");
     }
    //(教学工作量-320)/320+（科研工作量-75）/75
    @Override
    public double doPerformanceCalculation() {

        return (teachingLoad-320)*1.0/(320+(researchLoad-75))/75;
    }

    @Override
    public String getString(double pformance) {
        return super.toString()+"教学工作量："+teachingLoad+"科研工作量："+
                researchLoad+"绩效："+pformance;
    }
}
