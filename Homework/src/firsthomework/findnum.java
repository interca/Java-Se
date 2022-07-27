package firsthomework;

import java.util.Scanner;

public class findnum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int rand= (int) (Math.random()*100+1);
        int number;
        number=in.nextInt();
        while(true){
            if(rand>number){
                System.out.println("猜小了");
                number=in.nextInt();
            }else if(rand<number){
                System.out.println("猜大了");
                number=in.nextInt();
            }else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
