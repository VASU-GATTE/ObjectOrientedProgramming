package Serialization;

import java.io.*;

public class TransientDemo {
    public static void main(String[] args) {
        ATMCard originalCard=new ATMCard("14/25",123,"Vasu Krishna",459874566,7382);
        System.out.println("Original Card details : ");
        originalCard.cardDetails();
        System.out.println("Serialization Started");

        try(FileOutputStream fos=new FileOutputStream("AtmCard.ser");
                ObjectOutputStream ob=new ObjectOutputStream(fos)) {
            ob.writeObject(originalCard);
            System.out.println("Serialized card : "+originalCard);
            System.out.println("Serialization Ended....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("De-Serialization Started");
        try(FileInputStream fos=new FileInputStream("AtmCard.ser");
            ObjectInputStream ob=new ObjectInputStream(fos)) {
            ATMCard desCard=(ATMCard) ob.readObject();
            desCard.cardDetails();
            System.out.println("De-Serialized card : "+desCard);
            System.out.println("De-Serialization Ended....");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
