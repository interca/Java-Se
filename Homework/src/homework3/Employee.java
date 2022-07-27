package homework3;

public class Employee {
    private String number;
    private String name;
    private String sex;
    private String birthday;
    private String professionalTitles;//职称

    //构造器
    public Employee(String number, String name, String sex,
                    String birthday, String professionalTitles) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.professionalTitles = professionalTitles;
    }

    @Override
    public String toString() {
        return
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", professionalTitles='" + professionalTitles + '\'';

    }
}
