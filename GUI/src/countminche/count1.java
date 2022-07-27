package countminche;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class count1 {
    //计算器
    public static void main(String[] args) {
       caclaute p=new caclaute();
    }
}
//计算器类
class caclaute extends Frame{
    public  caclaute(){
      //三个文本框
        TextField textField1=new TextField(10);
        TextField textField2=new TextField(10);
        TextField textField3=new TextField(20);
        Button button=new Button("=");
        //监听事件
        button.addActionListener(new Actionlisten(textField1,textField2,textField3));
        Label label=new Label("+");
        //流失布局
        this.setLayout(new FlowLayout());
        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);
        pack();
        setVisible(true);
    }
}
//监听器类
class  Actionlisten implements ActionListener{
    public TextField textField1;
    public  TextField textField2;
    public  TextField textField3;
    public  Actionlisten(TextField textField1,TextField textField2,TextField textField3){
         this.textField1=textField1;
         this.textField2=textField2;
         this.textField3=textField3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取文本
      int num1=Integer.parseInt(textField1.getText());
      int num2=Integer.parseInt(textField2.getText());
      textField3.setText(num1+num2+"");
      textField1.setText("");
      textField2.setText("");
    }
}
