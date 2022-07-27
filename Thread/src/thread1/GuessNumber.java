package thread1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        int realNumber=random.nextInt(100)+1;//随机生成一个零到一百的整数
        int yourGuess=-1;
        System.out.println("输入您的猜测");

        while(yourGuess!=realNumber){
               yourGuess=in.nextInt();
              if(yourGuess>realNumber){
                  System.out.println("猜大了，请再次输入你的猜测：");
              }else if(yourGuess<realNumber){
                  System.out.println("猜小了，请再次输入你的猜测");
            }else {
                  System.out.println("恭喜你猜对了");
              }
        }
    }
}
