package test1;

import java.util.Comparator;

public class compator implements Comparator {

    @Override
    //按照日期年月日进行排序
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Employee&&o2 instanceof Employee){
            Employee p1=(Employee)o1;
            Employee p2=(Employee) o2;
            if(p1.birthday.getYear()== p2.birthday.getYear()){
                if(p1.birthday.getMonth()==p2.birthday.getMonth()){
                    return Double.compare(p1.birthday.getDay(),p2.birthday.getDay());
                }else {
                    return Double.compare(p1.birthday.getMonth(),p2.birthday.getMonth());
                }
            }else{
                return Double.compare(p1.birthday.getYear(),p2.birthday.getYear());
            }
        }else{
            throw  new RuntimeException("错误");
        }
    }
}
