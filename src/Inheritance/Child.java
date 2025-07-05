package Inheritance;

public class Child  extends Parent{
    void methodtwo(){
        super.methodOne();
        System.out.println("This is Child Class");
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.methodtwo();
//
//        Parent p2=new Child();
//        p2.methodOne();
        // p2.methodtwo();   This is an error

        // Child c2= new Parent();    This is an Error
    }
}
