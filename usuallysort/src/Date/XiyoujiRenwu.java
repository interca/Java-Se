package Date;

public class XiyoujiRenwu {
 private String name="沙僧";
 private double height;
 private double weight;
 private  String head;
 public void speak(String a){
     System.out.println(a);
 }
    public static void main(String args[]){
        XiyoujiRenwu shaseng = null;
        shaseng=new XiyoujiRenwu();
        shaseng.name="沙僧";
        shaseng.height=1.78f;
        shaseng.weight=89f;
        shaseng.head="僧头";
        System.out.println(shaseng.name+"的身高"+shaseng.height);
        System.out.println(shaseng.name+"的体重"+shaseng.weight);
        System.out.println(shaseng.name+"的头"+shaseng.head);
        shaseng.speak(shaseng.name+"我想娶媳妇");
        System.out.println(shaseng.name+"现在的头:"+shaseng.head);
    }
}
