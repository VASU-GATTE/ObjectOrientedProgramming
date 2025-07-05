package Polymorphism;

public class BankAccountSystem {
    double balance;
    BankAccountSystem(double balance){
        this.balance=balance;
    }
    public void Deposit(double Amount){
        balance+=Amount;
        System.out.println("Deposited in Cash : "+Amount);
    }
    public void Deposit(String chequeNo,double Amount){
        balance+=Amount;
        System.out.println("\nDeposited : "+Amount+" via Cheque");
        System.out.println("\nBalance : "+balance+"\tDeposited Using This Cheque : "+chequeNo);
    }
    public void Deposit(double Amount,String id,String bankName){
        balance+=Amount;
        System.out.println("\nDeposited "+Amount+" Via Online");
        System.out.println("\nAmount "+Amount+"\tWith "+id+"\tbank "+bankName);
    }
    public void showBalance(){
        if(balance>100000) {
            System.out.println("\nAvaliable Balance : " + balance);
        }else{
            System.err.println("\nAvaliable Balance : "+balance);
        }
    }
}
