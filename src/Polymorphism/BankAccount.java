package Polymorphism;

public class BankAccount {
    public static void main(String[] args) {
        BankAccountSystem ob=new BankAccountSystem(10000);
        ob.Deposit(5000);
        ob.Deposit("56004fh",30000);
        ob.Deposit(40000,"rtr948720","SBI");
        ob.showBalance();
    }
}
