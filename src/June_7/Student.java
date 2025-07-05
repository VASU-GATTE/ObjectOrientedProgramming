package June_7;

import java.util.Objects;

public class Student {
    String name;
    int rollNo;

    public Student(String name,int rollNo) {
        super();
        this.name = name;
        this.rollNo=rollNo;
    }
//    public boolean equals(Object obj){
//        if(obj instanceof Student){
//            return true;
//        }
//        String name1=this.name;
//        int rollNo1=this.rollNo;
//        Student s2=(Student)obj;
//        String name2=s2.name;
//        int rollNo2=s2.rollNo;
//        if(name1.equals(name2) && rollNo1==rollNo2) {
//            return true;
//        }else{
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    public static void main(String[] args){
        Student s1=new Student("Vasu",101);
        Student s2=new Student("Kethan",102);
        Student s3=new Student("Vasu",101);
        Student s4=s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals("Vasu"));
        System.out.println(s1.equals(null));
    }
}
