package Collections.HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Temp,String> h=new Hashtable<>();
        h.put(new Temp(1),"Vasu");
        h.put(new Temp(20),"Goku");
        h.put(new Temp(3),"Vegeta");
        h.put(new Temp(4),"Saitama");
        h.put(new Temp(50),"Gohan");
        System.out.println(h);

    }
}
