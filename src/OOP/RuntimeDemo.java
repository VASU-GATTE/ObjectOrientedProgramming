package OOP;

import java.util.Date;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        System.out.print("Total Memory of The Heap : \n"+runtime.totalMemory());
        System.out.print("Free Memory on Heap : \n"+runtime.freeMemory());
        for (int i = 0; i < 10; i++) {
            Date d=new Date();
            d=null;
        }
        System.out.println("Free memory of the heap after ");


    }
}
