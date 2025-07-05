package Collections.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<Person,String> m=new HashMap<>();
        m.put(new Person(101,"Vasu","vasugatte8@gmail.com"),"Vasu");
        m.put(new Person(102,"Luffy","luffy@gmail.com"),"JoyBoy");
        m.put(new Person(103,"Zoro","zoro@gmail.com"),"King of Hell");
        m.put(new Person(104,"Chopper","chopper@gmail.com"),"Emergency food");
        m.put(new Person(105,"Loki","loki@gmail.com"),"Giant");

        for (Map.Entry<Person,String> p:m.entrySet()){
            System.out.println(p.getKey()+"----->\t\t"+p.getValue());
        }
        System.out.println("\n\n");
        System.out.println("=====================================================================");
        System.out.println("==========================LinkedHashMap==============================");
        System.out.println("=====================================================================\n\n");

        Map<Person,String> m2 =new LinkedHashMap<>();
        m2.put(new Person(101,"Vasu","vasugatte8@gmail.com"),"Vasu");
        m2.put(new Person(102,"Luffy","luffy@gmail.com"),"JoyBoy");
        m2.put(new Person(103,"Zoro","zoro@gmail.com"),"King of Hell");
        m2.put(new Person(104,"Chopper","chopper@gmail.com"),"Emergency food");
        m2.put(new Person(105,"Loki","loki@gmail.com"),"Giant");

        for (Map.Entry<Person,String> p:m2.entrySet()){
            System.out.println(p.getKey()+"----->\t\t"+p.getValue());
        }

        System.out.println("\n\n");
        System.out.println("=====================================================================");
        System.out.println("==============================TreeMap================================");
        System.out.println("=====================================================================\n\n");


        Map<Person,String> m3 =new TreeMap<>(new PersonComparator());
        m3.put(new Person(101,"Vasu","vasugatte8@gmail.com"),"Vasu");
        m3.put(new Person(102,"Luffy","luffy@gmail.com"),"JoyBoy");
        m3.put(new Person(103,"Zoro","zoro@gmail.com"),"King of Hell");
        m3.put(new Person(104,"Chopper","chopper@gmail.com"),"Emergency food");
        m3.put(new Person(105,"Loki","loki@gmail.com"),"Giant");

        for (Map.Entry<Person,String> p:m3.entrySet()){
            System.out.println(p.getKey()+"----->\t\t"+p.getValue());
        }

        System.out.println("\n\n");
        System.out.println("=====================================================================");
        System.out.println("=================TreeMap(Using lambda functions)=====================");
        System.out.println("=====================================================================\n\n");

        Map<Person,String> m4 =new TreeMap<>((s1,s2)->Integer.compare(s1.id,s2.id));
        m4.put(new Person(101,"Vasu","vasugatte8@gmail.com"),"Vasu");
        m4.put(new Person(102,"Luffy","luffy@gmail.com"),"JoyBoy");
        m4.put(new Person(103,"Zoro","zoro@gmail.com"),"King of Hell");
        m4.put(new Person(104,"Chopper","chopper@gmail.com"),"Emergency food");
        m4.put(new Person(105,"Loki","loki@gmail.com"),"Giant");

        for (Map.Entry<Person,String> p: m4.entrySet()) {
            System.out.println(p.getKey() + "----->\t\t" + p.getValue());
        }


    }
}
