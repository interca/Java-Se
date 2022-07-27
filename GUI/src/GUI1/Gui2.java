package GUI1;

import java.awt.*;

public class Gui2 {
    public static void main(String[] args) {
        Frame frame=new Frame("1");
        frame.setLayout(new GridLayout(2,1));
        Panel p1=new Panel(new BorderLayout());
        Panel p2=new Panel(new GridLayout(2,1));
        Panel p3=new Panel(new BorderLayout());
        Panel p4=new Panel(new GridLayout(2,2));
        p1.add(new Button("east"),BorderLayout.EAST);
        p1.add(new Button("west"),BorderLayout.WEST);
        p2.add(new Button("up"));
        p2.add(new Button("down"));
        p1.add(p2,BorderLayout.CENTER);

        p3.add(new Button("west2"),BorderLayout.WEST);
        p3.add(new Button("East"),BorderLayout.EAST);
        p4.add(new Button("up1"));
        p4.add(new Button("down1"));
        p4.add(new Button("up2"));
        p4.add(new Button("down2"));
        p3.add(p4,BorderLayout.CENTER);
        frame.add(p1);
        frame.add(p3);
        frame.setVisible(true);
        frame.setBackground(Color.yellow);
        frame.setBounds(200,200,300,300);
    }
}
