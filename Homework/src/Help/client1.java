package Help;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class client1 {
    public void client()  {
        Socket socket=null;
        OutputStream outputStream=null;
        try {
            Scanner in = new Scanner(System.in);
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 1990);
            outputStream = socket.getOutputStream();
            System.out.println("输入选择 1-文件名，2-文件大小，3-文件内容");
            int choice = in.nextInt();
            String s = "";
            switch (choice) {
                case 1:
                    s = "文件名";
                    break;
                case 2:
                    s = "文件大小";
                    break;
                case 3:
                    s = "文件内容";
                    break;
            }
            System.out.println("输入传输内容");
            String s1 = in.next();
            s=s+s1;
            outputStream.write(s.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStream!=null)
                outputStream.close();
                if(socket!=null)
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

            }
        }
    }
    public static void main(String[] args)  {
         client1 c=new client1();
             while(true)
             c.client();
    }
}
