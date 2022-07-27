package algorithm;

public class KMPvolient {
    public boolean findsame(String s1,String s2){
        char []num1=s1.toCharArray();
        char[]num2=s2.toCharArray();
        int i=0;
        int j=0;
        while(i<s1.length()&&j<s2.length()){
            if(num1[i]==num2[j]){
                i++;
                j++;
            }else {
                j=0;
                i=i-j+1;
            }
        }
        if(j==s2.length())return true;
        return false;
    }
    public static void main(String[] args) {
        KMPvolient p=new KMPvolient();
       var flag=p.findsame("一加一等于几一加一等于二是是","一加一等于二百");
        System.out.println(flag);
    }
}
