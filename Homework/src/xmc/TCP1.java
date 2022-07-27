package xmc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCP1 {
    //服务端
    public void service(){
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
             serverSocket=new ServerSocket(1001);
             socket=serverSocket.accept();
             inputStream=socket.getInputStream();
             outputStream=socket.getOutputStream();
            System.out.println("nnnn");
            byte[]b=new byte[20];
            int len;
            String s="";
            //从客户端接受消息
            while((len=inputStream.read(b))!=-1){
                s=s+new String(b,0,len);
            }
            String []num=s.split(" ");
            String account="";
            int k1=Integer.parseInt(num[0]);
            int k2=Integer.parseInt(num[1]);
            switch (num[2]){
                case "-":
                    account=(k1-k2)+"";
                    break;
                case "+":
                    account=(k1+k2)+"";
                    break;
                case "*":
                    account=(k1*k2)+"";
                    break;
                case "/":account=(k1/k2)+"";
                    break;
            }
            outputStream.write(account.getBytes());
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
                if(outputStream!=null)
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
       TCP1 p1=new TCP1();
       while(true){
           p1.service();
       }

    }
}
class TCP2{
    //客户端
    public void client(){
        InputStream inputStream=null;
        Socket socket=null;
        OutputStream outputStream=null;
        Scanner in=new Scanner(System.in);
        try {
            while(true) {
                socket = new Socket(InetAddress.getByName("127.0.0.1"), 1001);
                outputStream = socket.getOutputStream();
                String s = in.nextLine();//输入字符串
                //向服务端发送消息
                outputStream.write(s.getBytes());
                socket.shutdownOutput();
                String str = "";
                byte[] b = new byte[20];
                int len;
                //得到反馈
                inputStream = socket.getInputStream();
                while ((len = inputStream.read(b)) != -1) {
                    str = str + new String(b, 0, len);
                }
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStream!=null)
                outputStream.close();
                if(inputStream!=null)
                    inputStream.close();
                if(socket!=null)
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
      TCP2 p=new TCP2();
      p.client();

    }
}
