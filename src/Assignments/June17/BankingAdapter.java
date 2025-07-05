package Assignments.June17;

public abstract class BankingAdapter implements Banking{
    @Override
    public String Withdrawl(double amount) throws InvalidAmountException {
        return "";
    }

    @Override
    public String Deposit(double amount) throws InvalidAmountException {
        return "";
    }

    @Override
    public void checkBalance() {

    }
}
