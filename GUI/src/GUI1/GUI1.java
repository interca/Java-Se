package GUI1;

import java.awt.*;

//Gui第一个界面
public class GUI1 {
    public static void main(String[] args) {
        Frame frame=new Frame("first");
        frame.setVisible(true);//可见性
        //设置长宽
        frame.setSize(400,400);
        //设置背景颜色
        frame.setBackground(new Color(164, 49, 37, 60));
        //窗口初始位置
        frame.setLocation(200,200);
        //能否改变窗口大小
        frame.setResizable(false);
    }
}
