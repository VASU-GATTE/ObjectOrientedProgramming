package MultiThreading;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());     //will get the output as main bcz of default thread is always main
        Myclass m=new Myclass();
        Thread th=new Thread(m);
        Thread th1=new Thread(m);
        System.out.println(th.getName());
        th.setName("Vasu");                                       //Setting a name for a thread.
        System.out.println(th.getName());
        th.setPriority(10);
        System.out.println(th.getName()+" "+th.getPriority());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        System.out.println("Increasing the Thread "+Thread.currentThread().getName()+" Priority");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getPriority());
        th.currentThread().yield();
        System.out.println(th1.getPriority());

    }
}
