package Socket_Programming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HostIPFinder {
    public static void main(String[] args) throws IOException {
        String name;
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner br=new Scanner(System.in);
        System.out.println("Enter Host Name : ");
        name=br.nextLine();
        try {
            InetAddress address = InetAddress.getByName(name);
            System.out.println("IP of Host : " + address);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

//        Socket link=new Socket(InetAddress.getByName("LocalHost"),1234);
//        System.out.println(link);

    }
}
