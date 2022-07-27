package homework7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
class ImageCanvas extends Canvas {
    Image image=null;
    public ImageCanvas() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        if(image!=null)
            g.drawImage(image,0,0,this);
    }
    public void setImage(Image image) {
        this.image=image;
    }
}
public class ClientGetImage extends JFrame implements ActionListener {
    JButton b=new JButton("获取图像");
    ImageCanvas canvas;
    DatagramSocket mail=null;
    ClientGetImage() {
        super("I am a client");
        setSize(1027,1000);
        setVisible(true);
        b.addActionListener(this);
        add(b,BorderLayout.NORTH);
        canvas=new ImageCanvas();
        this.getContentPane().add(canvas,BorderLayout.CENTER);

        // validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public void actionPerformed(ActionEvent event) {
        byte b[]="请发图像".trim().getBytes();
        try{
            InetAddress address=InetAddress.getByName("127.0.0.1");
            DatagramPacket data=new DatagramPacket(b,0,b.length,address,1234);
                   //创建数据包data，该数据包的目标地址和端口分别是
                    //address和1234，其中的数据为数组b中的全部字节。
                    mail=new DatagramSocket();//创建负责发送数据的mailSend对象。
                             mail.send(data);//mail发送数据data。
                            DatagramPacket pack=null;
            //DatagramSocket mailReceive =null;
            byte img[]=new byte[8192];
            ByteArrayOutputStream out=new ByteArrayOutputStream();
            pack=new DatagramPacket(img,img.length);



            try
            {
                while(true)
                {
                    mail.receive(pack);
                    String message=new String(pack.getData(),0,pack.getLength());
                    if(message.startsWith("end"))
                    {

                        break;
                    }
                    out.write(pack.getData(),0,pack.getLength());
                    //System.out.println(pack.getLength());
                }
                byte imagebyte[]=out.toByteArray();
                //System.out.println(imagebyte.length);
                out.close();
                Toolkit tool=getToolkit();
                Image image=tool.createImage(imagebyte);
                canvas.setImage(image);

                this.revalidate();
                canvas.repaint();

            }
            catch(IOException e){ }
        }
        catch(Exception e){}
    }

    public static void main(String args[]) {
        new ClientGetImage();
    }
}

