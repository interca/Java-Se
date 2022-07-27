package homework4;

import java.awt.*;

public class Moon {
    public static void main(String[] args) {
      new myframe().load();
    }
}
class myframe extends Frame{
   public void load(){
       this.setBounds(200,200,600,500);
       this.setVisible(true);
       this.setBackground(Color.black);
   }
   @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillOval(70,70,150,150);
        g.setColor(Color.black);
        g.fillOval(100,100,150,150);
    }
}
