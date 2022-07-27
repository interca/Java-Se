package thread1;
enum Fruit{
    梨, 苹果,香蕉,芒果,葡萄
}
public class Example3_10 {
    public static void main(String[] args) {
         double price=0;
         boolean show=false;
         for(Fruit fruit:Fruit.values()){
              show=false;
             switch(fruit){
                 case  梨 :
                     price=8.7;show=true;break;
                 case 葡萄:
                     price=4.5;show=true;break;
                 case 芒果:
                     price=1.5;show=true;break;
             }
             if(show){
                 System.out.println(fruit+"五百克价格为"+price+"元");
             }
         }
    }
}
