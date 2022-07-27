package reflection3;

import org.testng.annotations.Test;
import reflection2.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class methed {
    //获取方法
    public static void main(String[] args) {
        Class clazz= Person.class;
        Method []f1=clazz.getMethods();
        //获得自己和父类public的方法
        for(Method m:f1){
            System.out.println(m);
        }
        System.out.println("------------------");
        Method[]f2=clazz.getDeclaredMethods();
        for(Method m:f2){
            System.out.println(m);
        }
    }
    //获取方法的属性。包括注解，返回类型，参数
    @Test
    public void test(){
        Class clazz=Person.class;
        Method []method=clazz.getDeclaredMethods();
        for(Method f:method){
            //注解
            Annotation[]annotations=f.getAnnotations();
            for(Annotation a:annotations){
                System.out.println(a);
            }
            //修饰符
            System.out.print(Modifier.toString(f.getModifiers())+" ");
            //返回值类型
            System.out.print(f.getReturnType()+" ");
            //方法名字
            System.out.print(f.getName()+"(");
            //参数
            Class[] can=f.getParameterTypes();
            if(can!=null&&can.length!=0){
                for(Class p:can){
                    System.out.print(p.getName()+" ");
                }
            }
            System.out.print(")");
            System.out.println("");
        }
    }
}
