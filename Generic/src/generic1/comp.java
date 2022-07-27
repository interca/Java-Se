package generic1;

import java.util.Comparator;

public class comp implements Comparator<Employe> {
    @Override
    //员工先按姓名再按年龄从小到大排序
    public int compare(Employe o1, Employe o2) {
        if(o1.getName().equals(o2.getName())){
            return Double.compare(o1.getAge(),o2.getAge());
        }else{
            return o1.getName().compareTo(o2.getName());
        }
    }
}
