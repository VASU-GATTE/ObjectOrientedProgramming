package Serialization;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVExample {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person(101,"Vasu","vasu@gmail.com"));
        people.add(new Person(102,"Sai","sai@gmail.com"));
        people.add(new Person(103,"Kethan","kethan@gmail.com"));
        people.add(new Person(104,"Sasi","sasi@gmail.com"));

        try(PrintWriter pw=new PrintWriter("People.csv")){
            pw.print("id,name,email");
            pw.println();
            for(Person p:people){
                pw.println(p.toCSV());
            }
            System.out.println("Data is Written to the File Successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
