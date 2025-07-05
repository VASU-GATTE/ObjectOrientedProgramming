package IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args){
        String filepath="C:\\Users\\vasug\\OneDrive\\Desktop\\jfs28fos.txt";
        String content="Writing a data using fileInputStream.\n"+"Hello World"+"package IOStreams;\n" +
                "\n" +
                "import java.io.FileNotFoundException;\n" +
                "import java.io.FileOutputStream;\n" +
                "import java.io.IOException;\n" +
                "\n" +
                "public class FileOutputStreamExample {\n" +
                "    public static void main(String[] args){\n" +
                "        String filepath=\"jfs28fos.txt\";\n" +
                "        String content=\"Writing a data using fileInputStream.\\n\"+\"Hello World\";\n" +
                "        try(FileOutputStream fos=new FileOutputStream(filepath)) {\n" +
                "            byte[] data=content.getBytes();\n" +
                "            fos.write(data);\n" +
                "            System.out.println(\"File created Successfully...\");\n" +
                "        } catch (FileNotFoundException e) {\n" +
                "            throw new RuntimeException(e);\n" +
                "        } catch (IOException e) {\n" +
                "            throw new RuntimeException(e);\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}\n";
        try(FileOutputStream fos=new FileOutputStream(filepath)) {
            byte[] data=content.getBytes();
            fos.write(data);
            System.out.println("File created Successfully...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
