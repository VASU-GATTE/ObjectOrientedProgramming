package LambdaOperations.InnerClasses;

class InnerClasses {
    class Inner2{
        void show(){
            System.out.println("Hello");
        }
    }
}

public class Outer{
    public static void main(String[] args) {
        InnerClasses i=new InnerClasses();
        InnerClasses.Inner2 i1=i.new Inner2();
        i1.show();
    }
}