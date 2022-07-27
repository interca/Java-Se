package firsthomework;

public class likou {
    public static void main(String[] args) {
        int i=21;
        int  imprise=1;
        int  x=i;
        while(x>0)
        {
            int w=x%10;
            System.out.println(x);
            if (x %10==0) {
                imprise = 0;
                break;
            }
            if (x != 0 && i % x != 0) {
                imprise = 0;
                break;
            }
            x = x / 10;
        }
        System.out.println(imprise);
    }
}
