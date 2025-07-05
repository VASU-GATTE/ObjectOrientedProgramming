package Assignments.June17;

import lombok.Data;

@Data
public class ATMSystem extends BankingAdapter{
    private int pin=9844;
    private double balance=100000.0;
    @Override
    public String Withdrawl(double wthamount) throws InvalidAmountException {
        if(wthamount<0 && wthamount%100!=0 && wthamount>balance){
            throw new InvalidAmountException("Invalid Amount! ");
        }else{
            balance-=wthamount;
            return "Withdrawal of Amount "+wthamount+" Successfully";
        }
    }
    @Override
    public String Deposit(double depAmount) throws InvalidAmountException{
        if(depAmount<0 && depAmount%100!=0 && depAmount>balance){
            throw new InvalidAmountException("Invalid Amount! ");
        }else {
            balance += depAmount;
            return "Deposit of Amount " + depAmount + " Successfully";
        }
    }
    @Override
    public void checkBalance(){
        System.out.println("Balance Amount : "+balance);
    }
}
