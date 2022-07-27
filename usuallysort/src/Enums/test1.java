package Enums;
//自定义枚举类
public class test1 {
    public static void main(String[] args) {
       sea p =sea.WINTER;
        System.out.println(p.getDesc());
        sea [] p1=sea.values();
        for(sea k:p1){
            k.run();
        }
        
    }
}
enum sea implements go{
    SPRING("春天", "春暖花开"){
        @Override
        public void run() {
            System.out.println("春天刷力扣");
        }
    },
    SUMMER("夏天", "游泳"){
        @Override
        public void run() {
            System.out.println("夏天游泳");
        }
    },
    WINTER("冬天", "冷死"){
        @Override
        public void run() {
            System.out.println("冬天睡觉");
        }
    };

    private final String name;
    private final String desc;

    sea(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "sea{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }



}
interface go{
    void run();
}