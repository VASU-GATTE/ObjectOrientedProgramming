package IOStreams;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String filepath="C:\\Users\\vasug\\OneDrive\\Desktop\\Jfs28.txt";
        String content="Welcome to Java Programming\n"+
                "\tIt was developed by James Gosling in 1995\n"+
                "\tIt was a Powerful Language";

        try (BufferedOutputStream b=new BufferedOutputStream(new FileOutputStream(filepath))){
            byte[] bytes=content.getBytes();
            b.write(bytes);
            b.flush();
            System.out.println("File Created SuccessFully.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

