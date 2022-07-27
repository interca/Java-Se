package GUI1;

import java.awt.*;

public class myframe extends Frame {
    static int id=0;//初始化
    //窗口一些参数,长宽和位置
    public myframe(int x,int y,int w,int h,Color color){
        super("my frame id is:"+(++id));
        setBounds(x,y,w,h);//设置四个参数
        setVisible(true);
        setBackground(color);
    }

    public static void main(String[] args) {
        myframe frame=new myframe(10,20,400,400,Color.blue);
        myframe frame2=new myframe(100,20,100,100,Color.yellow);
        myframe frame3=new myframe(30,500,400,400,Color.red);
    }

}
