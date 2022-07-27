package compare;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int x=123;
        int count=0;
        int a=x;
        int i,j;
        while(a>0){
            a=a/10;
            count++;
        }
        int []num=new int[count];
        for(i=0;i<count;i++){
            num[i]=x%10;
            x=x/10;
        }
        System.out.println(Arrays.toString(num));
    }
}
