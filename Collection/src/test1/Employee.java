package test1;

public class Employee implements Comparable{
    private  String  name;
    private int age;
    MyDate birthday;
    @Override
    //按照name进行排序,name,一样就按照年龄排序
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee p=(Employee)o;
           if(this.name.equals(p.getName())){
               return Double.compare(this.age,p.getAge());
           }
           else{
               return this.name.compareTo(p.getName());
           }
        }else {
            throw new RuntimeException("类型错误");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public Employee(String name, int age, MyDate birthday){
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return birthday != null ? birthday.equals(employee.birthday) : employee.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }
}

