package weiming;

public class Employee {
    String number;
    String name;
    int sex;
    String birthday;
    String professionalTitles;

    public Employee(String number,String name,int sex, String birthday, String professionalTitles){
        this.number=number;
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        this.professionalTitles=professionalTitles;
    }
}
interface PerformanceCalculation2{
    double doPerformanceCalculation();
    String getString(double pformance);
}
 class Teacher1 extends Employee implements PerformanceCalculation2{
    private double teachingLoad;
    private double researchLoad;
    public Teacher1(String number, String name, int sex, String birthday,
                   String professionalTitles,double teachingLoad,double researchLoad) {
        super(number, name, sex, birthday, professionalTitles);
        this.teachingLoad=teachingLoad;
        this.researchLoad=researchLoad;
    }
    public void doTeaching() {
        System.out.println();
    }
    public void doReSearch() {
        System.out.println();
    }
    public double doPerformanceCalculation(){
        return (teachingLoad-320)/320+(researchLoad-75)/75;
    }
    @Override
    public String getString(double pformance) {
        // TODO Auto-generated method stub
        return null;
    }
}