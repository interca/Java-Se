package internIo;

//客户端

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP5 {
    //客户端
    @Test
    public void client()  {
        Socket socket= null;
        OutputStream outputStream= null;
        ByteArrayOutputStream brs= null;
        InputStream inputStream=null;
        try {
            brs=new ByteArrayOutputStream();
            InetAddress inetAddress=InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,8899);
            outputStream = socket.getOutputStream();
                String s="nihao";
                outputStream.write(s.getBytes());
                socket.shutdownOutput();
                inputStream=socket.getInputStream();
                int len;
                byte[]w=new byte[20];
            while((len=inputStream.read(w))!=-1){
                brs.write(w,0,len);
            }
            System.out.println(brs.toString());
            ////
            outputStream.write(s.getBytes());
            //
            while((len=inputStream.read(w))!=-1){
                brs.write(w,0,len);
            }
            System.out.println(brs.toString());
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
        OutputStream outputStream=null;
        try {
            socket = new ServerSocket(8899);
            socket1=socket.accept();
            inputStream = socket1.getInputStream();
            brs = new ByteArrayOutputStream();
            outputStream=socket1.getOutputStream();
            byte []b=new byte[5];
            int len;
            while((len=inputStream.read(b))!=-1){
                brs.write(b,0,len);
            }
            System.out.println(brs.toString());
            System.out.println("收到了信息来自:"+socket1.getInetAddress().getHostAddress());
            outputStream.write("已经收到信息".getBytes());
            while((len=inputStream.read(b))!=-1){
                brs.write(b,0,len);
            }
            System.out.println(brs.toString()+"第二次你好");
            outputStream.write("第二次已经收到信息".getBytes());
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
                if(outputStream!=null){
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}