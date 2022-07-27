package reflection1;

import org.testng.annotations.Test;

public class Class1 {
    //获取Class实例
    @Test
    public void test1() throws ClassNotFoundException {
        //方式一,调用运行时类属性
       Class<Person> clazz1=Person.class;
      //方式二,调用运行时类的对象，调用方法
        Person p1=new Person("huang",12);
        Class clazz2=p1.getClass();
        //方式三
        Class clazz3=Class.forName("reflection1.Person");
        System.out.println(clazz3);
        //方式四，类的加载器
        ClassLoader classLoader=Class1.class.getClassLoader();
        Class clazz4=classLoader.loadClass("reflection1.Person");
        System.out.println(clazz4==clazz1);
    }
}
