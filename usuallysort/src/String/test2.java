package String;
//寻找两个字符串中最大相同子串
public class test2 {
    public  String test(String a,String b){
        String max;
        String min;
        if(a.length()>b.length()) {
            max = a;
            min = b;
        }else{
            max=b;
            min=a;
        }
        int i;
        int x,y;
        int length=min.length();
        for(i=0;i<length;i++){
            for(x=0,y=length-i;y<=length;x++,y++){
               String str=min.substring(x,y);
                if(max.contains(str)){
                    return str;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
       test2 p= new test2();
       String p2=p.test("abcdefgabcdefgeh","afcdefabcdefghe");
       System.out.println(p2);
    }
}
