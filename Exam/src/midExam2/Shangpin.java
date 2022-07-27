package midExam2;

public class Shangpin {
    private String num;//货物编号
    private String name;//货物名称

    //有参构造器
    public Shangpin(String num, String name) {
        this.num = num;
        this.name = name;
    }

    //空参构造器
    public Shangpin() {

    }

    //返回编号
    public String getNum() {
        return num;
    }

    //设置编号
    public void setNum(String num) {
        this.num = num;
    }

    //放回名字
    public String getName() {
        return name;
    }

    //设置名字
    public void setName(String name) {
        this.name = name;
    }

    //tostring方法
    @Override
    public String toString() {
        return "货物号码='" + num + '\'' +
                ", 货物名称='" + name + '\'';
    }
    //重写equals方法
    public boolean equals(String a){
        return a.compareTo(this.num)==0;
    }
}
