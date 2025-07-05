package Constructors;

public class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.err.println("Constructor Called....");
        width=20;
        height=30;
        depth=20;
    }
    Box(double width,double height,double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    Box(Box b3){
        width=this.width;
        height=this.height;
        depth=this.depth;
    }
    public double volume(){
        return width*height*depth;
    }

    public static void main(String[] args) {
        Box b1=new Box();
        System.out.println(b1.depth+b1.width+b1.height);
        Box b2=new Box(10,20,30);     //Paramterized Constructor
        Box b3=new Box(b1);                              //
    }
}
