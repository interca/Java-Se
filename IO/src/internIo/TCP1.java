package internIo;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//TCP网络编程
public class  TCP1 {
    //客户端
    @Test
    public void client()  {
        Scanner in=new Scanner(System.in);
        Socket socket= null;
        OutputStream outputStream= null;
        int size=4;
        try {
            InetAddress inetAddress=InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,8899);
            outputStream = socket.getOutputStream();
            while((size--)>0)
            {
                String s="nihao";
                outputStream.write(s.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if(outputStream!=null)
                outputStream.close();
                if(socket!=null)
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //服务端
    @Test
    public void server(){
        ServerSocket socket= null;
        InputStream inputStream= null;
        ByteArrayOutputStream brs= null;
        Socket socket1=null;
        try {
            socket = new ServerSocket(8899);
            socket1=socket.accept();
            inputStream = socket1.getInputStream();
            brs = new ByteArrayOutputStream();
            byte []b=new byte[5];
            int len;
            while((len=inputStream.read(b))!=-1){
                brs.write(b,0,len);
            }
            System.out.println(brs.toString());
            System.out.println("收到了信息来自:"+socket1.getInetAddress().getHostAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket!=null)
                    socket.close();
                if(inputStream!=null)
                    inputStream.close();
                if(brs!=null)
                    brs.close();
                if(socket1!=null){
                    socket1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
       TCP1 p=new TCP1();
       p.server();

    }
}
class test{
    public static void main(String[] args) {
        TCP1 p=new TCP1();
        p.client();
    }
}
