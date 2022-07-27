package reflection1;

import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//反射使用
public class reflectiontest {
   @Test
   //反射前
   public void test(){
      Person p1=new Person("黄裕加",21);
      p1.age=100;
      System.out.println(p1);
      p1.show();
      System.out.println(p1.shownation("中国"));
   }
   //反射
   @Test
   public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
      Class p1=Person.class;
      //通过反射创建对象
      Constructor constructor=p1.getConstructor(String.class,int.class);
      Object object=constructor.newInstance("黄裕甲",12);
      System.out.println(object.toString());
      //调用属性
      Field age=p1.getDeclaredField("age");
      age.set(object,20);
      System.out.println(object);

      //调用方法
      Method show=p1.getDeclaredMethod("show");
      show.invoke(object);
      //反射可以调用私有结构
      Constructor constructor1=p1.getDeclaredConstructor(String.class);
      constructor1.setAccessible(true);
      Object object1=constructor1.newInstance("雪皇");
      System.out.println(object1);
      //调用私有属性
      Field name=p1.getDeclaredField("name");
      name.setAccessible(true);
      name.set(object1,"甲");
      System.out.println(object1);
      Method shownation=p1.getDeclaredMethod("shownation", String.class);
      shownation.setAccessible(true);
      shownation.invoke(object,"中国");

   }
}
