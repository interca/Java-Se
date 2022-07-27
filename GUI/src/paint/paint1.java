package paint;

import java.awt.*;

public class paint1 {
    //画笔
    public static void main(String[] args) {
      new paint().loadFrame();
    }
}
class paint extends Frame{
    //画笔
    public  void paint(Graphics paint){
        paint.setColor(Color.black);
         paint.drawOval(100,100,100,100);
    }
    public  void loadFrame(){
        setVisible(true);
        setBounds(200,200,400,400);

    }
}
