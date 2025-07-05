package LambdaOperations;

class MyRunnable {

        public static void main(String[] args) {
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Vasu");
                }
            });
            t1.start();
            for (int i = 0; i < 5; i++) {
                System.out.println("Krishna");
            }
        }
}
