package Map;

import java.util.Comparator;

public class copare implements Comparator {
    //先按姓名，再按年龄
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof people&&o2 instanceof people){
            people p1=(people) o1;
            people p2=(people) o2;
            if(p1.getName().equals(p2.getName())){
                return Double.compare(p1.getAge(),p2.getAge());
            }else{
                return p1.getName().compareTo(p2.getName());
            }
        }else{
            throw new RuntimeException("类型错误");
        }

    }
}