package weiming;

public class Person {
   private int age;
   private String name;
   private String collegue;
   private  String major;

    public Person(int age, String name,String collegue,String major) {
        this.age = age;
        this.name = name;
        this.collegue=collegue;
        this.major=major;

    }
    public int getAge() {
        return age;
    }

    public String getCollegue() {
        return collegue;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }


}
