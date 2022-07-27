package internIo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP4 {
    @Test
    public void client(){
        Socket socket=null;
        OutputStream p=null;
        InputStream p2=null;
        ByteArrayOutputStream str=null;
        try {
            socket=new Socket(InetAddress.getByName("127.0.0.1"),1990);
            p=socket.getOutputStream();
            p2=socket.getInputStream();
            p.write("信息1".getBytes());
            socket.shutdownInput();
            str=new ByteArrayOutputStream();
            byte[]b=new byte[10];
            int len;
            while((len=p2.read(b))!=-1){
                str.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(p!=null)
                p.close();
                if(socket!=null)
                socket.close();
                if(str!=null)
                str.close();
                if(p2!=null)
                p2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }


    @Test
    public void service(){
        ByteArrayOutputStream str= null;
        ServerSocket serverSocket=null;
        Socket socket=null;
        OutputStream outputStream=null;
        InputStream inputStream=null;
        try {
             serverSocket=new ServerSocket(1900);
             socket=serverSocket.accept();
            outputStream=socket.getOutputStream();
            inputStream=socket.getInputStream();
            str = new ByteArrayOutputStream();
            byte[]w=new byte[20];
            int len;
            while((len=inputStream.read(w))!=-1){
                str.write(w,0,len);
            }
            System.out.println(str.toString());
            byte[]b=new byte[10];
           outputStream.write("我已经收到".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                str.close();
                socket.close();
                serverSocket.close();
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }
}
