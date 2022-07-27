package weiming;

public class PC {
   CPU cpu=new CPU();
   HardDisk HD=new HardDisk();

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHD() {
        return HD;
    }

    public void setHD(HardDisk HD) {
        this.HD = HD;
    }
    public String show(){
        return "CPU速度是："+cpu.getSpeed()+",HD容量是"+ HD.getamount();
    }
}
