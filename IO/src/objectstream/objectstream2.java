package objectstream;
import java.io.*;
//自定义类
//必须实现两个接口之一
public class objectstream2 {
    public static void main(String[] args) {
        ObjectOutputStream str1= null;
        try {
            str1 = new ObjectOutputStream(new FileOutputStream("iofile\\person.dat"));
            str1.writeObject(new person("黄裕甲",20));
            str1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(str1!=null)
                str1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        person p= null;
        ObjectInputStream str2=null;
        try {
            str2=new ObjectInputStream(new FileInputStream("iofile\\person.dat"));
            p = (person) str2.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(str2!=null)
                    str2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(p);
    }
}
//自定义person类
//自定义类想序列化，必须实现两个接口之一
class person implements Serializable {
    public static  final long serialVersionUID=426562526267L;//必须的
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}