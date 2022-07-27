package GUI1;

import java.awt.*;

//流失布局
public class flowlayout {
    public static void main(String[] args) {
        Frame frame=new Frame();
        //组件按钮
        Button button1=new Button("button1");
        Button button2=new Button("button2");
        Button button3=new Button("button3");
        frame.setBounds(200,200,400,400);
        frame.setBackground(Color.yellow);
        frame.setVisible(true);
        //设置流失布局
        frame.setLayout(new FlowLayout());
        //添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

    }
}
