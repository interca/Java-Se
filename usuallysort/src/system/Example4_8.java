package system;

public class Example4_8 {
    public static void main(String[] args) {
        Ladder.down=100;
        Ladder.H=500;
        Ladder ladderOne=new Ladder();
        Ladder ladderTwo=new Ladder();
        ladderOne.setUpper(28);
        ladderTwo.setUpper(66);

        System.out.println("ladderOne的上底："+ladderOne.getUpper());
        System.out.println("ladderOne的下底："+ladderOne.getDown());
        System.out.println("ladderTwo的上底："+ladderTwo.getUpper());
        System.out.println("ladderTwo的下底："+ladderTwo.getDown());

        System.out.println("ladderOne的面积是："+ladderOne.calculate());
        System.out.println("ladderTwo的面积是："+ladderTwo.calculate());

    }

}
