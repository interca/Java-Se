package internIo;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//实现服务端给客户端反馈
public class TCP3 {
    @Test
    public void client(){
        Socket soc= null;
        OutputStream p1= null;
        FileInputStream p2= null;
        ByteArrayOutputStream str=null;
        try {
            soc = new Socket(InetAddress.getByName("127.0.0.1"),1990);
            p1 = soc.getOutputStream();
            p2 = new FileInputStream(new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\photo_2022-02-07_21-50-14.jpg"));
            byte[]b=new byte[10];
            int len;
            while((len=p2.read(b))!=-1){
                p1.write(b,0,len);
            }
            soc.shutdownOutput();
            InputStream inputStream=soc.getInputStream();
            str=new ByteArrayOutputStream();
            byte[]w=new byte[20];
            while((len=inputStream.read(w))!=-1){
                str.write(w,0,len);
            }
            System.out.println(str.toString());
            while((len=p2.read(b))!=-1){
                p1.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(soc!=null)
                    soc.close();
                if(p1!=null)
                    p1.close();
                if(p2!=null)
                    p2.close();
                if(str!=null)
                    str.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void service(){
        ServerSocket p1=null;
        Socket socket=null;
        InputStream p2=null;
        OutputStream outputStream=null;
        try {
            p1=new ServerSocket(1990);
            socket=p1.accept();
            p2=socket.getInputStream();
            //将文件存起来
            FileOutputStream str1=new FileOutputStream(new File("C:\\Users\\waili\\Desktop\\Java code of idea\\iofile\\nihao.jpg"));
            byte[]b=new byte[10];
            int len;
            while((len=p2.read(b))!=-1){
                str1.write(b,0,len);
            }
            //反馈回去
            outputStream=socket.getOutputStream();
            outputStream.write("我已经收到，谢谢".getBytes());
            while((len=p2.read(b))!=-1){
                str1.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(p1!=null)
                    p1.close();
                if(socket!=null)
                    socket.close();
                if(p2!=null)
                    p2.close();
                if(outputStream!=null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
