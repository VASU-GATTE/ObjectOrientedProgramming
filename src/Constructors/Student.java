package Constructors;

public class Student {
    String name;
    int rollNumber;
    int[] marks;

    Student(){                         //Default Constructor
        this.name="Unknown";
        this.rollNumber=0;
        this.marks=new int[]{96,89,79};
    }
    Student(String name,int rollNumber,int[] marks){   //Parameterized Constructor
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=new int[3];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=marks[i];
        }
    }
    public void displayDetails(){
        System.out.println("Name : "+name+"\nRollNumber : "+rollNumber+"\nMarks : \nSubject1:"+marks[0]+
                "\nSubject2 : "+marks[1]+"\nSubject3 : "+marks[2]);
    }
    public double calculateTotal(){
        int total=0;
        for (int num:marks){
            total+=num;
        }
        return total;
    }
    public double calculateAverage(){
        return (calculateTotal())/marks.length;
    }
}
class StudentDetails{
    public static void main(String[] args) {
        Student ob=new Student();
        Student ob2=new Student(ob.name, ob.rollNumber, ob.marks);
        ob.displayDetails();
        System.out.println("Total : "+ob.calculateTotal());
        System.out.println("Average : "+ob.calculateAverage());
    }
}
