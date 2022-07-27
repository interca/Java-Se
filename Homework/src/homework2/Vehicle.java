package homework2;

public class Vehicle {
    private double speed;
    public  int power;
       public void speedUp(int s) {
            speed=s+speed;
        }
        public void speedDown(int d) {
            if(speed-d>=0)speed=speed-d;
            else  speed=0;
        }
        public void setPower(int p) {
            power=p;
        }
       public int getPower() {
         return power;
        }
        public double getSpeed() {
            return speed;
        }

}
