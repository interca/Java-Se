package firsthomework;

public class test2 {
    public static void main(String[] args) {
         int x=2147483647;
        System.out.println();
        System.out.println(x);
        int i;
        for(i=0;i<x;i++){
           if(i==46340)System.out.println("i*i="+i*i+"(i+1)*(i+1)="+Math.abs((i+1)*(i+1))+"i="+i);
            if(i*i<=x&&(long)(i+1)*(i+1)>x){
                break;
            }
        }
        System.out.println(i);
        String s="()[]{}";
        int n=s.length();
        for( i=0;i<n;i++){
            System.out.println(s.contains("()"));
            s=s.replace("{}","");
            s=s.replace("()","");
            s=s.replace("[]","");
        }
        System.out.println(s);


    }
}
