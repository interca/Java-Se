package homework2;

public class AmericanPeople extends People {
    //重写public void speakHello()方法，输出"How do you do"
    // 重写public void averageHeight()方法，输出"American's average height:176 cm"
    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight:"+weight+" kg");
    }
    public void americanBoxing() {
        System.out.println("直拳、钩拳、组合拳");
    }
    public  void speakHello(){
        System.out.println("How do you do");
    }
    public void averageHeight(){
        System.out.println("American's average height:176 cm");
    }
}