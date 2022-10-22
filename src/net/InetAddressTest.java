package net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress1.getHostAddress());
            System.out.println(inetAddress1.isReachable(5000));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
