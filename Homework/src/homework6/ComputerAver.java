package homework6;
public class ComputerAver extends DoThing {
    DoThing nextDoThing ;
    public void setNext(DoThing next) {
        nextDoThing = next;
    }
    public void doThing(double [] a) {
        double sum = 0;
        System.out.println(a.length);
        for(int i=0;i<a.length;i++)
            sum = sum+a[i];
        double aver = sum/a.length;
        System.out.print("选手最后得分"+aver);
    }
}
