package OOP;

public class Box {
    double width;     //Instance Variables
    double height;
    double depth;
    Box(double height,double width,double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    public void volume(){
        System.out.print("Volume is : ");
        System.out.print(height*width*depth+"\n");
    }
    public int area(int height,int depth,int width){
        int res=2*(height*width)+2*(width*depth)+2*(height*depth);
        return res;
    }

}
