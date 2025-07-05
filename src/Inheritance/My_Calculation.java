package Inheritance;

public class My_Calculation extends Calculation{
    public My_Calculation(int num1, int num2) {
        super(num1,num2);
    }

    int Multipliction(){
        return super.num1*super.num2;
    }
}
