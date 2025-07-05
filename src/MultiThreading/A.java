package MultiThreading;

public class A {
    public synchronized void meth(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this){
                System.out.println("Nothing");
            }
        }
    }
}
