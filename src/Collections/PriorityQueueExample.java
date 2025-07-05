package Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Person> pq=new PriorityQueue<Person>(new PersonComparator());
        pq.offer(new Person(1,"B","Vasugatte8@gmail.com") );
        pq.offer(new Person(2,"A","") );
        pq.offer(new Person(3,"a","") );
        pq.offer(new Person(4,"V","") );
        pq.offer(new Person(5,"s","") );
        pq.offer(new Person(0,"AB","") );
        System.out.println(pq);
        for (Person e:pq){
            System.out.println(e);
        }
    }
}
