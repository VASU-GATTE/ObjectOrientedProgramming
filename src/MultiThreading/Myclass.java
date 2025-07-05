package MultiThreading;

public class Myclass implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(500);
                System.out.println("Child Thread "+i);
            }catch (InterruptedException e){
                e.printStackTrace();

            }

        }
    }

}
