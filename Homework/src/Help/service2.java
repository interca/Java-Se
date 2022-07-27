package Help;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class service2 {
    public void service(){
        ByteArrayOutputStream str=null;
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream inputStream=null;
        try {
            serverSocket=new ServerSocket(1990);
             socket=serverSocket.accept();
            inputStream=socket.getInputStream();
            byte[] b=new byte[10];
            String s="";
            int len;
            str=new ByteArrayOutputStream();
            while((len=inputStream.read(b))!=-1){
                str.write(b,0,len);
            }
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(serverSocket!=null)
                serverSocket.close();
                if(socket!=null)
                    socket.close();
                if(inputStream!=null)
                    inputStream.close();
                if(str!=null)str.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
      service2 s=new service2();
       while(true){
           s.service();
       }
    }
}
