package Help;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main(String args[]) {
        ServerSocket server=null;
        ServerThread thread;
        Socket you=null;
        try{
            server=new ServerSocket(4331);//【代码3】//创建在端口4331上负责监听的 ServerSocket对象
        }
        catch(IOException e1)
        {
            System.out.println("创建ServerSocket失败");
            System.exit(1);
        }
        while(true) {

            try{
                System.out.println("等待客户端连接:\n");
                you= server.accept(); //【代码4】 // server调用accept()返回和客户端相连接的Socket对象
                        System.out.println("客户的地址:"+you.getInetAddress());
            }
            catch (IOException e)
            {
                System.out.println("正在等待客户");
            }
            if(you!=null)
            {
                new ServerThread(you).start();
            }
            else
            {  continue;
            }
        }
    }
}
class ServerThread extends Thread {
    Socket socket;
    ObjectInputStream in=null;
    ObjectOutputStream out=null;
    JFrame window;
    JTextArea text;
    ServerThread(Socket t) {
        socket=t;
        try  { out=new ObjectOutputStream(socket.getOutputStream());
            in=new ObjectInputStream(socket.getInputStream());
        }
        catch (IOException e) {}
        window =new JFrame();
        text = new JTextArea();
        for(int i=1;i<=20;i++) {
            text.append("你好,我是服务器上的文本区组件\n");
        }
        text.setBackground(Color.yellow);
        window.add(text);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void run() {
        try{  out.writeObject(window);
        }
        catch (IOException e) {
            System.out.println("客户离开");
        }
    }
}
