package String;
//找出aaaaabbbdbababebcab中ab出现的次数
public class test {
    public int test1(String main,String b){
        int count=0;
        int index=0;
        int mainlength=main.length();
        int blength=b.length();
        if(mainlength>=blength){
            while((index=main.indexOf(b,index))!=-1){
                count++;
                index=index+blength;
            }
            return count;
        }
        else return 0;
    }
    public static void main(String[] args) {
          test p=new test();
          System.out.println(p.test1("abanananaab","aba"));
    }
}
