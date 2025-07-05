package Exception_Handling;

public class MarriageEligibilityChecker {
    public static void eligibleChecker(int age){
        if(age<18){
            throw new TooYoungException("Your age is not qualified to ref=o");
        }else{
            if (age>60){
                throw new TooOldException("Marriage cannot be approved your age is above 60");
            }else{
                System.out.println("Details are processing you will get best match through ");
            }
        }
    }

    public static void main(String[] args) {
        MarriageEligibilityChecker checker=new MarriageEligibilityChecker();
        try{
            checker.eligibleChecker(16);
        }catch (TooYoungException|TooOldException e){
            e.printStackTrace();
        }
    }
}
