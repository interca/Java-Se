package homework7;

import java.net.*;
import java.io.*;
public class ServerImage
{
    public static void main(String args[]) {
        DatagramPacket pack=null;
        DatagramSocket mailReceive=null;


        byte b[]=new byte[8192];
        InetAddress clientAddress=null;
        int clientPort=0;
        pack=new DatagramPacket(b,b.length);

        try{
            mailReceive= new DatagramSocket(1234);
        }
        catch(IOException e1) {
            System.out.println("创建DatagramSocket失败");
            System.exit(1);
        }
        while(true) {

            try{

                mailReceive.receive(pack);
                clientAddress=pack.getAddress();
                clientPort=pack.getPort();

                System.out.println("客户的地址:"+clientAddress );
                System.out.println("客户的端口号:"+clientPort);
            }
            catch (IOException e) {}
            if(clientAddress!=null) {
                new ServerThread(clientAddress,clientPort).start();
            }
        }
    }
}

class ServerThread extends Thread {
    InetAddress address;
    int port;
    DataOutputStream out=null;
    DataInputStream  in=null;
    String s=null;
    ServerThread(InetAddress address,int port) {
        this.address=address;
        this.port = port;
    }
    public void run() {
        FileInputStream in;
        DatagramSocket mailSend=null;
        byte b[]=new byte[8192];
        try{
            mailSend =new DatagramSocket();
            in=new  FileInputStream ("C:\\Users\\waili\\Desktop\\Java code of idea\\Homework\\src\\homework7\\a.JPG");
            int n=-1;
            //int count=0;
            while((n=in.read(b))!=-1) {
                DatagramPacket data=new DatagramPacket(b,n,address,port);
                mailSend.send(data);
                Thread.sleep(50);
            }

            in.close();
            byte end[]="end".getBytes();
            DatagramPacket data=new DatagramPacket(end,end.length,address,port);
            mailSend.send(data);
            mailSend.close();
        }
        catch(Exception e){}
    }
}

