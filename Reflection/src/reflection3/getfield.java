package reflection3;

import org.testng.annotations.Test;
import reflection2.Person;

import java.lang.reflect.Field;

public class getfield {
    @Test
    public void test() throws Exception {
        Class clazz=Person.class;
        Person p=(Person) clazz.newInstance();
        Field id=clazz.getField("id");
        id.set(p,10001);
        System.out.println(id.get(p));

    }
}
