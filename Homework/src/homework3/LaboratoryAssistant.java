package homework3;

public class LaboratoryAssistant extends Employee implements PerformanceCalculation {
    private double expeLoad;//实验工作量
    private double researchLoad;//科研工作量

    //构造器
    public LaboratoryAssistant(String number, String name, String sex,
                   String birthday, String professionalTitles,
                   double expeLoad,double researchLoad) {
        super(number, name, sex, birthday, professionalTitles);
        this.expeLoad=expeLoad;
        this.researchLoad=researchLoad;
    }

    //(实验工作量-240)/240+（科研工作量-75）/75
    @Override
    public double doPerformanceCalculation() {
        return (expeLoad-240)/240+(researchLoad-75)/75;
    }

    @Override
    public String getString(double pformance) {
        return super.toString()+"实验工作量："+expeLoad+"，科研工作量:"+
                researchLoad+",绩效："+pformance;
    }
}
