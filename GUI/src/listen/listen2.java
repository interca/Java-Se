package listen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listen2 {
    public static void main(String[] args) {
     creatFrame p=new creatFrame(new Frame());
    }
}
class creatFrame extends Frame{
    public creatFrame(Frame frame){
        Mylisten2 p=new Mylisten2();
        TextField textField=new TextField();
        textField.addActionListener(p);
        this.add(textField);
        this.setVisible(true);
        this.pack();
    }
}
class Mylisten2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
