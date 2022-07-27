package weiming;

public class Student extends Person {
 private String number;
 private  String classroom;
    public Student(int age, String name, String collegue, String major,String number,String classroom) {
        super(age, name, collegue, major);
        this.classroom=classroom;
        this.number=number;
    }
    @Override
    public String toString() {
        return "姓名："+super.getName()+",年龄："+
                super.getAge()+"专业："
                +super.getMajor()+"年级："+
                super.getCollegue()+
                "，学号:"+number+",教室："+classroom;

    }
}
