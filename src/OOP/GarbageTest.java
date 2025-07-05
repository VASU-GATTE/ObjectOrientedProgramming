package OOP;

import java.io.PrintStream;

public class GarbageTest {
    protected void finalize(){
        System.out.println("Garbage Collector Calls Final Method....");
    }

    public static void main(String[] args) {
        GarbageTest obj=new GarbageTest();
        obj=null;
        System.gc();   // we are requesting to jvm to run by gc bu sing
        System.out.println("Requesting Garbage Collection....");
        System.out.println("end of the Method..");
    }
}
