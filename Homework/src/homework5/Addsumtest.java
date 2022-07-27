package homework5;

public class Addsumtest {
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
           Addsum addsum=new Addsum();
           addsum.start=i*10+1;
           addsum.start();
       }
       while(Addsum.flag!=10){

       }
        System.out.println("总和为："+Addsum.sum);
    }
}
