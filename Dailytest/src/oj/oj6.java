package oj;

import java.util.Scanner;

public class oj6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s= in.next();
        if(s.length()<"hello".length()) System.out.println("NO");
        else {
            int sum=0;
            char[]a={'h','e','l','l','o'};
            int index=0;
            for(int i=0;i<s.length();i++){
                if(a[index]==s.charAt(i)){
                    index++;
                    sum++;
                }
                if(sum==5)break;
            }
            if(sum==5) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
