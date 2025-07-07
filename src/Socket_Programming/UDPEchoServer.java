package Socket_Programming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPEchoServer {
    private static final int port=1234;
    private static DatagramSocket datasoc;
    private static DatagramPacket inpack,outpack;
    private static byte[] buffer;

    public static void main(String[] args) {
        System.out.println("Opening Port.....\n");
        try{
            datasoc=new DatagramSocket(port);
        } catch (SocketException e) {
            System.out.println("Unable to Attach Port...");
            System.exit(1);
        }
        handleClient();
    }

    private static void handleClient() {
        String mesin,mesout;
        int numMes=0;
        do{
            buffer=new byte[256];
            inpack=new DatagramPacket(buffer,buffer.length);
            try {
                datasoc.receive(inpack);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            InetAddress cliaddr=inpack.getAddress();
            int cliport=inpack.getPort();
            mesin=new String(inpack.getData(),0,inpack.getLength());
            System.out.println("Message Received....");
            numMes++;
            mesout="Message"+numMes+" : "+mesin;
            outpack=new DatagramPacket(mesout.getBytes(),mesout.length(),cliaddr,cliport);
        }while (true);
    }
}
