package Socket_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
    private static ServerSocket ss;
    private static final int  port=1234;

    public static void main(String[] args) throws IOException {
        System.out.println("Opening Port.....\n");
        try{
            ss=new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Unable to Attach Port");
            System.exit(1);
        }
        do{
            handleClient();
        }while(true);
    }

    public static void handleClient() {
        Socket link = null;
        try{
            link=ss.accept();
            BufferedReader input=new BufferedReader(new InputStreamReader(link.getInputStream()));
            PrintWriter output=new PrintWriter(link.getOutputStream(),true);
            int numMess=0;
            String message=input.readLine();
            while(!message.equals("***CLOSE***")){
                System.out.println("Message Recieved");
                numMess++;
                output.println("Message"+numMess+" : "+message);
                message=input.readLine();
            }
            output.println(numMess+"Messages Received");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                System.out.println("Closing Connection....");
                link.close();
            } catch (IOException e) {
                throw new RuntimeException("Unable to Disconnect");
            }
        }
    }
}
