package Serialization;

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args) {
        String filepath="emp.ser";

        Employee emp=new Employee(1,"Vasu",100000,"Vij");
        System.out.println("Employee Details Before Serialization ");
        emp.DisplayDetails();

        try(FileOutputStream fos=new FileOutputStream(filepath);
            ObjectOutputStream oos=new ObjectOutputStream(fos)){
            oos.writeObject(emp);
            System.out.println("Serialized Employee Object : "+emp);
            System.out.println("Serialization Ended..");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("===================Deserialization Started==============================");
        try(FileInputStream fis=new FileInputStream(filepath);
        ObjectInputStream ois=new ObjectInputStream(fis)){
            Employee emp2=(Employee)ois.readObject();
            System.out.println("De-serialization Employee Object : "+emp2);
            System.out.println("Serilization Ended.....");
        } catch (FileNotFoundException|ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
