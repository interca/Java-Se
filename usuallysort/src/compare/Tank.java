package compare;
// Tank类有一个double类型的变量speed,用于刻画坦克的速度；
//   一个int型变量bulletAmount,用于刻画坦克的炮弹数量。
//Tank 类定义了speedUp(）和speedDown(）方法，体现坦克有加速、减速行为；
// 定义了setBulletAmount(int p)方法，用于设置坦克炮弹的数量；定义了fire(）方法，
// 体现坦克有开炮行为。
public class Tank {
    private  double speed;//坦克速度
    private  int bulletAmount;//炮弹数量

    public void speedUp(int s){  //加速
         this.speed=speed+s;
    }
    public void speedDown(int d){ //减速
        if(speed-d<=0)speed=0;
        else {
            speed=speed-d;
        }
    }
    public void setBulletAmount(int p){//设置炮弹数量
          this.bulletAmount=p;
    }
    public void fire(){  //开炮行为
    if(bulletAmount>=1){
        System.out.println("打出一发炮弹");
        bulletAmount=bulletAmount-1;
       }else{
        System.out.println("没有炮弹，无法开火");
    }
    }
    public int getBulletAmount(){//返回炮弹数量
        return bulletAmount;
    }

    public double getSpeed() {//返回速度
        return speed;
    }
}
