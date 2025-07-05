package Exception_Handling;

public class Test {
    public static void main(String[] args) throws ArithmeticException {
        int[] a={1,2,3,1,2};
        String text=null;
        try {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            try{
                System.out.println("Statement 6");
                System.out.println("Statement 7");
            } catch (Exception e) {
                System.out.println("Statement 8");
            }finally {
                System.out.println("Statement 9");
            }
            System.out.println("Statement 3");
        }catch (Exception e){
            System.out.println("Statement 4");
        }
        finally{
            System.out.println("Statement 5");
        }
    }
}
