package weiming;

public class Teacher extends Person {
    private String jobnumber;
    private String teachclass;
    public Teacher(int age, String name, String collegue, String major, String jobnumber,String teachclass) {
        super(age, name, collegue, major);
        this.jobnumber=jobnumber;
        this.teachclass=teachclass;
    }

    @Override
    public String toString() {
        return "姓名："+super.getName()+",年龄："+
                super.getAge()+"专业："
                +super.getMajor()+"年级："+
                super.getCollegue()+
                ",工号:"+jobnumber+",教研室："+teachclass;

    }
}
