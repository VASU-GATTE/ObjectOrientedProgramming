package MultiThreading;

public class Test2 {
    public static void main(String[] args) {
        Myclass m=new Myclass();
        Thread th=new Thread(m);
        th.start();
        try{
            th.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Parent Class "+i);
        }
        System.out.println(th.getThreadGroup());
    }
}
