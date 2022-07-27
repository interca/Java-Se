package internIo;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress类
public class InetAddresstest1 {
    public static void main(String[] args)  {
        try {
            //IP
            InetAddress address=InetAddress.getByName("196.168.10.14");
            System.out.println(address);
            //简写为域名
            InetAddress address1=InetAddress.getByName("www.mi.com");
            System.out.println(address1);
            //本地
            InetAddress address2=InetAddress.getByName("127.0.0.1");
            System.out.println(address2);
            //获取本地地址
            InetAddress address3=InetAddress.getLocalHost();
            System.out.println(address3);
            System.out.println(address1.getHostName());
            System.out.println(address1.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
