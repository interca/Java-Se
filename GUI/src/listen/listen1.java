package listen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class listen1 {
    public static void main(String[] args) {
        Button button=new Button("button1");
        Frame frame=new Frame();
         MyActionListener myActionListener=new MyActionListener();
         button.addActionListener(myActionListener);
         button.setBounds(200,200,20,20);
         frame.add(button,BorderLayout.CENTER);
         frame.setVisible(true);
         frame.setBounds(200,200,200,200);
        frame.setLayout(new FlowLayout());
         colsewindow(frame);
    }
    public static void colsewindow(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("你好");
    }
}
