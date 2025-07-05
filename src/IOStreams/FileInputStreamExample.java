package IOStreams;

import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args){
        String filepath="jfs28fos.txt";

        try(FileInputStream fin=new FileInputStream(filepath)) {
            int byteData;
            while((byteData=fin.read())!=-1){
                System.out.print((char)byteData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(filepath))) {
            int byteData;
            while((byteData=bis.read())!=-1){
                System.out.print((char)byteData);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
