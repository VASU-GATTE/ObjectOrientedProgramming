package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();          //Here, Integer is a Generic
        a.add(10);
        a.add(20);
        a.add(30);
        //a.add(new Integer(20));
        a.add(null);
        a.add(null);
        //a.add("Vasu");
        System.out.println(a);


        List<Student> student=new ArrayList<>();
        student.add(new Student("Vasu",101));
        student.add(new Student("Narasimha",102));
        student.add(new Student("Kethan",103));
        student.add(new Student("Goku",104));
        System.out.println(student);
        student.remove(new Student("Goku",104));
        System.out.println(student);
        student.set(0,new Student("Vasu krishna",101));
        System.out.println(student.getFirst());
        System.out.println(student.getLast()+"\n\n");


        Stack<Student> s=new Stack<>();
        s.push(new Student("Vasu",101));
        s.push(new Student("Krishna",102));
        s.push(new Student("Kethan",103));
        System.out.println(s);
        s.pop();
        System.out.println(s+"\n\n");
        System.out.println(s.search(new Student("Vasu",101)));
        System.out.println("\n\n"+s.peek());
    }
}
