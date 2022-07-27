package homework3;

public class CheckCarWeight {
    public static void main(String args[]) {
        ComputerWeight[] goods=new ComputerWeight[650]; //650件货物
        for(int i=0;i<goods.length;i++) { //简单分成三类
            if(i%3==0)
                goods[i]=new Television();
            else if(i%3==1)
                goods[i]=new computer();
            else if(i%3==2)
                goods[i]=new WashMachine();
        }
        Truck truck=new Truck(goods);
        System.out.printf("\n货车装载的货物重量:%-8.5f kg\n",truck.getTotalWeights());
        goods=new ComputerWeight[68]; //68件货物
        for(int i=0;i<goods.length;i++) { //简单分成两类
            if(i%2==0)
                goods[i]=new Television();
            else
                goods[i]=new WashMachine();
        }
        truck.setGoods(goods);
        System.out.printf("货车装载的货物重量:%-8.5f kg\n",truck.getTotalWeights());
    }
}

class Television implements ComputerWeight {
    @Override
    public double computeWeight() {
        return 1;
    }

}
class computer implements ComputerWeight {
    @Override
    public double computeWeight() {
        return 1;
    }

}
class WashMachine implements ComputerWeight {
    @Override
    public double computeWeight() {
        return 1;
    }

}
class Truck {
    ComputerWeight [] goods;
    double totalWeights=0;
    Truck(ComputerWeight[] goods) {
        this.goods=goods;
    }
    public void setGoods(ComputerWeight[] goods) {
        this.goods=goods;
    }
    public double getTotalWeights() {
        totalWeights=0;
        for(int i=0;i<goods.length;i++){
            totalWeights=totalWeights+goods[i].computeWeight();
        }
        return totalWeights;
    }
}
interface ComputerWeight {
    double computeWeight();
}