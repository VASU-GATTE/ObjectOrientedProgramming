package Interfaces;

public class SimplePasswordChecker implements PasswordChecker{
    @Override
    public void checkLength(String password){
        int len=password.length();
        System.out.println("Password Length : "+len);
    }
    @Override
    public void checkComplexity(String password){
        int len=password.length();
        if(len<8){
            System.out.println("Weak Password");
        }else {
            if(len==8){
                System.out.println("Medium Password");
            }else{
                System.out.println("Strong password");
            }
        }
    }

    public static void main(String[] args) {
        SimplePasswordChecker sp=new SimplePasswordChecker();
        String pass="Vasu@0606";
        sp.checkLength(pass);
        sp.checkComplexity(pass);
    }
}
