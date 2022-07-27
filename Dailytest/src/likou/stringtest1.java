package likou;

import java.util.Arrays;

public class stringtest1 {
    public static void main(String[] args) {
        String s="au";

        int n=s.length();
        String str="";
        int max=1;
        int count=1;
        for(int i=0;i<n;i++){
            count=1;
            str=""+s.charAt(i);
            for(int j=i+1;j<n;j++){
                System.out.println(s.charAt(j));
                if(str.contains(""+s.charAt(j))==false){
                    str=str+(""+s.charAt(j));
                    count++;
                }else {
                    break;
                }
            }
            if(count>max)max=count;
        }
        System.out.println(max);
    }
}
class teststring{
    public static void main(String[] args) {
        int k=10;
        String s="01234567890";
        while(s.length()>k) {
            int n = s.length();
            int n2;
            if (n % k == 0) {
                n2 = n / k;
            } else {
                n2 = n / k + 1;
            }
            int index = 0;
            String str = "";
            String[] num = new String[n2];
            for (int i = 0; i < n; i++) {
                str = str + s.charAt(i);
                if ((i + 1) % k == 0 || i == n - 1) {
                    num[index++] = str;
                    str = "";
                }
            }
            String s1="";
            System.out.println(Arrays.toString(num));
            for(int i=0;i<num.length;i++){
                 int sum=0;
                for(int j=0;j<num[i].length();j++){
                    sum=Integer.parseInt(num[i].charAt(j)+"")+sum;
                }
                num[i]=""+sum;
                s1=s1+num[i];
            }
            System.out.println(Arrays.toString(num));
              s=s1;
        }
        System.out.println(s);
    }
}
