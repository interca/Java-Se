package reflection3;

import reflection2.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class field {
    public static void main(String[] args) {
        Class clazz1= Person.class;
        //获取属性,自己和父类中public
        Field[]field=clazz1.getFields();
        for(Field f:field){
            System.out.println(f);
        }
        System.out.println("----------------------");
        //自己类中声明的变量,继承的不算
        Field[] field2=clazz1.getDeclaredFields();
        for(Field f:field2){
            System.out.println(f);
        }
        System.out.println("-----------------------");
        for(Field f:field2){
            //1获取权限修饰符
            int mid=f.getModifiers();
            System.out.print(Modifier.toString(mid)+" ");
            //获取数据类型
            Class type=f.getType();
            System.out.print(type.getName()+" ");
            //获取变量名字
            System.out.println(f.getName());
        }
    }
}
