package Assignments.June17;

public interface Banking {
    String Withdrawl(double amount) throws InvalidAmountException;
    String Deposit(double amount) throws InvalidAmountException;
    void checkBalance();
}
