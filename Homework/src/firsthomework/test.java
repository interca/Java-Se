package firsthomework;

public class test {
    public static void main(String[] args) {
        int line=0,row=0;
        int i=0,j=0;
        char [][] str={
                {'*'},
                {'*','*','*'},
                {'*','*','*','*','*'},
                {'*','*','*','*','#','*','*'}
               };
         for(char[] k:str){
             j=0;
             for(char s:k){
                 System.out.print(s);
                 if(s=='#'){
                     line=i;
                     row=j;
                 }
                 j++;
             }
             i++;
             System.out.print("\n");
         }
        System.out.println("line is:"+line+",row is:"+row);
    }
}
class test22{
    public static void main(String[] args) {
        may[] p=new may[100] ;
    }
}
interface may{
    void print();
}