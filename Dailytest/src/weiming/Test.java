package weiming;

public class Test {
    public static void main(String[] args) {
       CPU cpu=new CPU();
       cpu.setSpeed(2220);
       HardDisk disk=new HardDisk();
       disk.setamount(200);
       PC pc=new PC();

       pc.setCpu(cpu);
       pc.setHD(disk);

        System.out.println(pc.show());
    }
}
