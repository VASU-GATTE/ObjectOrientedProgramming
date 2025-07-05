package OOP;

public class AreaOfRectangle {
    double length;
    double breadth;

    public void setDimensions(double l,double b){
        length=l;
        breadth=b;
    }
    public Double area(){
        return length*breadth;
    }
    public Double Perimeter(){
        return 2*(length+breadth);
    }
    public static void DisplayDetails(AreaOfRectangle ob){
        System.out.println("Area : "+ob.area());
        System.out.println("Perimeter : "+ob.Perimeter());
    }

    public static void main(String[] args) {
        AreaOfRectangle ob=new AreaOfRectangle();
        ob.setDimensions(20,30);
        ob.DisplayDetails(ob);
    }
}
