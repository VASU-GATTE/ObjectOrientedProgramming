package Serialization;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPFinder {
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getLocalHost();
            System.out.println("Ip Address : "+address.getHostAddress()+"\nName : "+address.getCanonicalHostName());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
