package reflection1;

import org.testng.annotations.Test;

import java.util.Random;

public class newinstance {
    //通过反射创建运行时类的对象
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz1=Person.class;
        //调用了空参构造器，必须要在类里面声明，而且不能是private
        Person object1=clazz1.newInstance();
        System.out.println(object1);
    }
    @Test
    public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       int num=new Random().nextInt(3);
       String str="";
       switch (num){
           case 1:str="java.util.Date";break;
           case 2:str="java.sql.Date";break;
           case 3:str="reflection1.Person";break;
       }
        System.out.println(getInstance(str));
    }
    //创建指定类的对象
    public Object getInstance(String path) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       Class clazz=Class.forName(path);
       return clazz.newInstance();

    }
}
