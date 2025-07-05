package Assignments.June17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidAmountException {
        double wthAmount;
        int attempts=3,choice,inputPin;
        boolean authenticated=false;
        Scanner sc=new Scanner(System.in);
        ATMSystem ob=new ATMSystem();
        while(attempts>0){
            System.out.println("Enter Pin : ");
            inputPin=sc.nextInt();
            if(inputPin==ob.getPin()){
                authenticated=true;
                break;
            }else{
                attempts--;
                System.out.println("Incorrect PIN. Attempts Left : "+attempts);
                if(attempts==0){
                    throw new InvalidPinException("Maximum Attempts Reached! Your Account has been Blocked for 24 hours ");
                }
            }
        }
                if(authenticated) {
                    do {
                        System.out.println("================State Bank of India===========");
                        System.out.println("1.Withdraw\n2.Deposit\n3.CheckBalance\n4.Exit");
                        System.out.println("Enter Your Choice : ");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter Withdrawal Amount : ");
                                wthAmount = sc.nextDouble();
                                System.out.println(ob.Withdrawl(wthAmount));
                                continue;
                            case 2:
                                System.out.println("Enter Deposit Amount : ");
                                double depAmount = sc.nextDouble();
                                System.out.println(ob.Deposit(depAmount));
                                continue;
                            case 3:
                                ob.checkBalance();
                                continue;
                            case 4:
                                System.out.println("Thank You for banking with Us. Have a good Day ");
                                break;
                        }
                    } while (choice != 4);
                }
        }
    }