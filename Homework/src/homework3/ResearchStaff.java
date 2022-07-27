package homework3;

public class ResearchStaff extends Employee implements PerformanceCalculation{
    private double researchLoad;//科研工作量

    //构造器
    public ResearchStaff(String number, String name, String sex,
                         String birthday, String professionalTitles,
                         double researchLoad) {
        super(number, name, sex, birthday, professionalTitles);
        this.researchLoad=researchLoad;
    }


    public void doReSearch(){
        System.out.println("做科研");
    }

    //（科研工作量-400）/400
    @Override
    public double doPerformanceCalculation() {
        return (researchLoad-400)*1.0/400;
    }

    @Override
    public String getString(double pformance) {
       return super.toString()+"科研工作量："+researchLoad+"绩效:"+pformance;
    }
}
