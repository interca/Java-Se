package thread1;

public class Tom {
    static int x;
    static int y;
    void showXY(){
        System.out.printf("%d,%d\n",x,y);
    }
    static void showY(){
        System.out.printf("%d\n",y);
    }
}

class E{
    public static void main(String aqgs[]){
        Tom.y = 100;
        Tom cat = new Tom();
        cat.x = 100;
        cat.y =200;
        Tom.x =300;
        cat.showXY();
        Tom.showY();
    }
}