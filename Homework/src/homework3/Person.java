package homework3;

public class Person {
    private int age;
    private int sex;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IleageAgeException {
       if(age>150||age<1){
           IleageAgeException p=new IleageAgeException();
           throw p;
       }
       else {
           this.age=age;
       }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
