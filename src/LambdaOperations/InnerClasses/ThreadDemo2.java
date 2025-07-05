package LambdaOperations.InnerClasses;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t=new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread : "+i);
            }
        });
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Parent Thread : "+i);
        }

    }
}
