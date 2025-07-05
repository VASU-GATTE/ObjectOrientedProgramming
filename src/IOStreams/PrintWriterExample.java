package IOStreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        try(PrintWriter pw=new PrintWriter("Output.txt")){
            pw.write(100);
            pw.print('a');
            pw.println("Hello this is a Message Written to a file..");
            pw.println("Hello Java programmers..\n You are the best developers in all programming languages..");
            pw.write("Hello Java programmers..\n You are the best developers in all programming languages..");
            pw.println("Hello Java programmers..\n You are the best developers in all programming languages..");
            pw.write("Vasu Krishna ");
            System.out.println("Data is Written to a file Output.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
