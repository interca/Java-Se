package homework5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ThreadFrame extends JFrame implements ActionListener {
    JTextField showWord;
    JButton button;
    JTextField inputText,showScore;
    WordThread giveWord;//用WordThread声明一个giveWord线程象
    int score=0;
    ThreadFrame() {
        showWord = new JTextField(6);
        showWord.setFont(new Font("",Font.BOLD,72));
        showWord.setHorizontalAlignment(JTextField.CENTER );
      //【代码3】//创建giveWord线程
        giveWord=new WordThread();
        giveWord.setJTextField(showWord);
        giveWord.setSleepLength(5000);
        button=new JButton("开始");
        inputText = new JTextField(10);
        showScore = new JTextField(5);
        showScore.setEditable(false);
        button.addActionListener(this);
        inputText.addActionListener(this);
        add(button,BorderLayout.NORTH);
        add(showWord,BorderLayout.CENTER);
        JPanel southP=new JPanel();
        southP.add(new JLabel("输入汉字（回车）:"));
        southP.add(inputText);
        southP.add(showScore);
        add(southP,BorderLayout.SOUTH);
        setBounds(100,100,350,180);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            if(!(giveWord.isAlive())){
            //【代码4】//创建giveWord
                giveWord=new WordThread();
                giveWord.setJTextField(showWord);
                giveWord.setSleepLength(5000);
            }
            try {
              //giveWord调用方法start()
                giveWord.start();
            }
            catch(Exception exe){}
        }
        else if(e.getSource()==inputText) {
            if(inputText.getText().equals(showWord.getText()))
                score++;
            showScore.setText("得分:"+score);
            inputText.setText(null);
        }
    }
}
