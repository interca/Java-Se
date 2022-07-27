package reflection2;
@MyAnnotation(value ="nihao1")
public class Person extends Creatrue<String> implements Comparable<String>,myinterface{
    private String name;
     int age;
     public int id;
     public Person(){

     }
    @MyAnnotation(value ="ni")
    private Person(String name){
         this.name=name;
     }

     Person(String name,int age){
          this.name=name;
          this.age=age;
     }
    @MyAnnotation
    private String  show(String nation){
         System.out.println("my nation is"+nation);
         return nation;
     }
     public String dispaly(String interests){
         return interests;
     }
    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("im a person");
    }
}
