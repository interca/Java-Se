package internIo;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP网络编程
public class UDP1 {
    @Test
    //发送端
    public void sent(){
        DatagramSocket socket=null;
        InetAddress inetAddress=null;
        try {
            socket=new DatagramSocket();
            String str="你好啊";
            byte[]b=str.getBytes();
            inetAddress=InetAddress.getLocalHost();
            //指明IP和端口号
            DatagramPacket packet=new DatagramPacket(b,0,b.length,inetAddress,9090);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket!=null)
                socket.close();
        }

    }

    @Test
    //接受端
    public void receive() {
        DatagramSocket socket=null;
        try {
            socket=new DatagramSocket(9090);
            byte[] b=new byte[100];
            DatagramPacket packet=new DatagramPacket(b,0,b.length);
            socket.receive(packet);
            System.out.println(new String(packet.getData(),0,packet.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket!=null)
                socket.close();
        }
    }
}
