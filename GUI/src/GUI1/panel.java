package GUI1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panel {
    public static void main(String[] args) {
        Frame frame=new Frame("sceond");
        //布局
        Panel panel=new Panel();
        //设置布局
        frame.setLayout(null);
        //位置大小
        frame.setBounds(300,300,500,500);
        //背景
        frame.setBackground(Color.black);
        //设置坐标
        panel.setBounds(50,50,400,400);
        panel.setBackground(Color.green);
        frame.add(panel);
        frame.setVisible(true);
        //监听器，退出窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }
}
