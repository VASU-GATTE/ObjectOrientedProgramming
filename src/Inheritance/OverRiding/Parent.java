package Inheritance.OverRiding;

class Parent {
    void Property(){
        System.out.println("Cash / Gold / Land");
    }
    void Extra(){
        System.out.println("Education");
    }
}
class Child extends Parent{
    @Override
    public void Property(){
        super.Property();
        System.out.println("cash / Gold / Land / Company ");
    }

}
class OverRideDemo{
    public static void main(String[] args) {
        Child c=new Child();
        c.Property();
        c.Extra();
    }
}
