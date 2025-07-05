package Polymorphism;

public class Box {
    double width,height,depth;

    public Box(double height,double width,double depth){
        this.height=height;
        this.depth=depth;
        this.width=width;
    }
    public Box(){
        width=-1;
        height=-2;
        depth=-3;
    }
    public Box(double length){
        width=height=depth=length;
    }
    public double Volume(){
        return width*height*depth;
    }

}
